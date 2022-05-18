package co.com.phptravels.steps;

import co.com.phptravels.pages.login_Page;
import net.thucydides.core.annotations.Step;

public class phptravels_Login_Page {
    login_Page loginPage;

    @Step
    public void openPhpLoginPage(){
        loginPage.open();
    }

    @Step
    public void setUsername(String name){
        loginPage.setUsername(name);
    }

    @Step
    public void setPassword(String pass){
        loginPage.setPassword(pass);
    }

    @Step
    public void btnLogin(){
        loginPage.btnLogin();
    }
}
