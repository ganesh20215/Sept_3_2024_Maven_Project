package testng.basicoftestng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = "smoke")
    public void verifyPayments(){
        Assert.assertTrue(true);
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyExecution(){
        System.out.println("verify Execution");
    }

    @Test
    public void verifyReports(){
        System.out.println("verify Payments");
    }

}
