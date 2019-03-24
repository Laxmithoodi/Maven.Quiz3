package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {

        Arrays.sort(input);
        Arrays.sort(squaredValues);

        for(int i = 0; i < input.length; i++) {
            int square = input[i] * input[i];
            if (square != squaredValues[i]) {
                return false;
            }
        }

        return true;


    }
}
