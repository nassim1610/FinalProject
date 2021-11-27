package CreditCards;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiamondPreferredCreditCard extends CommonAPI {
    //    @FindBy(xpath = " ")
//    WebElement FirstName;
//    @FindBy(xpath = "")
//    WebElement LastName;
//    @FindBy(xpath = "")
//    WebElement SSN;
//    @FindBy(xpath = "")
//    WebElement DateOfBirth;
//    @FindBy(xpath = "")
//    WebElement AreYouCitizen;
//    @FindBy(xpath = "")
//    WebElement Address1;
//    @FindBy(xpath = "")
//    WebElement ZipCode;
//    @FindBy(xpath = "")
//    WebElement City;
//    @FindBy(xpath = "")
//    WebElement State;
//    @FindBy(xpath = "")
//    WebElement PhonN;
//    @FindBy(xpath = "")
//    WebElement EmailAddress;
//    @FindBy(xpath = "")
//    WebElement TOtalAnnualIncom;
//    @FindBy(xpath = "")
//    WebElement MonthlyMortgage;
//    @FindBy(xpath = "")
//    WebElement SelectSecurityWordHint;
//    @FindBy(xpath = "")
//    WebElement PutSecurityWord;
//    @FindBy(xpath = "")
//    WebElement selectAgree1;
//    @FindBy(xpath = "")
//    WebElement SelectAgree2;
//    @FindBy(xpath = "")
//    WebElement AgreeAndSubmit;
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
//    @FindBy(xpath = "")
//    WebElement
    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id='View All Credit CardschildLink0']")
    WebElement ViewAllCreditCards;

    @FindBy(xpath = "//*[@src='/CRD/images/citi-diamond/citi-diamond_222x140.png']")
    WebElement LearnNApply;
    @FindBy(xpath = "//img[@src='/CRD/images/citi-diamond/citi-diamond_222x140.png']")
    WebElement ApplyNow;
    @FindBy(xpath = "//*[@id='cds-input-6']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@id='cds-input-7']")
    WebElement LastName;
    @FindBy(xpath = "//input[@id='cds-input-0']")
    WebElement SSN;
    @FindBy(xpath = "//input[@id='cds-input-1']")
    WebElement DateOfBirth;
    @FindBy(xpath = "//*[@id='cds-radio-0-label']")
    WebElement AreYouCitizen;
    @FindBy(xpath = "//*[@id='cds-input-8']")
    WebElement Address1;
    @FindBy(xpath = "//*[@id='cds-input-10']")
    WebElement ZipCode;
    @FindBy(xpath = "//*[@id='cds-input-11']")
    WebElement City;
    @FindBy(xpath = "cds-dropdown-2-input")
    WebElement State;
    @FindBy(xpath = "//*[@id='cds-input-5']")
    WebElement PhonN;
    @FindBy(xpath = "//*[@id='email-input']")
    WebElement EmailAddress;
    @FindBy(xpath = "//*[@id='cds-input-2']")
    WebElement TOtalAnnualIncom;
    @FindBy(xpath = "//*[@id='cds-input-3']")
    WebElement MonthlyMortgage;
    @FindBy(xpath = "//*[@id='cds-dropdown-1-input']")
    WebElement SelectSecurityWordHint;
    @FindBy(xpath = "//*[@id='cds-dropdown-1-input']")
    WebElement selec;

    public WebElement getSelec() {
        return selec;
    }

    @FindBy(xpath = "//*[@id='cds-input-4']")
    WebElement PutSecurityWord;
    //@FindBy(xpath = "//label[contains(text(),'By checking this box, I agree to the ')]/../label")
    @FindBy(xpath = "//*[@id='termsAndConditionsCheckbox-label']")
    WebElement selectAgree1;
    @FindBy(xpath = "//label[@id='paperlessTermsAndConditionCheckbox-label']")
    WebElement SelectAgree2;
    @FindBy(xpath = "//*[@class='cds-cta cds-cta-md cds-cta-primary cds-cta-priority']")
    WebElement AgreeAndSubmit;


    public WebElement getCreditCards() {return creditCards;}
    public WebElement getViewAllCreditCards() {return ViewAllCreditCards;}
    public WebElement getLearnNApply() {return LearnNApply;}
    public WebElement getApplyNow() {return ApplyNow;}
    public WebElement getFirstName() {return FirstName;}
    public WebElement getLastName() {return LastName;}
    public WebElement getSSN() {return SSN;}
    public WebElement getDateOfBirth() {return DateOfBirth;}
    public WebElement getAreYouCitizen() {return AreYouCitizen;}
    public WebElement getAddress1() {return Address1;}
    public WebElement getZipCode() {return ZipCode;}
    public WebElement getCity() {return City;}
    public WebElement getState() {return State;}
    public WebElement getPhonN() {return PhonN;}
    public WebElement getEmailAddress() {return EmailAddress;}
    public WebElement getTOtalAnnualIncom() {return TOtalAnnualIncom;}
    public WebElement getMonthlyMortgage() {return MonthlyMortgage;}
    public WebElement getSelectSecurityWordHint() {return SelectSecurityWordHint;}
    public WebElement getPutSecurityWord() {return PutSecurityWord;}
    public WebElement getSelectAgree1() {return selectAgree1;}
    public WebElement getSelectAgree2() {return SelectAgree2;}
    public WebElement getAgreeAndSubmit() {return AgreeAndSubmit;}


    public void hoverOverCreditCards(WebDriver driver){hoverOver(driver, getCreditCards());}
    public void ClickOnViewAll(){clickOn(getViewAllCreditCards());try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void scrolll(WebDriver driver){scrollToView(getLearnNApply(),driver);try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void ApplyFOr(){clickOn(getLearnNApply());try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void clickOnApplyNow(){clickOn(getApplyNow());try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}}

    public void clickOnName(){clickOn(getFirstName());}


    public void sendName(String value){typeInto(getFirstName(),value);}
    public void sendLastNam(String value){typeInto(getLastName(),value);}
    public void setSSN(String value){typeInto(getSSN(),value);}
    public void setDateOfBirth(String value){typeInto(getDateOfBirth(),value);}
    public void setAreYouCitizen(){clickOn(getAreYouCitizen());}
    public void setAddress1(String value){typeInto(getAddress1(),value);}
    public void setZipCode(String value){typeInto(getZipCode(),value);}
    public void setCity(String value){typeInto(getCity(),value);}
    public void selectStat(String value){selectDropdownElement(getState(),value);}
    public void scrol(WebDriver driver){scrollToView(getPhonN(),driver);}
    public void setPhonN(String value){typeInto(getPhonN(),value);}
    public void setEmailAddress(String value){typeInto(getEmailAddress(),value);}
    public void setTOtalAnnualIncom(String value){typeInto(getTOtalAnnualIncom(),value);}
    public void setMonthlyMortgage(String value){typeInto(getMonthlyMortgage(),value);}
    public void scrol1(WebDriver driver){scrollToView(getSelectSecurityWordHint(),driver);}
    public void clickToDropDown() {
        clickOn(getSelectSecurityWordHint());
    }
    public void setPutSecurityWord(String value){typeInto(getPutSecurityWord(),value);}
    public void setSelectAgree1(){clickOn(getSelectAgree1());}
    public void setSelectAgree2(){clickOn(getSelectAgree2());}
    public void scroll2(WebDriver driver){scrollToView(getAgreeAndSubmit(),driver);}
    public void setAgreeAndSubmit(){clickOn(getAgreeAndSubmit());}

}
