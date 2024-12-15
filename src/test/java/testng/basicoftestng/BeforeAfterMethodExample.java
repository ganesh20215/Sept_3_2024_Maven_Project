package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequisite() {
        driver = new ChromeDriver();
    }

    @Test
    public void testScriptForTestNG() {
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
    }

    @Test
    public void testScriptForFlipkart() {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testScriptForFacebook() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void postRequisite() {
        driver.close();
    }
}
