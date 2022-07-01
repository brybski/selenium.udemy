package seleniumWebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

    @Test
    public void findElementByName() {
        WebDriver driver = getDriver();
        WebElement movieTitle = driver.findElement(By.name("your-movie"));
        driver.quit();
        }

    @Test
    public void findByClassName() {
        WebDriver driver = getDriver();
        WebElement numbersRadioButtons = driver.findElement(By.className("number"));
        driver.quit();
    }
@Test
    public void findByTagName () {
       WebDriver driver = getDriver();
       WebElement footer = driver.findElement(By.tagName("footer"));
       driver.quit();
    }
@Test
    public void findByCssSelector () {
       WebDriver driver = getDriver();
       WebElement coloursFullClassName = driver.findElement(By.cssSelector("span[class='wpcf7-form-control-wrap colour']"));
       WebElement coloursClassName = driver.findElement(By.cssSelector(".colour"));
       WebElement coloursId = driver.findElement(By.cssSelector("#colour-select-multiple"));
       driver.quit();
   }

   @Test
    public void findByXpath () {
       WebDriver driver = getDriver();
       WebElement number3 = driver.findElement(By.xpath("//*[@id=\"number-radio\"]/span[3]"));
       WebElement greenColour = driver.findElement(By.xpath("//*[@id=\"colour-select-multiple\"]/option[3]"));
       WebElement greenColour2 = driver.findElement(By.xpath("//*[text()='Zielony']"));
       driver.quit();
   }

   @Test
   public void findGroups () {
       WebDriver driver = getDriver();
       List<WebElement> options = driver.findElements(By.tagName("option"));
       driver.quit();
   }
}
