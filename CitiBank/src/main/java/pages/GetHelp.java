package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Field;


public class GetHelp extends CommonAPI {

    @FindBy(xpath = "//*[@id='personetics-citi-menu']")
    WebElement howCanWeHelp;
    @FindBy(xpath = "//*[@id='autocomplete-search-panel']")
    WebElement lookFor;
    @FindBy(css = "#autocomplete-search-panel")
    WebElement howtoreopenaccount;
    @FindBy(css="#faq-15169-label")
    WebElement applyForCitiBAccount;
    @FindBy(css = "#cca48184-5b6c-367b-acd5-ce47a6aef861")
    WebElement specialOffers;
    @FindBy(xpath = "//*[@class='form-control ng-pristine ng-valid validation-input-danger ng-touched']")
    WebElement putZipCode;
    @FindBy(css = "#5342188c-1ac6-8779-00d8-701fceb1d643")
    WebElement submitZipCode;
    @FindBy(xpath = "//*[@id='682adde1-5625-4226-8b51-374e7d82f494']")
    WebElement clickOnEarnUpTO1500;

    public WebElement getHowCanWeHelp() {
        return howCanWeHelp;
    }

    public WebElement getLookFor() {
        return lookFor;
    }

    public WebElement getHowtoreopenaccount() {
        return howtoreopenaccount;
    }

    public WebElement getApplyForCitiBAccount() {
        return applyForCitiBAccount;
    }

    public WebElement getSpecialOffers() {
        return specialOffers;
    }

    public WebElement getPutZipCode() {
        return putZipCode;
    }

    public WebElement getSubmitZipCode() {
        return submitZipCode;
    }

    public WebElement getClickOnEarnUpTO1500() {
        return clickOnEarnUpTO1500;
    }
    //==============================
    public void helpIcon()  {
        clickOn(getHowCanWeHelp());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    public void input1(String str) throws InterruptedException {
//        typeEnter(getLookFor(),str);
//        Thread.sleep(2000);
//    }
   public void input1(String str)  {
        typeEnter(getLookFor(),str);
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {   
           e.printStackTrace();
       }
   }
//            public void inputTry(String input){
//        typeAndEnter("getLookFor()", input);
//            }
    public void clickOnHowToReopenAccount() throws InterruptedException {
        clickOn(getHowtoreopenaccount());
        Thread.sleep(2000);

    }
    public void clickOnApplyForCitiBAccount() throws InterruptedException {
        clickOn(getApplyForCitiBAccount());
        Thread.sleep(2000);
    }
    public void scrolToSpecialOffers(WebDriver driver){
        scrollToView(getSpecialOffers(), driver);
    }
    public void enterZipeCode(String str){
        typeOnCss("getPutZipCode()", str);
    }
    public void clickToSubmite(){
        clickByXpath("getSubmitZipCode()");
    }
    public void choseOffer(){
        clickByXpath("getClickOnEarnUpTO1500()");
    }

}