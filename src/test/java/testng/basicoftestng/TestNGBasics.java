package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGBasics {

    @Test
    public void testScriptForTestNG(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void testScriptForFlipkart(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void testScriptForFacebook(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
