package net.thucydides.core.webdriver;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;

public class PeriodicRestart {
    private final int restartFrequency;

    public PeriodicRestart(EnvironmentVariables environmentVariables) {
        this.restartFrequency = ThucydidesSystemProperty.THUCYDIDES_RESTART_BROWSER_FREQUENCY.integerFrom(environmentVariables, 0);

    }

    public boolean forTestNumber(int currentTestNumber) {
        return (restartFrequency == 0) || (currentTestNumber % restartFrequency) == 0;
    }
}
