package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {




        int index=str.indexOf("h");
        String newInput = str.replace(str.charAt(index), Character.toUpperCase(str.charAt(index)));
       // Character ch = str.toLowerCase().charAt(indexToCapitalize);

      //  String out = Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(1).toLowerCase();


        return newInput;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Character ch = baseString.charAt(indexOfString);


        return ch.equals(characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {


        String[] str = new String[string.length()];


        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
               //  string.substring(i,j);
                System.out.println(string.substring(i, j));
            }
        }


        return str;
    }



    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        int x = n * (n + 1) / 2 -1;
        return x;


        //return null;
    }
}
