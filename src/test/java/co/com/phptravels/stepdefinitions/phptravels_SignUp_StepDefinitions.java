package co.com.phptravels.stepdefinitions;

import co.com.phptravels.steps.phptravels_Signup_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class phptravels_SignUp_StepDefinitions {

    @Steps
    phptravels_Signup_Page signup;
    @Given("i want to get an Acount")
    public void iWantToGetAnAcount() {
        signup.openSignUpPage();
    }

    @When("i type my name {string}")
    public void iTypeMyName(String name) {
        signup.setName(name);
    }

    @When("i type my last name {string}")
    public void iTypeMyLastName(String lastName) {
        signup.setLastname(lastName);
    }

    @When("i type my number phone {string}")
    public void iTypeMyNumberPhone(String  numberPhone) {
        signup.setNumberPhone(numberPhone);
    }

    @When("i type my email {string}")
    public void iTypeMyEmail(String email) {
        signup.setEmail(email);
    }

    @When("i type my new password {string}")
    public void iTypeMyNewPassword(String pass) {
        signup.setPassword(pass);
    }

    @Then("i should get my new account after i clicked the signup button")
    public void iShouldGetMyNewAccountAfterIClickedTheSignupButton() {
        signup.clickSignUpButton();
    }

}
