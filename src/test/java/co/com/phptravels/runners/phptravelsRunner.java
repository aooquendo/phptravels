package co.com.phptravels.runners;

import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/phptravels_SignUp_Agent_Account.feature",
        glue = "co/com/phptravels/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class phptravelsRunner {
}
