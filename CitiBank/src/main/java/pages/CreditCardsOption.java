package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CreditCardsOption extends CommonAPI {

    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;

    public WebElement getCreditCards() {
        return creditCards;
    }


    public void hoverOverCreditCards(){
        hoverOver(driver, getCreditCards());
   }
    public void hoverOverCreditCards(WebDriver driver){
        hoverOver(driver, getCreditCards());
    }


}
