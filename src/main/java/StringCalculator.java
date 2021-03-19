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

            // Split the string into individual numbers by comma.
            value = numbers.split(",");

            // Sum up the numbers.
            for (int i = 0; i < value.length; i++){
                sum =  sum + Integer.parseInt(value[i]);
            }

        }

        // String is single valued set sum to given value.
        else {
            sum = Integer.parseInt(numbers);
        }
        return sum;
    }

}
