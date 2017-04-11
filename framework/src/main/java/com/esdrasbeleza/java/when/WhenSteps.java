package com.esdrasbeleza.java.when;

import com.esdrasbeleza.java.Medium;
import org.jbehave.core.annotations.When;

public class WhenSteps {
    @When("we multiply it by $number")
    public void multiplyBy(int number) {
        Medium.result = Medium.calculator.multiply(Medium.number, number);
    }

    @When("we divide it by $number")
    public void divideBy(int number) {
        try {
            Medium.result = Medium.calculator.divide(Medium.number, number);
        }
        catch (ArithmeticException e) {
            Medium.exception = e;
        }
    }
}
