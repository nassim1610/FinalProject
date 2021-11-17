package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import pages.GetHelp;

public class testGetHelp extends CommonAPI {
    public void getInfo() {
        GetHelp help= PageFactory.initElements(driver, GetHelp.class);
        help.helpIcon();
        help.input1("open account");


    }
}
