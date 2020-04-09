import com.cloudbees.rollout.FeatureContainer;
import io.rollout.rox.server.Rox;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FeatureContainerTest {

    FeatureContainer flags;

    @Before
    public void setup() {
        flags = new FeatureContainer();
        String envKey = System.getProperty("envKey", "5e85f93628de8e40325ae49b");
        Rox.setup(envKey);
        Rox.register("", flags);
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //It needs time
        System.out.println(flags.mySampleFlag.isEnabled());
    }

    @Test
    public void testFeatureFlag() throws InterruptedException {
        assert flags.mySampleFlag.isEnabled();
    }

}
