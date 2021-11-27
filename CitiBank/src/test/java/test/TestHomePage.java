package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import sing.ActivatCard;
import sing.ForgotUserID;
import sing.SignOn;
import sing.SignOnWithMobile;

public class TestHomePage extends CommonAPI {


    @Test
    public void test1() throws InterruptedException {
        HomePage A = PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setBuyHome();
        A.scroltoApply(driver);
        A.setStartApp();}
    @Test
    public void test2() throws InterruptedException {
        HomePage A = PageFactory.initElements(driver, HomePage.class);
        A.hover(driver);
        A.setClickbalance();}
    @Test
    public void test3() throws InterruptedException {
        HomePage b = PageFactory.initElements(driver, HomePage.class);}
    @Test
    public void test4() throws InterruptedException {
        HomePage A = PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setClickPersonal();}
    @Test
    public void test5(){
        HomePage A = PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setHomelinding();}
    @Test
    public void test6(){
        HomePage A = PageFactory.initElements(driver, HomePage.class);
        A.hover(driver);
        A.setInvesting();}
    @Test
    public void test7(){
        HomePage A = PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setRefinance();}
    @Test
    public void test8(){
            HomePage A = PageFactory.initElements(driver, HomePage.class);
            A.setLendin(driver);
//            A.setBuyHome();
//            A.scroltoApply(driver);
//            A.setStartApp();
    }
    @Test
    public void test9() {
        SignOn sign = PageFactory.initElements(driver, SignOn.class);
        sign.sendUserID("demoID");
        sign.sendUserPW("demoPW");
        sign.selectBox();
    }
    @Test
    public void test10(){
        SignOnWithMobile sign = PageFactory.initElements(driver, SignOnWithMobile.class);
        sign.setUseMobile();
    }
    @Test
    public void test11(){
        ForgotUserID sign= PageFactory.initElements(driver, ForgotUserID.class);
        sign.setForgetUserID();
        sign.setCardN("121212121");
        sign.setCountinue();
    }
    @Test
    public void test12(){
        ActivatCard act= PageFactory.initElements(driver, ActivatCard.class);
        act.setActivatC();
        act.setTypcardN("12365479865124");
        act.setClickContinue();
    }
    @Test
    public void test13(){
        HomePage A= PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setUseHomeEquity();
        A.setCall();
    }
    @Test
    public void test14(){
        HomePage A= PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setMortage();}
    @Test
    public void test15(){
        HomePage A= PageFactory.initElements(driver, HomePage.class);
        A.setLendin(driver);
        A.setHomeEquity();}
    @Test
    public void test16()throws InterruptedException{
        HomePage A= PageFactory.initElements(driver, HomePage.class);
        A.setBankigg(driver);
        A.setChecking();
//        A.setChenge();
    }
    @Test
    public void test17(){
        HomePage A= PageFactory.initElements(driver, HomePage.class);
        A.setBankigg(driver);
        A.setSaving();
//        A.setOpenAccount();
//        A.setClickFCB();
//        driver.close();

    }
    @Test
    public void test18(){
        HomePage A= PageFactory.initElements(driver, HomePage.class);
        A.setBankigg(driver);
        A.setCertificatOfDepo();
//        A.setLearnMore();
        }
    @Test
    public void test19(){
        ForgotUserID sign= PageFactory.initElements(driver, ForgotUserID.class);
        sign.setForgetUserID();
        sign.setCardN("121212121");
        sign.setCountinue();
    }
    @Test
    public void test20(){
        ActivatCard act= PageFactory.initElements(driver, ActivatCard.class);
        act.setActivatC();
        act.setTypcardN("12365479865124");
        act.setClickContinue();

    }





}
