package com.cloudbees.rollout;

import io.rollout.configuration.RoxContainer;
import io.rollout.flags.RoxFlag;

public class FeatureContainer implements RoxContainer {
    public RoxFlag mySampleFlag = new RoxFlag(false);
    public RoxFlag myAnotherSampleFlag = new RoxFlag(true);
}

