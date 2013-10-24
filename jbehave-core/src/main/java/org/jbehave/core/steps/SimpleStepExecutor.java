package org.jbehave.core.steps;

import org.jbehave.core.embedder.StoryRunner.State;

public class SimpleStepExecutor implements StepExecutor {

	public State invoke(State state, Step step) {
		return state.run(step);
	}

}
