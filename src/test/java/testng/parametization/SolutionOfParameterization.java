package testng.parametization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SolutionOfParameterization {

    public static WebDriver driver;

    @Parameters("browserName")
    @BeforeMethod
    public void test_prerequsite(String browserName){
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        }else if (browserName.equals("firefox")){
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Please select the correct browser name");
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyCourseSearch(String courseName, String cityName) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName +" "+ cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
