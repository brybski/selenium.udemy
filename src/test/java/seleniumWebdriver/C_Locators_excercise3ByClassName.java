package seleniumWebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C_Locators_excercise3ByClassName extends C_Locators {
    @Test
    public void selectByClassName() {
        WebDriver driver = getDriver();
        WebElement numbersRadioButtons = driver.findElement(By.className("number"));
        driver.quit();
    }

}
