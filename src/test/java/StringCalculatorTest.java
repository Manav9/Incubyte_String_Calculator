/**
 *
 *  Created By Manav Joshi on 19/03/2021 for Incubyte Technical Assessment.
 *
 *  Test Class for String Calculator.
 *
 */


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    // It will initialize before every test.
    @Before
    public void setup(){
        stringCalculator = new StringCalculator();
    }

    // Empty String test.
    @Test
    public void returnZeroOnEmptyString(){
        String numbers = "";
        Assert.assertEquals(0,stringCalculator.Add(numbers));
    }

    // Single value test.
    @Test
    public void returnSameValueOnOneValueString(){
        String numbers = "1";
        Assert.assertEquals(Integer.parseInt(numbers),stringCalculator.Add(numbers));
    }

    // Two value test.
    @Test
    public void returnSumOfTwoValuesOnTwoValueString(){
        String numbers = "1,2";
        Assert.assertEquals(3,stringCalculator.Add(numbers));
    }
}
