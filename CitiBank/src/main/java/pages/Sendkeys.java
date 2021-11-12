package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.RegisterForOnlineAccess;
public class Sendkeys extends CommonAPI {


@FindBy(xpath = "//*[@id='personetics-citi-menu']")
WebElement howCanWeHelp;
@FindBy(xpath = "//*[@id='autocomplete-search-panel']")
WebElement putkey;

    public WebElement getPutkey() {
        return putkey;
    }

    public WebElement getHowCanWeHelp() {
        return howCanWeHelp;
    }
    public void helpIcon() throws InterruptedException {
        clickOn(getHowCanWeHelp());
        Thread.sleep(3000);
    }
public void getkey(String str){
        typeByXpath("getPutkey()", str);
}


}
