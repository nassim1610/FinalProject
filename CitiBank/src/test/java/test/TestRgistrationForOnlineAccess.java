package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CreditCardsOption;
import pages.GetHelp;


public class TestRgistrationForOnlineAccess extends CommonAPI {


@Test
    public void tryCreditCards() throws InterruptedException {
    Thread.sleep(9000);
    GetHelp reg = PageFactory.initElements(driver, GetHelp.class);

}



    @Test
    public void test(){
        CreditCardsOption reg= PageFactory.initElements(driver, CreditCardsOption.class) ;

//        reg.hoverOverCreditCards();
        reg.hoverOverCreditCards(driver);
    }

}