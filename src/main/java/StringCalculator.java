/**
 * Created by Manav Joshi on 19/03/2021 for Incubyte Technical Assessment.
 *
 * @return Addition of the given numbers.
 *
 */

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

            // Replace "\n" if present to "," and then split the String by comma.
            value = numbers.replace("\n",",").split(",");

            sum = addNumbers(value);
        }

        else if (numbers.startsWith("//")){
            char delimiter = numbers.charAt(2);
            value = numbers.substring(5).replace("\n",",").split(String.valueOf(delimiter));
            sum = addNumbers(value);
        }

        // String is single valued set sum to given value.
        else {
            sum = Integer.parseInt(numbers);
        }
        return sum;
    }

    // Returns sum of all numbers.
    public int addNumbers(String[] value){
        int sum = 0;

        // Sum up the numbers.
        for (int i = 0; i < value.length; i++){
            sum =  sum + Integer.parseInt(value[i]);
        }
        return sum;
    }
}
