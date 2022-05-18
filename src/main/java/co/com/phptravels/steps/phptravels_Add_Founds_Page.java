package co.com.phptravels.steps;

import co.com.phptravels.pages.login_Page;
import co.com.phptravels.pages.main_Menu_Page;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.awt.geom.QuadCurve2D;

public class phptravels_Add_Founds_Page {
    login_Page login;
    main_Menu_Page menu;

    @Step
    public void openLoginPage(){
        login.open();
    }

    @Step
    public void setUsername(String username){
        login.setUsername(username);
    }

    @Step
    public void setPassword(String pass){
        login.setPassword(pass);
    }

    @Step
    public void clickLoginutton(){
        login.btnLogin();
    }

    @Step
    public void selectAddFoundOption(){
        menu.selectAddFound();
    }

    @Step
    public void selectPayOption(){
        menu.selectPayOption();
    }

    @Step
    public void selectPayNow(){
        menu.selectPayNow();
    }

    @Step
    public void getBankName(String bankName){
        Assert.assertEquals(menu.getBankTitle(), bankName);
    }
}
