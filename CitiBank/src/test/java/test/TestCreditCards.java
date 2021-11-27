package test;

import CreditCards.*;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;



public class TestCreditCards extends CommonAPI {

    @Test
    public void test(){
        CreditCardsOption reg= PageFactory.initElements(driver, CreditCardsOption.class);
        reg.hoverOverCreditCards(driver);
        reg.ClickOnViewAll();
        reg.clickOnRewards();
        reg.clickOnTravel();
        reg.zeroIntroAPR();
    }
    @Test
    public void TestCustomerCash() throws InterruptedException {
        CitiCustomCash A = PageFactory.initElements(driver,CitiCustomCash.class);
        A.hoverOverCreditCards(driver);
        A.ClickOnViewAll();
        A.scrolll(driver);
        A.ApplyFOr();
        String oldTab = driver.getWindowHandle();
        A.clickOnApplyNow();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        A.sendName("DimoName");
        A.sendLastNam("DimoLastName");
        A.setSSN("121212121");
        A.setDateOfBirth("12/12/1992");
        A.setAreYouCitizen();
        A.setAddress1("50st W 12thAv");
        A.setZipCode("11367");
        driver.findElement(By.xpath("//*[@id='cds-input-11']")).sendKeys("Queens");
        A.setPhonN("9179998980");
        A.setEmailAddress("Demo@gmail.com");
        A.setTOtalAnnualIncom("200000");
        A.setMonthlyMortgage("16,600");
        A.scrol1(driver);
        A.clickToDropDown();
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.ARROW_DOWN);
//        act.sendKeys(Keys.ARROW_DOWN);
//        act.sendKeys(Keys.ENTER);
        WebElement dropdown= driver.findElement(By.xpath("//*[@id='cds-dropdown-1-input']"));
//        Select select= new Select(dropdown);//this Select have to be from selenium
//        select.selectByVisibleText("Favorite Snack");
        Thread.sleep(2000);
        A.setPutSecurityWord("cat");
        A.setSelectAgree1();
        A.setSelectAgree2();
        A.scroll2(driver);
        A.setAgreeAndSubmit();}

   @Test
    public void TestD_Card() throws InterruptedException {
       DiamondPreferredCreditCard A = PageFactory.initElements(driver,DiamondPreferredCreditCard.class);
        A.hoverOverCreditCards(driver);
        A.ClickOnViewAll();
        A.scrolll(driver);
        A.ApplyFOr();
        String oldTab = driver.getWindowHandle();
        A.clickOnApplyNow();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
//        driver.switchTo().window(newTab.get(0));
//        A.sendName("DimoName");
//        A.sendLastNam("DimoLastName");
//        A.setSSN("121212121");
//        A.setDateOfBirth("12/12/1992");
//        A.setAreYouCitizen();
//        A.setAddress1("50st W 12thAv");
//        A.setZipCode("11367");
//        driver.findElement(By.xpath("//*[@id='cds-input-11']")).sendKeys("Queens");
//        A.setPhonN("9179998980");
//        A.setEmailAddress("Demo@gmail.com");
//        A.setTOtalAnnualIncom("200000");
//        A.setMonthlyMortgage("16,600");
//        A.scrol1(driver);
//        A.clickToDropDown();
//======                        =========
//        Thread.sleep(2000);
//        A.setPutSecurityWord("cat");
//        A.setSelectAgree1();
//        A.setSelectAgree2();
//        A.scroll2(driver);
//        A.setAgreeAndSubmit();
    }
    @Test
    public void TestVisaCreditCard() throws InterruptedException {
        CostcoVisaCreditCard A = PageFactory.initElements(driver, CostcoVisaCreditCard.class);
        A.hoverOverCreditCards(driver);
        A.ClickOnViewAll();
        A.scrolll(driver);
        A.ApplyFOr();
        String oldTab = driver.getWindowHandle();
        A.clickOnApplyNow();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
//        A.setMembershipNumber("121212");
//        A.sendName("DimoName");
//        A.sendLastNam("DimoLastName");
//        A.setSSN("121212121");
//        A.setDateOfBirth("12/12/1992");
//        A.setAreYouCitizen();
//        A.setClickAddress1();
//        A.setAddress1("50st W 12thAv");
//        A.setZipCode("11367");
//        A.setPhonN("9179998980");
//        A.setEmailAddress("Demo@gmail.com");
//        driver.navigate().back();

    }
    @Test
    public void TestCostcoBusinessCreditCard() throws InterruptedException {
        CostcoBusinessCreditCard A = PageFactory.initElements(driver, CostcoBusinessCreditCard.class);
        A.hoverOverCreditCards(driver);
        A.ClickOnViewAll();
        A.scrolll(driver);
        A.ApplyFOr();
        String oldTab = driver.getWindowHandle();

    }
     @Test
    public void TestDoubleCashCreditCard() throws InterruptedException {
         DoubleCashCreditCard A = PageFactory.initElements(driver,DoubleCashCreditCard.class);
        A.hoverOverCreditCards(driver);
        A.ClickOnViewAll();
        A.scrolll(driver);
        A.ApplyFOr();
        String oldTab = driver.getWindowHandle();
        A.clickOnApplyNow();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
//        A.sendName("DimoName");
//        A.sendLastNam("DimoLastName");
//        A.setSSN("121212121");
//        A.setDateOfBirth("12/12/1992");
//        A.setAreYouCitizen();
//        A.setAddress1("50st W 12thAv");
//        A.setZipCode("11367");
//        driver.findElement(By.xpath("//*[@id='cds-input-11']")).sendKeys("Queens");
//        A.setPhonN("9179998980");
//        A.setEmailAddress("Demo@gmail.com");
//        A.setTOtalAnnualIncom("200000");
//        A.setMonthlyMortgage("16,600");
//        A.scrol1(driver);
//        A.clickToDropDown();
////======                        =========
//        Thread.sleep(2000);
//        A.setPutSecurityWord("cat");
//        A.setSelectAgree1();
//        A.setSelectAgree2();
//        A.scroll2(driver);
//        A.setAgreeAndSubmit();
    }

    @Test
    public void TestCitiRewardsCreditCard() throws InterruptedException {
        CitiRewardsCreditCard A = PageFactory.initElements(driver,CitiRewardsCreditCard.class);
        A.hoverOverCreditCards(driver);
        A.ClickOnViewAll();
        A.scrolll(driver);
        A.ApplyFOr();
        String oldTab = driver.getWindowHandle();
        A.clickOnApplyNow();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
//        A.sendName("DimoName");
//        A.sendLastNam("DimoLastName");
//        A.setSSN("121212121");
//        A.setDateOfBirth("12/12/1992");
//        A.setAreYouCitizen();
//        A.setAddress1("50st W 12thAv");
//        A.setZipCode("11367");
//        driver.findElement(By.xpath("//*[@id='cds-input-11']")).sendKeys("Queens");
//        A.setPhonN("9179998980");
//        A.setEmailAddress("Demo@gmail.com");
//        A.setTOtalAnnualIncom("200000");
//        A.setMonthlyMortgage("16,600");
//        A.scrol1(driver);
//        A.clickToDropDown();
////======                        =========
//        Thread.sleep(2000);
//        A.setPutSecurityWord("cat");
//        A.setSelectAgree1();
//        A.setSelectAgree2();
//        A.scroll2(driver);
//        A.setAgreeAndSubmit();
        }


}