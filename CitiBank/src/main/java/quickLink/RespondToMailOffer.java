package quickLink;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RespondToMailOffer extends CommonAPI {
    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;
    @FindBy(xpath = "//*[@href='https://www.citicards.com/cards/credit/application/flow.action?isInvitation=Y']")
    WebElement respondToMailOffer;
    @FindBy(xpath = "//*[@class='locator']")
    WebElement otherBenefits;

    public WebElement getCreditCards() {return creditCards;}
    public WebElement getRespondToMailOffer() {return respondToMailOffer;}
    public WebElement getOtherBenefits() {return otherBenefits;}

    public void hover1(WebDriver driver){hoverOver(driver,getCreditCards());}
    public void setRespondToMailOffer(){clickOn(getRespondToMailOffer());}
    public void setOtherBenefits(){clickOn(getOtherBenefits());}
}
