package week1p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 {
    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        AnagramEasy(s, t);

        String[] strarr = new String[]{"flower", "flow", "flight"};
        longestCommonPrefix(strarr);
    }

  /*  Valid AnagramEasy
    Given two strings, decide whether one is a rearrangement of the other.

            Example. s = anagram, t = nagaram -> true*/

    public static boolean AnagramEasy(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            System.out.println("false");
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println(". Time O(n), space O(1)");
        System.out.println("true");
        return true;
    }

/*
    Find the longest starting string shared by every string in an array. Return an empty string if there is none.

            Example. [flower, flow, flight] -> fl*/

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            System.out.println("false");
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("false");
                    return "";
                }
            }
        }
        System.out.println("time complexity - o(n)-----space - o(1)");
        System.out.println(prefix);
        return prefix;
    }
}




