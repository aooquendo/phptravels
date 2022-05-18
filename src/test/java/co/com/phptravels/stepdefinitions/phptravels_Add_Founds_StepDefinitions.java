package co.com.phptravels.stepdefinitions;

import co.com.phptravels.steps.phptravels_Add_Founds_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class phptravels_Add_Founds_StepDefinitions {
    @Steps
    phptravels_Add_Founds_Page addFounds;
    
    @Given("i want to add founds to my account i login to the system")
    public void iWantToAddFoundsToMyAccountILoginToTheSystem() {
       addFounds.openLoginPage();
    }

    @When("i type my user {string}")
    public void iTypeMyUser(String username) {
        addFounds.setUsername(username);
    }

    @When("i type my password {string} in the password box")
    public void iTypeMyPasswordInThePasswordBox(String password) {
        addFounds.setPassword(password);
    }

    @When("i click on the login button")
    public void iClickOnTheLoginButton() {
        addFounds.clickLoginutton();
    }

    @Then("i should see the main menu and select the add found option in the menu")
    public void iShouldSeeTheMainMenuAndSelectTheAddFoundOptionInTheMenu() {
       addFounds.selectAddFoundOption();
    }

    @Then("i choose the pay bank transfer option")
    public void iChooseThePayBankTransferOption() {
        addFounds.selectPayOption();
    }

    @Then("i select pay now option")
    public void iSelectPayNowOption() {
       addFounds.selectPayNow();
    }

    @Then("i should see an electronic bill with the name back {string}")
    public void iShouldSeeAnElectronicBillWithTheNameBack(String bankTitle) {
        addFounds.getBankName(bankTitle);
    }
}
