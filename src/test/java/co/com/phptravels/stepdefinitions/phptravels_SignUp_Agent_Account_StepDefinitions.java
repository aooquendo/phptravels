package co.com.phptravels.stepdefinitions;

import co.com.phptravels.steps.phptravels_SignUp_Agent_Account_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class phptravels_SignUp_Agent_Account_StepDefinitions {
    @Steps
    phptravels_SignUp_Agent_Account_Page agentAccount;

    @Given("that i want to get an aggent account on phptravels")
    public void thatIWantToGetAnAggentAccountOnPhptravels() {
            agentAccount.openSignUpPage();
    }
    @When("i type my agent name {string}")
    public void iTypeMyAgentName(String name) {
        agentAccount.typeAgentName(name);
    }

    @When("i type my agent last name {string}")
    public void iTypeMyAgentLastName(String lastName) {
        agentAccount.typeAgentLastName(lastName);
    }

    @When("i type my agent number phone {string}")
    public void iTypeMyAgentNumberPhone(String number) {
        agentAccount.typeAgentNumber(number);
    }

    @When("i type my agent email {string}")
    public void iTypeMyAgentEmail(String email) {
        agentAccount.typeAgentEmail(email);
    }

    @When("i type my agent password {string}")
    public void iTypeMyAgentPassword(String pass) {
        agentAccount.typePassword(pass);
    }

    @When("i select my account type")
    public void iSelectMyAccountType() {
        agentAccount.selectAccountType();
    }

    @Then("i press the sigup button i should get my agent account")
    public void iPressTheSigupButtonIShouldGetMyAgentAccount() {
        agentAccount.clickSigUpButton();
    }


}
