package automation.qa.ui.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "not @ignore",
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"automation/qa/ui/steps"})

public class RunnerTestSuite {
}
