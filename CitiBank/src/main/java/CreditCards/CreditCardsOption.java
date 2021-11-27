package CreditCards;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCardsOption extends CommonAPI {

    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id='View All Credit CardschildLink0']")
    WebElement ViewAllCreditCards;
    @FindBy(xpath = "//a[@aria-label='Rewards Credit Cards']")
    WebElement Rewards;
    @FindBy(xpath = "//a[@aria-label='Travel Credit Cards']")
    WebElement travel;
    @FindBy(xpath = "//a[@aria-label='0% Intro APR Credit Cards']")
    WebElement zeroIntroAPR;
    @FindBy(xpath = "")
    WebElement balanceTransfer;
    @FindBy(xpath = "")
    WebElement cashBack;
    @FindBy(xpath = "")
    WebElement business;

    @FindBy(xpath = "")
    WebElement moreCategories;

    @FindBy(xpath = "")
    WebElement noAnnualFee;





    public WebElement getCreditCards() {
        return creditCards;
    }
    public WebElement getViewAllCreditCards() {return ViewAllCreditCards;}
    public WebElement getRewards() {return Rewards;}
    public WebElement getTravel() {return travel;}

    public WebElement getZeroIntroAPR() {return zeroIntroAPR;}

    public WebElement getBalanceTransfer() {return balanceTransfer;}

    public WebElement getCashBack() {return cashBack;}

    public WebElement getBusiness() {return business;}

    public WebElement getMoreCategories() {return moreCategories;}

    public WebElement getNoAnnualFee() {return noAnnualFee;}

    public void hoverOverCreditCards(WebDriver driver){
        hoverOver(driver, getCreditCards());
    }
    public void ClickOnViewAll(){
        clickOn(getViewAllCreditCards());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnRewards(){
        clickOn(getRewards());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // navigateBack();
    }
    public void clickOnTravel(){
        clickOn(getTravel());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void zeroIntroAPR(){
        clickOn(getZeroIntroAPR());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
