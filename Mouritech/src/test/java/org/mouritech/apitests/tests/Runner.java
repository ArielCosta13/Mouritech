package org.mouritech.apitests.tests;


import com.intuit.karate.Results;
import org.junit.jupiter.api.Test;


public class Runner {

    @Test
    public void runTests() {
        Results results = com.intuit.karate.Runner.path("..")
                .outputCucumberJson(true)
                .karateEnv("demo")
                .parallel(2);
    }

}
