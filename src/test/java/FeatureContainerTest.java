import com.cloudbees.rollout.FeatureContainer;
import io.rollout.rox.server.Rox;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FeatureContainerTest {

    FeatureContainer flags;
    private static boolean once = false;

    @Before
    public void setup() {
        if (once) {
            return;
        }
        flags = new FeatureContainer();
        String envKey = System.getProperty("envKey", "5e85f93628de8e40325ae49b");
        Rox.register("", flags);
        Rox.setup(envKey);
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //It needs time
        System.out.println(flags.mySampleFlag.isEnabled());
        once = true;
    }

    @Test
    public void testFeatureFlag() throws InterruptedException {
        assert flags.mySampleFlag.isEnabled();
    }

    @Test
    public void testProbabiltyFlag() {
        String env = System.getProperty("env", "QA");
        if (!env.equals("Production")) {
            return;
        }
        int trues = 0;
        for(int i = 0; i < 100; i++) {
            boolean value = flags.mySampleFlag.isEnabled();
            if (value) {
                trues++;
            }
        }
        System.out.println("Got true " + trues + " times");
        assert Math.abs(trues - 10) < 5;
    }
}
