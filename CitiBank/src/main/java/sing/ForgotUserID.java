package sing;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotUserID extends CommonAPI {
    @FindBy(xpath = "//a[@href='https://online.citi.com/US/ag/forgot-userid-pwd/account-type?fuipFlowInd=userID']")
    WebElement forgetUserID;
    @FindBy(xpath = "//*[@aria-labelledby='card-label']")
    WebElement cardN;
    @FindBy(xpath = "//*[@class='btn btn-primary large ng-star-inserted']")
    WebElement countinue;

    public WebElement getForgetUserID() {return forgetUserID;}
    public WebElement getCardN() {return cardN;}
    public WebElement getCountinue() {return countinue;}

    public void setForgetUserID(){clickOn(getForgetUserID());}
    public void setCardN(String value){typeInto(getCardN(),value);}
    public void setCountinue(){clickOn(getCountinue());}
}
