package co.com.phptravels.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.phptravels.net/login")
public class main_Menu_Page extends PageObject {

    @FindBy(linkText = "Add Funds")
    WebElement clickAddFound;

    @FindBy(id = "gateway_bank-transfer")
    WebElement bankTransferCheckBox;

    @FindBy(xpath = "//*[contains(text(), 'Pay Now')]")
    WebElement btnPayNow;
    @FindBy(className = "card-header")
    WebElement titleBank;

    public void selectAddFound(){
        clickAddFound.click();
    }

    public void selectPayOption(){
        bankTransferCheckBox.click();
    }

    public void selectPayNow(){
        btnPayNow.click();
    }

    public String getBankTitle(){
         return titleBank.getText();

    }

}
