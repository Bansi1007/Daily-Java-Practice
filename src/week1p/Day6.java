package week1p;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day6 {
    static void main(String[] args) {
        firstUniqueChar("loveleetcode");
    }
   /* First Unique CharacterEasy
    Return the index of the first character in a string that does not repeat, or -1 if there is none.

            Example. loveleetcode -> 2*/
    public static void firstUniqueChar(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("enter valid string");
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                System.out.println(i);
                return;
            }
        }
    }
}
