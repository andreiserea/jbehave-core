package org.jbehave.core.steps;

import org.jbehave.core.embedder.StoryRunner;

public interface StepExecutor {

	public StoryRunner.State invoke(StoryRunner.State state, Step step);
}
