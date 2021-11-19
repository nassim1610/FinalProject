package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CreditCardsOption;


public class TestCreditCards extends CommonAPI {

    @Test
    public void test(){
        CreditCardsOption reg= PageFactory.initElements(driver, CreditCardsOption.class);

//        reg.hoverOverCreditCards();
        reg.hoverOverCreditCards(driver);
        reg.ClickOnViewAll();
        reg.clickOnRewards();
        reg.clickOnTravel();
        reg.zeroIntroAPR();
    }

}