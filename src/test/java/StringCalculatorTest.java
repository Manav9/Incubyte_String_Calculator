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
    public void emptyString(){
        String numbers = "";
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0,stringCalculator.Add(numbers));
    }
}
