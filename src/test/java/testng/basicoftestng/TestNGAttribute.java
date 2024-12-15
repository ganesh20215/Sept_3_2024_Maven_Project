package testng.basicoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 10, invocationTimeOut = 100)
    public void testNGAttribute(){
        System.out.println("TestNG Invocation Attribute");
    }
}
