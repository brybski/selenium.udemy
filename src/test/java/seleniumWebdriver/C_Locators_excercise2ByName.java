package seleniumWebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Locators_excercise2ByName {

    public WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }
@Test
    public void findElementByName() {
        WebDriver driver = getDriver();
        WebElement movieTitle = driver.findElement(By.name("your-movie"));
        driver.quit();
    }
}
