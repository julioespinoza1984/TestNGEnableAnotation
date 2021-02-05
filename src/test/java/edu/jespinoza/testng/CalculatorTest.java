package edu.jespinoza.testng;

import java.lang.reflect.Method;

import edu.jespinoza.testng.impl.CalculatorImpl;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    private static final Logger logger = Logger.getLogger(CalculatorTest.class);

    private Calculator calculator;

    @BeforeClass
    public void setup(){
        logger.info("setup()");
        calculator = CalculatorImpl.getInstance();
    }

    @AfterClass
    public void tearDown(){
        logger.info("tearDown()");
        calculator = null;
    }

    @BeforeMethod
    public void beforeMethod(){
        logger.info("beforeMethod()");
    }

    @AfterMethod
    public void afterMethod(){
        logger.info("afterMethod()");
    }

    @Test(enabled = false)
    public void testAdd(){
        logger.info("testAdd");
        Assert.assertEquals(calculator.add(2, 3), 5.0);
    }

    @Test
    public void testSubtract(){
        logger.info("@Test subtract");
        Assert.assertTrue(calculator.subtract(5, 3) > 1, "Subtract test failed");
    }
}