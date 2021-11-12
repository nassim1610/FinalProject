package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pages.RegisterForOnlineAccess;

import javax.imageio.spi.RegisterableService;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestRgistrationForOnlineAccess extends CommonAPI {

//
//@Test
//    public void tryCreditCards() throws InterruptedException {
//    Thread.sleep(9000);
//    RegisterForOnlineAccess reg = PageFactory.initElements(driver, RegisterForOnlineAccess.class);
//    reg.hoverOverCreditCards();
//    Thread.sleep(3000);
//    reg.clickOnChecking();
//    Thread.sleep(3000);
//}

    @Test
    public void tryLowIntro () throws InterruptedException {
        RegisterForOnlineAccess reg= PageFactory.initElements(driver, RegisterForOnlineAccess.class);
        reg.helpIcon();
        reg.input1("open account");

       Thread.sleep(3000);
//        reg.clickOnHowToReopenAccount();
//        reg.clickOnApplyForCitiBAccount();
//        reg.scrolToSpecialOffers(driver);


    }


}