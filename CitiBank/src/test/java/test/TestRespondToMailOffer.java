package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import quickLink.RespondToMailOffer;

public class TestRespondToMailOffer extends CommonAPI {

    @Test
    public void respond(){
        RespondToMailOffer A = PageFactory.initElements(driver, RespondToMailOffer.class);
        A.hover1(driver);
        A.setRespondToMailOffer();
        A.setOtherBenefits();
    }


}
