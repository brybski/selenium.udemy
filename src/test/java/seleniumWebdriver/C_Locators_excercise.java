package seleniumWebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Locators_excercise {

   public WebDriver getDriver() {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://programautomatycy.pl/test-page/");
       return driver;
   }
    @Test
    public void excercise1() {
    WebDriver driver = getDriver();
    WebElement bookTitleById = driver.findElement(By.id("book-text"));
    driver.quit();
    }

}
