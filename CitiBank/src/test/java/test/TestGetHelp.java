package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GetHelp;

public class TestGetHelp extends CommonAPI {
    @Test
    public void getInfo() throws InterruptedException {
        GetHelp help= PageFactory.initElements(driver, GetHelp.class);
        help.helpIcon();
        help.input1("open account");
        help.additionPage();

    }

}
