package sing;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOn extends CommonAPI {
    @FindBy(xpath = "//input[@aria-labelledby='username-label']")
    WebElement typUserID;
    @FindBy(xpath = "//input[@aria-labelledby='password-label']")
    WebElement typPassword;
    @FindBy(xpath = "//*[@for='rememberUid']")
    WebElement rememberUserID;

    public WebElement getTypUserID() {return typUserID;}
    public WebElement getTypPassword() {return typPassword;}
    public WebElement getRememberUserID() {return rememberUserID;}

    public void sendUserID(String str) {
        typeInto(getTypUserID(), str);
    }
    public void sendUserPW(String str) {
        typeInto(getTypPassword(), str);
    }
    public boolean checkBoxIfSelected(){return rememberUserID.isSelected();}
    public void selectBox(){clickOn(getRememberUserID());}



}
