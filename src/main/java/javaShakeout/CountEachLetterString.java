package javaShakeout;

import java.net.Inet4Address;
import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachLetterString {
    /* How to find count of each letter in the String
     * Given: Hello
     * Output: {H=1, e=1, l=2, o=1}
     *Explanation:
     * Method iterates through each character of the input string using a loop. Since we want to count letters regardless of their case, we convert each character to its  lowercase form.
     *We can use a Map data structure to store the occurrences of each letter. The keys of the map will be the letters, and the values will be their corresponding counts. */

    public static Map<Character, Integer> countLetter(String str) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //First iteration i=0 ch=H, Second iteration i=1=e
            char lowerCaseCh = Character.toLowerCase(ch);//to count letters regardless of their case First iteration ch-h
            if (result.containsKey(lowerCaseCh)) {
                int count = result.get(lowerCaseCh);
                result.replace(lowerCaseCh, ++count);// If condition has been met, it will update a map
            } else {
                result.put(lowerCaseCh, 1);//First iteration (h,1)
            }
        }
        return result;//First iteration h,1 {h=1} Second iteration {h=1, e=1}
    }

    public static void main(String[] args) {
        System.out.println(countLetter("Helloh"));
    }
}

