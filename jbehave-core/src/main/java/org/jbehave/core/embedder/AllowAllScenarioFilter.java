package org.jbehave.core.embedder;

import org.jbehave.core.model.Scenario;

public class AllowAllScenarioFilter implements ScenarioFilter {

	public boolean allowed(Scenario scenario) {
		return true;
	}

	public String reason() {
		return null;
	}
	
}
