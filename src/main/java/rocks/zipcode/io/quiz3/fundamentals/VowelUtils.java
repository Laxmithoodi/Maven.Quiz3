package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {


    public static Boolean hasVowels(String word) {
       // return null;

        boolean hasA = false;
        boolean hasE = false;
        boolean hasI = false;
        boolean hasO = false;
        boolean hasU = false;

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                    hasA = true;
                    break;
                case 'e':
                    hasE = true;
                    break;
                case 'i':
                    hasI = true;
                    break;
                case 'o':
                    hasO = true;
                    break;
                case 'u':
                    hasU = true;
                    break;
                default:
                    continue;
            }

            if (hasA && hasE && hasI && hasO && hasU) {
                return true;
            }
        }
        return false;
    }


    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1)
                return word.indexOf(c);
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        if (word.matches("^[aeiou].*")) {
            return true;
        }else
            return false;

    }

    public static Boolean isVowel(Character character) {
        return "AEIOUaeiou".indexOf(character) != -1;

       // return null;
    }
}
