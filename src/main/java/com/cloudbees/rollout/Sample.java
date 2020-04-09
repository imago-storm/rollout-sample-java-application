package com.cloudbees.rollout;

import io.rollout.rox.server.Rox;

public class Sample {
    public static void main(String[] args) {
        FeatureContainer flags = new FeatureContainer();

        // Register the flags container with Rollout
        Rox.register("", flags);

        // Setup the Rollout environment key
        Rox.setup("5e85bc9f889a1117029da4c3");
        System.out.println("mySampleFlag: ");
        System.out.println(flags.getMySampleFlag().isEnabled());
        System.out.println("myAnotherSampleFlag:");
        System.out.println(flags.getMyAnotherSampleFlag().isEnabled());
    }
}
