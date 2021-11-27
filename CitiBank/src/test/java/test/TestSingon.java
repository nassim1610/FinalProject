package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sing.ActivatCard;
import sing.ForgotUserID;
import sing.SignOn;
import sing.SignOnWithMobile;

public class TestSingon extends CommonAPI {
    @Test
    public void signOninfo() {
        SignOn sign = PageFactory.initElements(driver, SignOn.class);
        sign.sendUserID("demoID");
        sign.sendUserPW("demoPW");
        sign.selectBox();
    }
    @Test
    public void mobileSign(){
        SignOnWithMobile sign = PageFactory.initElements(driver, SignOnWithMobile.class);
        sign.setUseMobile();
    }
    @Test
    public void recoverAccount(){
    ForgotUserID sign= PageFactory.initElements(driver, ForgotUserID.class);
    sign.setForgetUserID();
    sign.setCardN("121212121");
    sign.setCountinue();
    }
    @Test
    public void ActivatTheCard(){
        ActivatCard act= PageFactory.initElements(driver, ActivatCard.class);
        act.setActivatC();
        act.setTypcardN("12365479865124");
        act.setClickContinue();
    }
}
