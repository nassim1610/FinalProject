package test;

import base.CommonAPI;
import openAccount.OpenAnAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestOpenAccount extends CommonAPI {

    @Test
    public void newAccount(){
        OpenAnAccount A= PageFactory.initElements(driver,OpenAnAccount.class);
        A.setOpenAccount();
        A.setZipeCode("11367");
//        A.setSubmite();
//        A.setSelectType();
//        A.setChooseTyp(2);
//        A.setCitiGoldAccountPackage();
//        A.setApply();
//        A.setChooseOption();
//        A.setFirstName("demoName");
//        A.setLastName("dimoLastName");
//        A.setDateOfBirth("12/12/1880");
//        A.setSSN("111111111");
//        A.setClickNo();


    }
}
