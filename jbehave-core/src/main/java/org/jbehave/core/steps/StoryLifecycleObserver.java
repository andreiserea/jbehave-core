package org.jbehave.core.steps;

public interface StoryLifecycleObserver {

	public void beforeStoryExecution(Class<?> stepClass);
	public void afterStoryExecution(Class<?> stepClass);
}
