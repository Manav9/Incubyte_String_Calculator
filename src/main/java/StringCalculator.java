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
        if (numbers.isEmpty()){
            sum = 0;
        }
        else {
            sum = Integer.parseInt(numbers);
        }
        return sum;
    }

}
