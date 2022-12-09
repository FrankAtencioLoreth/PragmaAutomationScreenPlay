package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        tags = {"@LoginCorrecto"},
        glue = "stepDefinition",
        snippets = SnippetType.CAMELCASE
)
public class LoginRunner {

}
