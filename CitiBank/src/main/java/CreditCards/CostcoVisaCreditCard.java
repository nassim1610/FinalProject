package CreditCards;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostcoVisaCreditCard extends CommonAPI {
    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id='View All Credit CardschildLink0']")
    WebElement ViewAllCreditCards;

    @FindBy(xpath = "//*[@data-src='/CRD/images/costco-anywhere/costco-anywhere_222x140.png']")
    WebElement LearnNApply;
    @FindBy(xpath = "//button[contains(text(),'Apply Now')]/../../../div/ui-card-button/button")
    WebElement ApplyNow;
    @FindBy(xpath = "//*[@id='AFFINITY_NUMBER_PRIMARY-citiTextBlur']")
    WebElement MembershipNumber;

    public WebElement getMembershipNumber() {
        return MembershipNumber;
    }

    @FindBy(xpath = "//*[@id='FIRST_NAME']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@id='LAST_NAME']")
    WebElement LastName;

    public WebElement getClickAddress1() {
        return clickAddress1;
    }

    @FindBy(xpath = "//*[@id='EDIT_ADDRESSLINE']")
    WebElement clickAddress1;
    @FindBy(xpath = "//*[@id='ADDRESS_LINE1']")
    WebElement Address1;
    @FindBy(xpath = "//*[@id='SSN-citiTextBlur']")
    WebElement SSN;
    @FindBy(xpath = "//*[@id='DOB-citiTextBlur']")
    WebElement DateOfBirth;
    @FindBy(xpath = "//*[@id='COUNTRY_OF_CITIZENSHIP']")
    WebElement Citizen;

    @FindBy(xpath = "//*[@id='ZIP']")
    WebElement ZipCode;
    @FindBy(xpath = "//*[@id='CITY']")
    WebElement City;
    @FindBy(xpath = "//*[@id='STATE']")
    WebElement State;
    @FindBy(xpath = "//*[@id='MOBILE_PHONE-citiTextBlur']")
    WebElement PhonN;
    @FindBy(xpath = "//*[@id='EMAIL_ADDRESS']")
    WebElement EmailAddress;

    public WebElement getCreditCards() {return creditCards;}
    public WebElement getViewAllCreditCards() {return ViewAllCreditCards;}
    public WebElement getLearnNApply() {return LearnNApply;}
    public WebElement getApplyNow() {return ApplyNow;}
    public WebElement setMembershipN() {return getMembershipNumber();}
    public WebElement getFirstName() {return FirstName;}
    public WebElement getLastName() {return LastName;}
    public WebElement getSSN() {return SSN;}
    public WebElement getDateOfBirth() {return DateOfBirth;}
    public WebElement getAreYouCitizen() {return Citizen;}
    public WebElement getAddress1() {return Address1;}
    public WebElement getZipCode() {return ZipCode;}
    public WebElement getCity() {return City;}
    public WebElement getState() {return State;}
    public WebElement getPhonN() {return PhonN;}
    public WebElement getEmailAddress() {return EmailAddress;}

    public void hoverOverCreditCards(WebDriver driver){hoverOver(driver, getCreditCards());}
    public void ClickOnViewAll(){clickOn(getViewAllCreditCards());try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void scrolll(WebDriver driver){scrollToView(getLearnNApply(),driver);try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void ApplyFOr(){clickOn(getLearnNApply());try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void clickOnApplyNow(){clickOn(getApplyNow());try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void setMembershipNumber(String value){typeInto(getMembershipNumber(),value);}
    public void clickOnName(){clickOn(getFirstName());}

    public void sendName(String value){typeInto(getFirstName(),value);}
    public void sendLastNam(String value){typeInto(getLastName(),value);}
    public void setSSN(String value){typeInto(getSSN(),value);}
    public void setDateOfBirth(String value){typeInto(getDateOfBirth(),value);}
    public void setAreYouCitizen(){clickOn(getAreYouCitizen());}
    public void setClickAddress1(){clickOn(getClickAddress1());}
    public void setAddress1(String value){typeInto(getAddress1(),value);}
    public void setZipCode(String value){typeInto(getZipCode(),value);}
    public void setPhonN(String value){typeInto(getPhonN(),value);}
    public void setEmailAddress(String value){typeInto(getEmailAddress(),value);}


}
