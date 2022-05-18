package co.com.phptravels.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.phptravels.net/login")
public class main_Menu_Page extends PageObject {

    @FindBy(xpath = "//*[contains(@href,'https://www.phptravels.net/account/add_funds')]")
    WebElement clickAddFound;

    @FindBy(xpath = "//*contains(@id, 'gateway_bank-transfer'")
    WebElement bankTransferCheckBox;

    @FindBy(xpath = "//*contains(@id, 'submit'")
    WebElement btnPayNow;

    @FindBy(xpath = "//*[contains(text(), 'Western Bank CBP')]")
    WebElement textBankName;


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
       return btnPayNow.getText();
    }

}
