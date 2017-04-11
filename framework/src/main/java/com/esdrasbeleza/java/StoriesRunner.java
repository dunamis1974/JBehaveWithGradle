package com.esdrasbeleza.java;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

import java.util.List;

public class StoriesRunner  extends JUnitStories {
    protected List<String> storyPaths() {
        return null;
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withFormats(Format.XML, Format.IDE_CONSOLE, Format.CONSOLE, Format.HTML, Format.TXT)
		/*
		 *  The default output for the tests require is Maven's "target" folder,
		 *  since we're using Gradle we will set it to target/../build/jbehave
		 */
                        .withRelativeDirectory("../build/jbehave/"));
    }

}
