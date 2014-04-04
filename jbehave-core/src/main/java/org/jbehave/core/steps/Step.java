package org.jbehave.core.steps;

import java.lang.reflect.Method;
import java.util.List;

import org.jbehave.core.failures.UUIDExceptionWrapper;

/**
 * A Step represents a runnable portion of a Scenario, which matches methods annotated in {@link CandidateSteps} instances.
 */
public interface Step {

    Method method();
	
	StepResult perform(UUIDExceptionWrapper storyFailureIfItHappened);

    StepResult doNotPerform(UUIDExceptionWrapper storyFailureIfItHappened);
    
    String stepAsString();
    
    StepIndex index(List<String> storyPaths);
}
