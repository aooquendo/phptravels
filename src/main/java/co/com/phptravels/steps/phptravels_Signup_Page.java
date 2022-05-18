package co.com.phptravels.steps;

import co.com.phptravels.pages.signUp_Page;
import net.thucydides.core.annotations.Step;

public class phptravels_Signup_Page {
    signUp_Page signUp;

    @Step
    public void openSignUpPage(){
        signUp.open();
    }

    @Step
    public void setName(String name){
        signUp.setNameBox(name);
    }

    @Step
    public void setLastname(String lastname){
        signUp.setLastNameBox(lastname);
    }

    @Step
    public void setNumberPhone(String number){
        signUp.setNumberPhoneBox(number);
    }

    @Step
    public void setEmail(String email){
        signUp.setEmailBox(email);
    }

    @Step
    public void setPassword(String pass){
      signUp.setPasswordBox(pass);
    }

    @Step
    public void clickSignUpButton(){
        signUp.clickSignUpButton();
    }
}
