package org.mouritech.apitests.tests;

//Not Use, use the Runner class instead
//That is the accepted way to run Karate api tests

import com.intuit.karate.junit5.Karate;

class APITestRunner {

    @Karate.Test
    Karate apiTest() {
        return Karate.run("features/apiTest").relativeTo(getClass()); }

    @Karate.Test
    Karate errorTest() {
        return Karate.run("features/errorTest").relativeTo(getClass()); }

}