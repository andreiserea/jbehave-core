package org.jbehave.core.steps;

import java.io.Serializable;

public class StepIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	private int exampleIndex, stepIndex, scenarioIndex, storyIndex;

	public StepIndex() {
	}

	public StepIndex(int exampleIndex, int stepIndex, int scenarioIndex, int storyIndex) {
		this.exampleIndex = exampleIndex;
		this.stepIndex = stepIndex;
		this.scenarioIndex = scenarioIndex;
		this.storyIndex = storyIndex;
	}

	public int getExampleIndex() {
		return exampleIndex;
	}

	public void setExampleIndex(int exampleIndex) {
		this.exampleIndex = exampleIndex;
	}
	
	public int getStepIndex() {
		return stepIndex;
	}

	public void setStepIndex(int stepIndex) {
		this.stepIndex = stepIndex;
	}
	
	public int getScenarioIndex() {
		return scenarioIndex;
	}
	
	public void setScenarioIndex(int scenarioIndex) {
		this.scenarioIndex = scenarioIndex;
	}

	public int getStoryIndex() {
		return storyIndex;
	}

	public void setStoryIndex(int storyIndex) {
		this.storyIndex = storyIndex;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + exampleIndex;
		result = prime * result + scenarioIndex;
		result = prime * result + stepIndex;
		result = prime * result + storyIndex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StepIndex other = (StepIndex) obj;
		if (exampleIndex != other.exampleIndex)
			return false;
		if (scenarioIndex != other.scenarioIndex)
			return false;
		if (stepIndex != other.stepIndex)
			return false;
		if (storyIndex != other.storyIndex)
			return false;
		return true;
	}

}
