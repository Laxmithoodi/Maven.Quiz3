package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.isVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (VowelUtils.startsWithVowel(word)) {
                builder.append(word + "way" + " ");
            }else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == null) {
                    builder.append(word + "ay" + " ");
                } else {
                    String begin = word.substring(0, vowelIndex);
                    String end = word.substring(vowelIndex);
                    String finalWord = end + begin + "ay";
                    builder.append(finalWord + " ");
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();

    }

}


//
//        String temp = str.toLowerCase();
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        char first = temp.charAt(0);
//
//
//        for (int i = 0; i < vowels.length; i++) {
//            if (first == vowels[i]) {
//                return str + "way";
//            }
//        }
//
//        str = str.substring(1);
//        str += first + "ay";
//
//
//        return str;
//    }
