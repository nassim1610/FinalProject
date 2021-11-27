package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GetHelp extends CommonAPI {

    @FindBy(xpath = "//*[@id='personetics-citi-menu']")
    WebElement howCanWeHelp;
    @FindBy(xpath = "//*[@id='autocomplete-search-panel']")
    WebElement lookFor;
    @FindBy(xpath = "//*[@id='faq-02600-label']")
    WebElement howtoreopenaccount;
    @FindBy(xpath = "//*[@name='select-pages']")
    WebElement getAdditionPage;
    @FindBy(xpath="//*[@id='faq-09456-label']")
    WebElement applyForCitiBAccount;


    public WebElement getHowCanWeHelp() { return howCanWeHelp;}
    public WebElement getLookFor() { return lookFor; }
    public WebElement getGetAdditionPage() {  return getAdditionPage;}
    public WebElement getHowtoreopenaccount() {return howtoreopenaccount;}
    public WebElement getApplyForCitiBAccount() {return applyForCitiBAccount;}


    public void helpIcon()  {clickOn(getHowCanWeHelp());try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void input1(String str)  {typeEnter(getLookFor(),str);try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}
    public void additionPage(){
        clickOn(getGetAdditionPage());
   }
    public void clickOnHowToReopenAccount() throws InterruptedException {clickOn(getHowtoreopenaccount());
        Thread.sleep(2000);}
    public void clickOnApplyForCitiBAccount() throws InterruptedException {clickOn(getApplyForCitiBAccount());
        Thread.sleep(2000);}



}