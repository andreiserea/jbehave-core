package org.jbehave.core.embedder;

import org.jbehave.core.model.Scenario;

public interface ScenarioFilter {

	boolean allowed(Scenario scenario);
}
