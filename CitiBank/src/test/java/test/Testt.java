package test;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.RegisterForOnlineAccess;
import pages.Sendkeys;

public class Testt extends CommonAPI {
//    @Test
//            public void clikAndSendkey() throws InterruptedException {
//        Sendkeys a= PageFactory.initElements(driver, Sendkeys.class);
//
//        a.helpico();
//       // a.typeByXpath("helpico","open account" );
//

   @Test
   public void tryLowIntro () throws InterruptedException {
      Sendkeys reg= PageFactory.initElements(driver, Sendkeys.class);
      reg.helpIcon();
      reg.getkey("open account");

      Thread.sleep(3000);






   }
}
