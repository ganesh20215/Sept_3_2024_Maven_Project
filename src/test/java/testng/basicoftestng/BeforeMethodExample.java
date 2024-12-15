package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.*;
import testng.failscriptsexecution.FailScriptExecutor;

public class BeforeMethodExample {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class Example");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class Example");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void test_1(){
        System.out.println("test 1");
    }

    @Test
    public void test_2(){
        Assert.assertTrue(false);
        System.out.println("test 2");
    }

    @Test
    public void test_3(){
        System.out.println("test 3");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

}
