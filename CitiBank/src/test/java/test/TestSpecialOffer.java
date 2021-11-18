package test;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SpecialOffer;

public class TestSpecialOffer extends CommonAPI {
    @Test
    public void offers() throws InterruptedException {
        SpecialOffer Soffer = PageFactory.initElements(driver, SpecialOffer.class);
        Soffer.scroll(driver);


        Soffer.getPutZipCode();
        Thread.sleep(3000);
        Soffer.getSubmitZipCode();
        Thread.sleep(3000);
        Soffer.getClickOnEarnUpTO1500();
        Thread.sleep(3000);
    }


}
