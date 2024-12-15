package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = "smoke")
    public void verifyPayments(){
        Assert.assertTrue(true);
        System.out.println("verify Payments");
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
