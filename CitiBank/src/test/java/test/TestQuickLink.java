package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import quickLink.CitiCreditKnowledgeCenter;

public class TestQuickLink extends CommonAPI {
    @Test
    public void knowleg(){
        CitiCreditKnowledgeCenter A= PageFactory.initElements(driver, CitiCreditKnowledgeCenter.class);
        A.hove(driver);
        A.setKnowledgeCenter();
        A.scroll(driver);
        A.setClickOnFICO();
        //A.setPlayVideo();

    }

}
