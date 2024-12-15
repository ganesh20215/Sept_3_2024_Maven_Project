package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("bmwradio"));
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        softAssert.assertFalse(element.isDisplayed(), "radio btn should display");
        softAssert.assertFalse(textBox.isEnabled(), "text box should be enabled");
        softAssert.assertEquals(driver.getTitle(), "practice page","Practice Page text should be match");
        softAssert.assertAll();
        driver.close();
    }
}
