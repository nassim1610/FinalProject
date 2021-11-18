package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialOffer extends CommonAPI {
    @FindBy(xpath = "//*[contains(text(),'Special Offers')]")
    WebElement specialOffers;
    @FindBy(xpath = "//*[@class='form-control ng-pristine ng-valid validation-input-danger ng-touched']")
    WebElement putZipCode;
    @FindBy(css = "#5342188c-1ac6-8779-00d8-701fceb1d643")
    WebElement submitZipCode;
    @FindBy(xpath = "//*[@id='682adde1-5625-4226-8b51-374e7d82f494']")
    WebElement clickOnEarnUpTO1500;



    public WebElement getSpecialOffers() {return specialOffers;}
    public WebElement getPutZipCode() {return putZipCode;}
    public WebElement getSubmitZipCode() {return submitZipCode;}
    public WebElement getClickOnEarnUpTO1500() {return clickOnEarnUpTO1500;}

    public void scroll(WebDriver driver) throws InterruptedException {
        scrollToView(getSpecialOffers(), driver);
        clickOn(getSpecialOffers());
        Thread.sleep(3000);
    }




}
