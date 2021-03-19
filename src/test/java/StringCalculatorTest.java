/**
 *
 *  Created By Manav Joshi on 19/03/2021 for Incubyte Technical Assessment.
 *
 *  Test Class for String Calculator.
 *
 */


import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void returnZeroOnEmptyString(){
        String numbers = "";
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0,stringCalculator.Add(numbers));
    }

    @Test
    public void returnSameValueOnOneValueString(){
        String numbers = "1";
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(Integer.parseInt(numbers),stringCalculator.Add(numbers));
    }

    @Test
    public void returnSumOfTwoValuesOnTwoValueString(){
        String numbers = "1,2";
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(3,stringCalculator.Add(numbers));
    }
}
