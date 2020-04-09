package com.cloudbees.rollout;

import io.rollout.configuration.RoxContainer;
import io.rollout.flags.RoxFlag;
import lombok.Getter;

public class FeatureContainer implements RoxContainer {
    @Getter
    private RoxFlag mySampleFlag = new RoxFlag(false);
    @Getter
    private RoxFlag myAnotherSampleFlag = new RoxFlag(true);
}

