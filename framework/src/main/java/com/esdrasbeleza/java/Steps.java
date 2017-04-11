package com.esdrasbeleza.java;

import com.esdrasbeleza.java.given.GivenSteps;
import com.esdrasbeleza.java.when.WhenSteps;

import java.util.ArrayList;
import java.util.Arrays;

public class Steps {
    public static ArrayList<Object> list = new ArrayList<>(Arrays.asList(new GivenSteps(), new WhenSteps()));
}
