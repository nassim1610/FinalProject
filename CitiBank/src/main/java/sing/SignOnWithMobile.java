package sing;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnWithMobile extends CommonAPI {
    @FindBy(xpath = "//*[@class='btn btn-link small ng-star-inserted']")
    WebElement useMobile;

    public WebElement getUseMobile() {
        return useMobile;
    }
    public void setUseMobile(){clickOn(getUseMobile());}
}
