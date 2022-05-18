package co.com.phptravels.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.phptravels.net/login")
public class login_Page extends PageObject {
    @FindBy(xpath = "//*[contains(@type, 'email')]")
    WebElement username;

    @FindBy(xpath = "//*[contains(@type, 'password')]")
    WebElement password;

    @FindBy(xpath = "//*[contains(@type, 'submit')]")
    WebElement btnLogin;




    public void setUsername(String name){
        username.sendKeys(name);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void btnLogin(){
        btnLogin.click();
    }
}
