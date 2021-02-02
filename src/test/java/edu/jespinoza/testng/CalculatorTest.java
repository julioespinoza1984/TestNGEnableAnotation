package edu.jespinoza.testng;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setup(){
        System.out.println("setup()");
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown(){
        System.out.println("tearDown()");
        calculator = null;
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod()");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod()");
    }

    @Test(enabled = false)
    public void testAdd(){
        System.out.println("testAdd");
        Assert.assertEquals(calculator.add(2, 3), 5.0);
    }

    @Test
    public void testSubtract(){
        System.out.println("@Test subtract");
        Assert.assertTrue(calculator.subtract(5, 3) > 1, "Subtract test failed");
    }
}