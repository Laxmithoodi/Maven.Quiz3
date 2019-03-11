package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.isVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        Pattern vowel = Pattern.compile("^([aeiou]|y[^aeiou]|xr)");
        Pattern consone = Pattern.compile("^([^aeiou]?qu|[^aeiouy]+|y(?=[aeiou]))");

        String res = "";

        for (String word: str.split(" ")) {
            if (vowel.matcher(word).find())
                res += word;
            else {
                Matcher z = consone.matcher(word);
                if (z.find())
                    res += word.substring(z.end()) + z.group();
            }
            res += "ay ";
        }

        return res.substring(0, res.length() - 1);
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
