package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[@id='investingmainAnchor3']")
    WebElement investing;
    @FindBy(xpath = "//a[@id='Investing OverviewchildLink0']")
    WebElement overview;

    public WebElement getInvesting() {
        return investing;
    }

    public WebElement getOverview() {
        return overview;
    }

    public void hover(WebDriver driver) {
        hoverOver(driver, getInvesting());
    }

    public void setInvesting() {
        clickOn(getOverview());
    }

    @FindBy(xpath = "//a[@id='Self-Directed TradingchildLink1']")
    WebElement clickbalance;

    public WebElement getClickbalance() {
        return clickbalance;
    }

    public void setClickbalance() {
        clickOn(getClickbalance());
    }

    @FindBy(xpath = "//a[@id='navlendingmainAnchor2']")
    WebElement lendin;
    @FindBy(xpath = "//a[@id='Personal Loans & Lines of CreditchildLink0']")
    WebElement clickPersonal;

    public WebElement getLendin() {
        return lendin;
    }

    public WebElement getClickPersonal() {
        return clickPersonal;
    }

    public void setLendin(WebDriver driver) {
        hoverOver(driver, getLendin());
    }

    public void setClickPersonal() {
        clickOn(getClickPersonal());
    }

    @FindBy(xpath = "//a[@id='Home LendingchildLink1']")
    WebElement homelinding;

    public WebElement getHomelinding() {
        return homelinding;
    }

    public void setHomelinding() {
        clickOn(getHomelinding());
    }

    @FindBy(xpath = "//a[@id='Buy a HomechildLink2']")
    WebElement buyHome;
    @FindBy(xpath = "//a[contains(text(),'Start Your Application')]")
    WebElement startApp;

    public WebElement getBuyHome() {
        return buyHome;
    }

    public WebElement getStartApp() {
        return startApp;
    }

    public void setBuyHome() {
        clickOn(getBuyHome());
    }

    public void scroltoApply(WebDriver driver) {
        scrollToView(getStartApp(), driver);
    }

    public void setStartApp() {
        clickOn(getStartApp());
    }

    @FindBy(xpath = "//a[@id='Refinance Your HomechildLink3']")
    WebElement refinance;

    public WebElement getRefinance() {
        return refinance;
    }

    public void setRefinance() {
        clickOn(getRefinance());
    }

    @FindBy(xpath = "//a[@id='Use Your Home EquitychildLink4']")
    WebElement useHomeEquity;
    @FindBy(xpath = "//body/div[2]/div[1]/main[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[3]/span[2]/a[1]/span[1]/span[1]")
    WebElement call;

    public WebElement getUseHomeEquity() {
        return useHomeEquity;
    }

    public WebElement getCall() {
        return call;
    }

    public void setUseHomeEquity() {
        clickOn(getUseHomeEquity());
    }

    public void setCall() {
        clickOn(getCall());
    }

    @FindBy(xpath = "//*[@href='https://online.citi.com/US/JRS/portal/template.do?ID=refinance_and_mortgage_calculators']")
    WebElement Mortage;

    public WebElement getMortage() {
        return Mortage;
    }

    public void setMortage() {
        clickOn(getMortage());
    }

    @FindBy(xpath = "//*[@href='https://online.citi.com/US/JRS/portal/template.do?ID=mortgage_heloc']")
    WebElement homeEquity;

    public WebElement getHomeEquity() {
        return homeEquity;
    }

    public void setHomeEquity() {
        clickOn(getHomeEquity());
    }

    @FindBy(xpath = "//a[@id='navbankingmainAnchor1']")
    WebElement bankig;
    @FindBy(xpath = "//*[@href='https://online.citi.com/US/ag/banking/checking-account']")
    WebElement checking;
    @FindBy(css = "#btn-switch-zipcode")
    WebElement chenge;

    public WebElement getBankig() {
        return bankig;
    }

    public WebElement getChecking() {
        return checking;
    }

    public WebElement getChenge() {
        return chenge;
    }

    public void setBankigg(WebDriver driver) {
        hoverOver(driver, getBankig());
    }

    public void setChecking() {
        clickOn(getChecking());
    }

    public void setChenge() {
        clickOn(getChenge());
    }

    @FindBy(xpath = "//a[@id='SavingschildLink1']")
    WebElement saving;
    @FindBy(xpath = "//a[@id='90928bab-910d-4064-823a-408bf1dfd3f6']")
    WebElement openAccount;
    @FindBy(xpath = "//body/span[@id='kampyleButtonContainer']/button[@id='nebula_div_btn']/img[1]")
    WebElement clickFCB;

    public WebElement getSaving() {
        return saving;
    }

    public WebElement getOpenAccount() {
        return openAccount;
    }

    public WebElement getClickFCB() {
        return clickFCB;
    }

    public void setSaving() {
        clickOn(getSaving());
    }

    public void setOpenAccount() {
        clickOn(getOpenAccount());
    }

    public void setClickFCB() {
        clickOn(getClickFCB());
    }

    @FindBy(xpath = "//a[@id='Certificates of DepositchildLink3']")
    WebElement certificatOfDepo;
    @FindBy(xpath = "//button[contains(text(),'Learn More')]")
    WebElement learnMore;

    public WebElement getCertificatOfDepo() {
        return certificatOfDepo;
    }

    public WebElement getLearnMore() {
        return learnMore;
    }

    public void setCertificatOfDepo() {
        clickOn(getCertificatOfDepo());
    }

    public void setLearnMore() {
        clickOn(getLearnMore());
    }


}

