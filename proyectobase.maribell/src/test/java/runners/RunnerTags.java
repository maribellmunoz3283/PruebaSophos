package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/test.feature",
        tags = "@Regression",
        glue = {"stepdefinitions","util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

