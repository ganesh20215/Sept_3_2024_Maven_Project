package testng.parametization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "test-data")
    public Object[][] dataFun(){
        return new Object[][]{
                {"Java", "Delhi"}, {"Selenium", "Mumbai"}
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyCourseSearch(String courseName, String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName +" "+ cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Assert.assertTrue(false);

        Thread.sleep(3000);

        driver.close();
    }
}
