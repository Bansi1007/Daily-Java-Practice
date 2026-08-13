package week1p;

import java.lang.reflect.Array;
import java.util.*;

public class Day3 {
    static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        //checkDuplicates(nums);
        String[] words = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagramString(words);
    }



    /*Return true if any value appears at least twice in the array.

            Example. [1,2,3,1] -> true*/

    public static boolean checkDuplicates(int[] nums) {
       HashSet<Integer>seen = new HashSet<>();
       for(int num:nums){
           if (!seen.add(num)){
               System.out.println("duplicate found");
               return true;
           }
       }
        System.out.println("no duplicate found");
       return false;
    }

/*
    Group a list of strings so that anagrams of each other end up in the same list.

            Example. [eat, tea, tan, ate, nat] -> [[eat, tea, ate], [tan, nat]]*/

    public static void groupAnagramString(String[] strs) {
      Map<String, List<String>> group = new HashMap<>();
      for (String word:strs){
          char[] chars = word.toCharArray();
          Arrays.sort(chars);
          String key = new String(chars);
          group.computeIfAbsent(key,k->new ArrayList<>()).add(word);
          System.out.println(group.values());
      }
    }
}
