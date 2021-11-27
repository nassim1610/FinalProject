package CreditCards;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostcoBusinessCreditCard extends CommonAPI {
    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id='View All Credit CardschildLink0']")
    WebElement ViewAllCreditCards;

    @FindBy(xpath = "//body[@class='citi-outer-container cbolui-responsive cbolui-ddl']")
    WebElement LearnNApply;

    public WebElement getCreditCards() {return creditCards;}
    public WebElement getViewAllCreditCards() {return ViewAllCreditCards;}
    public WebElement getLearnNApply() {return LearnNApply;}

    public void hoverOverCreditCards(WebDriver driver){hoverOver(driver, getCreditCards());}
    public void ClickOnViewAll(){clickOn(getViewAllCreditCards());try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void scrolll(WebDriver driver){scrollToView(getLearnNApply(),driver);try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void ApplyFOr(){clickOn(getLearnNApply());try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}






}
