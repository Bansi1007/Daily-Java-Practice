package week2p;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Day8 {
    static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 2, 2,};
        Day8 d = new Day8();
        d.topKFrequentElements(array, 2);
        int[]nums = {2,0,1,2,1,1,0};
        sortArray(nums);
    }


    public int[] topKFrequentElements(int[] arr, int k) {

        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
    /*
    *"I implemented this using Java Streams to prioritize declarative, " +
            "highly readable code.First, I stream the array, box the primitives," +
            " and use a groupingBy collector combined with Collectors.counting() to build a frequency map of the elements in a single pass." +
            "Next, I stream the map's entry set and sort it in descending order based on the frequency values using a custom comparator." +
            " Finally, I apply .limit(k) to short-circuit and grab only the top K items, map them back to their integer keys," +
            " and collect them into the final primitive array.In terms of complexity:Time Complexity: This runs in \(O(N \log N)\) time " +
            "because sorting the entry set dominates the runtime, " +
            "where N is the number of unique elements.Space Complexity: It takes O(N) space to store the frequencies in the map.*/



    //Sort an array containing only 0, 1 and 2 in a single pass without a library sort.
    //Example. [2,0,2,1,1,0] -> [0,0,1,1,2,2]
    // you must use the Dutch National Flag Algorithm.

    public static void sortArray(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
