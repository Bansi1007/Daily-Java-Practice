package week1p;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day6 {
    static void main(String[] args) {
        firstUniqueChar("loveleetcode");
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(nums, 3);

        int[] a = {1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        int[] b = {2, 5, 6};

        //Day6 d = new Day6();
       //d.mergeSortedArray(a, m, b, n);


    }

    /* First Unique CharacterEasy
     Return the index of the first character in a string that does not repeat, or -1 if there is none.

             Example. loveleetcode -> 2*/
    public static int firstUniqueChar(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("enter valid string");
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(i);
                return i;
            }
        }

        //using streams
        Map<Character, Long> frequencies = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity()
                        ,LinkedHashMap::new,
                        Collectors.counting()
                ));

        // 2. Find the first character with a frequency count of 1
      /*  return frequencies.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .map(str::indexOf) // Get the original index of that unique character
                .orElse(-1);    // Return -1 if no unique character exists*/

        //or part 2 below

        // SENIOR OPTIMIZATION: Stream the indices directly
        return IntStream.range(0, str.length())
                .filter(i -> frequencies.get(str.charAt(i)) == 1)
                .findFirst()
                .orElse(-1);
/*

        "Instead of using indexOf at the end, which requires a separate linear scan of the string," +
                " I chose to stream the integer range of the string's indices. By filtering the indices against our frequency map," +
                " we get O(1) lookups. Combined with findFirst()," +
                " the stream evaluates lazily and short-circuits the moment the first unique index is found, maximizing efficiency."
*/

}

  /*  Rotate ArrayMedium
    Rotate an array to the right by k steps, in place.

    Example. [1,2,3,4,5,6,7], k = 3 -> [5,6,7,1,2,3,4]*/

    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    /* Merge Sorted ArrayEasy
     Merge two sorted arrays into the first one, which has spare space at the end. Array a holds m real values, array b holds n.

             Example. a = [1,2,3,0,0,0], m = 3, b = [2,5,6], n = 3 -> [1,2,2,3,5,6]*/
    public void mergeSortedArray(int[] a, int m, int[] b, int n) {
        int i = m - 1, j = n - 1, write = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && a[i] > b[j]) {
                a[write--] = a[i--];
            } else {
                a[write--] = b[j--];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
