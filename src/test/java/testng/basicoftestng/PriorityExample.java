package testng.basicoftestng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void priZ() {
        System.out.println("Priority Z");
    }

    @Test(priority = -2)
    public void priM() {
        System.out.println("Priority M");
    }

    @Test(priority = -2)
    public void priQ() {
        System.out.println("Priority Q");
    }

    @Test(enabled = true)
    public void priD() {
        System.out.println("Priority D");
    }

    @Test(priority = 5)
    public void priA() {
        System.out.println("Priority A");
    }
}
