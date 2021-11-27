package sing;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivatCard extends CommonAPI {
    @FindBy(xpath = "//*[@href='https://online.citi.com/US/ag/activate/index']")
    WebElement ActivatC;
    @FindBy(xpath = "//*[@placeholder='Card Number']")
    WebElement typcardN;
    @FindBy(xpath = "//*[@class='btn-col-margin']")
    WebElement clickContinue;
    public WebElement getActivatC() {return ActivatC;}
    public WebElement getTypcardN() {return typcardN;}
    public WebElement getClickContinue() {return clickContinue;}

    public void setActivatC(){clickOn(getActivatC());}
    public void setTypcardN(String value){typeInto(getTypcardN(),value);}
    public void setClickContinue(){clickOn(getClickContinue());}


}
