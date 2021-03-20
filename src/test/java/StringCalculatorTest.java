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

    // Unknown amount of value test.
    @Test
    public void returnSumOfUnknownValuesOnUnknownValueString(){
        String numbers = "1,2,3,4,5,6";
        Assert.assertEquals(21,stringCalculator.Add(numbers));
    }

    // Values separated by comma and new line test.
    @Test
    public void returnSumOfUnknownValuesOnUnknownValuesSeparatedByNewLine(){
        String numbers = "1,2\n3";
        Assert.assertEquals(6,stringCalculator.Add(numbers));
    }

    // Different delimiters test.
    @Test
    public void  returnSumOfUnknownValuesOnDifferentDelimiters(){
        String numbers = "//;\\n1;2";
        Assert.assertEquals(3,stringCalculator.Add(numbers));
    }

    // Exception when negative number is passed.
    @Test
    public void returnExceptionAndNegativeValueOnNegativeValueString(){
        try {
            String numbers = "-1,2";
            stringCalculator.Add(numbers);
            Assert.fail();
        }catch (Exception e){
            Assert.assertEquals("negatives not allowed [-1]",e.getMessage());
        }
    }

    // Exception when multiple negative numbers are passed.
    @Test
    public void returnExceptionAndNegativeValueOnMultipleNegativeValueString(){
        try {
            String numbers = "-1,2,-3,4,5,-6,-7";
            stringCalculator.Add(numbers);
            Assert.fail();
        }catch (Exception e){
            Assert.assertEquals("negatives not allowed [-1, -3, -6, -7]",e.getMessage());
        }
    }

    // Number Bigger than 1000 should be ignored.
    @Test
    public void numbersBiggerThan1000ShouldBeIgnored(){
        String numbers = "1,1001,2,3";
        Assert.assertEquals(6,stringCalculator.Add(numbers));
    }

    // Delimiter of any length should be accepted.
    @Test
    public void delimiterOfAnyLength(){
        String numbers = "//[***]\n1***2***3";
        Assert.assertEquals(6,stringCalculator.Add(numbers));
    }
}