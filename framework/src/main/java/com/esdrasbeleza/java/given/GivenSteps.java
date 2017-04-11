package com.esdrasbeleza.java.given;

import com.esdrasbeleza.java.Medium;
import org.jbehave.core.annotations.Given;

/**
 * Created by bobby on 4/12/17.
 */
public class GivenSteps {

    @Given("a number $number")
    public void aNumber(int number) {
        Medium.number = number;
    }
}
