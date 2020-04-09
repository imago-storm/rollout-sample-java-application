import com.cloudbees.rollout.FeatureContainer;
import org.junit.Ignore;
import org.junit.Test;

public class FeatureContainerTest {
    @Test
    public void testFeatureFlag() {
        FeatureContainer flags = new FeatureContainer();
        assert flags.getMySampleFlag().isEnabled();
    }

    @Test
    @Ignore
    public void testAnotherFeatureFlag() {
        FeatureContainer flags = new FeatureContainer();
        assert flags.getMyAnotherSampleFlag().isEnabled();
    }
}
