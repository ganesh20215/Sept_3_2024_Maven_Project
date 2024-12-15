package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test(description = "Verify login with valid username and valid password")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }

    @Test
    public void verifyAccountCreation(){
        System.out.println("verify Account Creation");
    }
}
