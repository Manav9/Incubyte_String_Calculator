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
        if (numbers.isEmpty()){
            sum = 0;
        }
        else if (numbers.contains(",")){
            value = numbers.split(",");
            for (int i = 0; i < value.length; i++){
                sum =  sum + Integer.parseInt(value[i]);
            }

        }
        else {
            sum = Integer.parseInt(numbers);
        }
        return sum;
    }

}
