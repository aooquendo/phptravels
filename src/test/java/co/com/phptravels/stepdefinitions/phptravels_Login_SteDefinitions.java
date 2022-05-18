package co.com.phptravels.stepdefinitions;

import co.com.phptravels.steps.phptravels_Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class phptravels_Login_SteDefinitions {

    @Steps
    phptravels_Login_Page login;

    @Given("that i want to logint to the system")
    public void thatIWantToLogintToTheSystem() {
        login.openPhpLoginPage();
    }

    @When("i type my username {string}")
    public void iTypeMyUsername(String username) {
        login.setUsername(username);
    }

    @When("i type my password {string}")
    public void iTypeMyPassword(String password) {
        login.setPassword(password);
    }

    @Then("i should see the main menu after i clicked the login button")
    public void iShouldSeeTheMainMenuAfterIClickedTheLoginButton() {
        login.btnLogin();
    }
}
