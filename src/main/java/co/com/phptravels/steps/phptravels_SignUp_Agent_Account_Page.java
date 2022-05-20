package co.com.phptravels.steps;

import co.com.phptravels.pages.signUp_Page;
import net.thucydides.core.annotations.Step;

public class phptravels_SignUp_Agent_Account_Page {
    signUp_Page agent;
    @Step
    public void openSignUpPage(){
        agent.open();
    }

    @Step
    public void typeAgentName(String name){
        agent.setNameBox(name);
    }

    @Step
    public void typeAgentLastName(String lastname){
        agent.setLastNameBox(lastname);
    }

    @Step
    public void typeAgentNumber(String number){
        agent.setNumberPhoneBox(number);
    }

    @Step
    public void typeAgentEmail(String email){
        agent.setEmailBox(email);
    }
    @Step
    public void typePassword(String pass){
        agent.setPasswordBox(pass);
    }

    @Step
    public void selectAccountType(){
        agent.selectAccountType();
    }

    @Step
    public void clickSigUpButton(){
        agent.clickSignUpButton();
    }
}
