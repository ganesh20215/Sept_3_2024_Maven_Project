package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHardAssertExample() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("bmwradio"));
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        Assert.assertFalse(element.isDisplayed(), "radio btn should display");
        Assert.assertTrue(textBox.isEnabled(), "text box should be enabled");
        driver.close();
    }
}
