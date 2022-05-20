package co.com.phptravels.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.phptravels.net/signup")
public class signUp_Page extends PageObject {

    @FindBy(xpath = "//*[contains(@name, 'first_name')]")
    WebElement nameBox;

    @FindBy(xpath = "//*[contains(@name, 'last_name')]")
    WebElement lastNameBox;

    @FindBy(xpath = "//*[contains(@name, 'phone')]")
    WebElement numberPhoneBox;

    @FindBy(xpath = "//*[contains(@name, 'email')]")
    WebElement emailBox;

    @FindBy(xpath = "//*[contains(@name, 'password')]")
    WebElement passwordBox;

    @FindBy(xpath = "//*[contains(@type, 'submit')]")
    WebElement btnSigUp;

    @FindBy(id = "select2-account_type-container")
    WebElement typeAccount;

    @FindBy(className = "select2-search__field")
    WebElement textAccount;


    public void setNameBox(String name){
        nameBox.sendKeys(name);
    }

    public void setLastNameBox(String lastName){
        lastNameBox.sendKeys(lastName);
    }

    public void setNumberPhoneBox(String number){
        numberPhoneBox.sendKeys(number);
    }

    public void setEmailBox(String email){
        emailBox.sendKeys(email);
    }

    public void setPasswordBox(String pass){
        passwordBox.sendKeys(pass);
    }

    public void clickSignUpButton(){
        btnSigUp.click();
    }

    public void selectAccountType(){
        typeAccount.click();
        textAccount.sendKeys("Agent");
        textAccount.sendKeys(Keys.ENTER);
    }
}
