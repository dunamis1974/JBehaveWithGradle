package com.esdrasbeleza.java.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

import com.esdrasbeleza.java.Calculator;
import com.esdrasbeleza.java.Medium;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Then;

public class CalculatorSteps {

	@BeforeStories
	public void beforeStories() {
        Medium.calculator = new Calculator();
    }
	
	@Then("the result is $number")
	public void assertResult(int number) {
		assertThat(Medium.result, equalTo(number));
	}
	
	@SuppressWarnings("unchecked")
	@Then("we get an error")
	public void assertException() {
		assertThat(Medium.exception, allOf(notNullValue(), instanceOf(ArithmeticException.class)));
	}
	
}
