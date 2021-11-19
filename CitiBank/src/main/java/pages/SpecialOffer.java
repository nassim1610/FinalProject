package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialOffer extends CommonAPI {
    @FindBy(xpath = "//*[contains(text(),'Special Offers')]")
    WebElement specialOffers;
    @FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-valid'][1]")
    WebElement putZipCode;
    @FindBy(xpath = "//*[contains(text(),'Submit')][1]/../../citi-cta")
    WebElement submitZipCode;
    @FindBy(xpath = "//*[@class='btn btn-primary medium'][1]")
    WebElement clickOnEarnUpTO1500;



    public WebElement getSpecialOffers() {return specialOffers;}
    public WebElement getPutZipCode() {return putZipCode;}
    public WebElement getSubmitZipCode() {return submitZipCode;}
    public WebElement getClickOnEarnUpTO1500() {return clickOnEarnUpTO1500;}

    public void scroll(WebDriver driver) throws InterruptedException {
        scrollToView(getSpecialOffers(), driver);
        clickOn(getSpecialOffers());
        Thread.sleep(2000);
    }
    public void giveZipCode(String value){
        typeInto(getPutZipCode(),value);
        clickOn(getSubmitZipCode());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(getClickOnEarnUpTO1500());
    }





}
