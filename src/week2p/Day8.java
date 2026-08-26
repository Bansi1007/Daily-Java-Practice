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
