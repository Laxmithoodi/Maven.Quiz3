package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    private static final Character[] VOWELS = {'A', 'E','I', 'O', 'U',
                                             'a', 'e', 'i', 'o','u'};


    public static Boolean hasVowels(String word) {

        for (int i = 0; i < VOWELS.length; i++) {
          if(word.contains(VOWELS[i].toString())){
              return true;
          }

        }
//        for(int i=0;i <word.length();i++){
//            if((word.charAt(i) == 'a') ||
//                    (word.charAt(i) == 'e')  ||
//                    (word.charAt(i) == 'i') ||
//                    (word.charAt(i) == 'o') ||
//                    (word.charAt(i) == 'u')) {
//                //word.charAt(i);
//                //System.out.println(" The String contains " + str.charAt(i));
//                return true;
//            }
//        }
        return false;
    }



    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1)
                return word.indexOf(c);
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        String vowels = "aeiouAEIOU";
        String result = "";
        return vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1;

    }

    public static Boolean isVowel(Character character) {

        return "AEIOUaeiou".indexOf(character) != -1;

    }
}
