package automation.qa.ui.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class UtlManageConfig {

    private static final Configuration CONFIGURATION =
            new SystemPropertiesConfiguration(SystemEnvironmentVariables.createEnvironmentVariables());
    private static final EnvironmentVariables environmentVariables =
            CONFIGURATION.getEnvironmentVariables();
    public static final String INICIO_PAGE =
            EnvironmentSpecificConfiguration.from(environmentVariables)
                    .getProperty("webdriver.base.url");
}
