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
        //Soffer.giveZipCode("11367");

    }


}
