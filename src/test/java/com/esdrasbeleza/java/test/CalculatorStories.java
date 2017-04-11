package com.esdrasbeleza.java.test;

import com.esdrasbeleza.java.Steps;
import com.esdrasbeleza.java.StoriesRunner;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(JUnitReportingRunner.class)
public class CalculatorStories extends StoriesRunner {

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(CodeLocations.codeLocationFromPath("src/test/resources"),
                "**/*.story",
                "**/exclude_*.story");
    }

	@Override
    public InjectableStepsFactory stepsFactory() {
        Steps.list.add(new CalculatorSteps());
		return new InstanceStepsFactory(configuration(), Steps.list.toArray());
	}
}
