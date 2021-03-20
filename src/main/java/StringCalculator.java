/**
 * Created by Manav Joshi on 19/03/2021 for Incubyte Technical Assessment.
 *
 * Addition of the given numbers.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int Add(String numbers)
    {
        int sum = 0;
        String[] value;

        // If String is empty set sum = 0.
        if (numbers.isEmpty()){
            sum = 0;
        }

        // Check if String is comma separated.
        else if (numbers.contains(",")){

            if (numbers.contains("-")){
                List<Integer> negativeNumbers = getNegativeNumbers(numbers);
                throw new RuntimeException("negatives not allowed " + negativeNumbers);
            }

            // Replace "\n" if present to "," and then split the String by comma.
            value = numbers.replace("\n",",").split(",");

            sum = addNumbers(value);
        }

        else if (numbers.startsWith("//")){
            if (numbers.contains("[")){
                int startIndex = numbers.indexOf("[")+1;
                int endIndex = numbers.indexOf("]");
                int subStringIndex = numbers.indexOf("\n") + 1;
                String delimiter = numbers.substring(startIndex,endIndex);
                value = numbers.substring(subStringIndex).replace(delimiter,",").split(",");
                sum = addNumbers(value);
            }
            else {
                char delimiter = numbers.charAt(2);
                value = numbers.substring(5).replace("\n",",").split(String.valueOf(delimiter));
                sum = addNumbers(value);
            }
        }

        // String is single valued set sum to given value.
        else {
            sum = Integer.parseInt(numbers);
        }
        return sum;
    }

    // Returns a list of negative integers present in the string.
    private List<Integer> getNegativeNumbers(String numbers) {
        List<Integer> negativeNumbers = new ArrayList<>();
        String[] values =   numbers.replace("\n",",").split(",");
        for (String s: values){
            if (Integer.parseInt(s) < 0){
                negativeNumbers.add(Integer.parseInt(s));
            }
        }
        return negativeNumbers;
    }

    // Returns sum of all numbers.
    public int addNumbers(String[] value){
        int sum = 0;
        // Sum up the numbers.
        for (String s : value) {

            // Checks if the value is lesser than 1001.
            if (Integer.parseInt(s) <1001){
                sum = sum + Integer.parseInt(s);
            }
        }
        return sum;
    }
}
