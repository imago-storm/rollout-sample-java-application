import com.cloudbees.rollout.FeatureContainer;
import org.junit.Test;

public class FeatureContainerTest {
    @Test
    public void testFeatureFlag() {
        FeatureContainer flags = new FeatureContainer();
        assert flags.getMySampleFlag().isEnabled();
    }

    @Test
    public void testAnotherFeatureFlag() {
        FeatureContainer flags = new FeatureContainer();
        assert flags.getMyAnotherSampleFlag().isEnabled();
    }
}
