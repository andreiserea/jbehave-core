package org.jbehave.core.steps;

public interface StepLifecycleObserver {

	public void beforeStepExecution(Step step);
	public void afterStepExecution(Step step);
}
