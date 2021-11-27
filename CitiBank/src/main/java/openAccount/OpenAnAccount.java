package openAccount;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAnAccount extends CommonAPI {
    @FindBy(xpath = "//*[contains(text(),'Open an Account')]/../a")
    WebElement openAccount;
    @FindBy(xpath = "//input[@aria-labelledby='zipcodelabel']")
    WebElement ZipeCode;
    @FindBy(xpath= "//*[@class='1b900aab-268f-09ca-e629-f422b8ec5fba']")
    WebElement submite;
    @FindBy(xpath = "//*[@class='form-control ng-pristine ng-valid validation-input-danger ng-touched']")
    WebElement selectType;
    @FindBy(xpath = "//*[@class='form-control ng-pristine ng-valid validation-input-danger ng-touched']")
    WebElement chooseTyp;
    @FindBy(xpath = "")
    WebElement citiGoldAccountPackage;
    @FindBy(xpath = "")
    WebElement Apply;
    @FindBy(xpath = "")
    WebElement chooseOption;
    @FindBy(xpath = "")
    WebElement firstName;
    @FindBy(xpath = "")
    WebElement lastName;
    @FindBy(xpath = "")
    WebElement dateOfBirth;
    @FindBy(xpath = "")
    WebElement SSN;
    @FindBy(xpath = "")
    WebElement clickNo;





    public WebElement getOpenAccount() {return openAccount;}
    public WebElement getZipeCode() {return ZipeCode;}
    public WebElement getSubmite() {return submite;}

    public WebElement getSelectType() {return selectType;}

    public WebElement getChooseTyp() {return chooseTyp;}
    public WebElement getCitiGoldAccountPackage() {return citiGoldAccountPackage;}
    public WebElement getApply() {return Apply;}
    public WebElement getChooseOption() {return chooseOption;}
    public WebElement getFirstName() {return firstName;}
    public WebElement getLastName() {return lastName;}
    public WebElement getDateOfBirth() {return dateOfBirth;}
    public WebElement getSSN() {return SSN;}
    public WebElement getClickNo() {return clickNo;}

    public void setOpenAccount(){clickOn(getOpenAccount());}
    public void setZipeCode(String value){typeInto(getZipeCode(),value);}
    public void setSubmite(){clickOn(getSubmite());}
    public void setSelectType(){clickOn(getSelectType());}
    public void setChooseTyp(int index){selectdropdown("getChooseTyp()",index);}
    public void setCitiGoldAccountPackage(){clickOn(getCitiGoldAccountPackage());}
    public void setApply(){clickOn(getApply());}
    public void setChooseOption(){clickOn(getChooseOption());}
    public void setFirstName(String value){typeInto(getFirstName(), value);}
    public void setLastName(String value){typeInto(getLastName(),value);}
    public void setDateOfBirth(String value){typeInto(getDateOfBirth(),value);}
    public void setSSN(String value){typeInto(getSSN(),value);}
    public void setClickNo(){clickOn(getClickNo());}




}
