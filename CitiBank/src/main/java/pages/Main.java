package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nassi\\IdeaProjects\\FinalProject\\Generic\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.citi.com");
         driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='personetics-citi-menu']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='autocomplete-search-panel']")).sendKeys("open account", Keys.ENTER);


    }
}
