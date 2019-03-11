package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {



        return null;
    }

    public SomeType findEvenOccurringValue() {

        int i;
        for (i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count % 2 != 0)
                return array[i];
        }


        return null;
    }



    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int countOccurence =0;
        for(SomeType element : array){
            if(element.equals(valueToEvaluate)){
                countOccurence++;
            }
        }
        return countOccurence;

    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {


        return null;
    }
}
