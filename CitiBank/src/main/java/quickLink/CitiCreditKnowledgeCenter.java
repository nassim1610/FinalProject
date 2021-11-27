package quickLink;

import base.CommonAPI;
import org.hamcrest.core.CombinableMatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiCreditKnowledgeCenter extends CommonAPI {
    @FindBy(xpath = "//*[@id='navcreditCardmainAnchor0']")
    WebElement creditCards;
    @FindBy(xpath = "//a[@href='https://www.citi.com/credit-cards/knowledge-center']")
    WebElement KnowledgeCenter;
    @FindBy(xpath = "//*[contains(text(),'Learn how FICO')]/../p")
    WebElement clickOnFICO;
    @FindBy(css= "//div[@style='background-image: url(\"https://i.ytimg.com/vi_webp/OwIlRGsqxUg/maxresdefault.webp\");']")
    WebElement playVideo;

    public WebElement getCreditCards() {return creditCards;}
    public WebElement getKnowledgeCenter() {return KnowledgeCenter;}
    public WebElement getClickOnFICO() {return clickOnFICO;}
    public WebElement getPlayVideo() {return playVideo;}

    public void hove(WebDriver driver){hoverOver(driver,getCreditCards());}
    public void setKnowledgeCenter(){clickOn(getKnowledgeCenter());}
    public void scroll(WebDriver driver){scrollToView(getClickOnFICO(),driver);}
    public void setClickOnFICO(){clickOn(getClickOnFICO());}
    public void setPlayVideo(){clickOn(getPlayVideo());}


}
