package week2p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day10 {
    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

    //  3Sum  Find all unique triplets in an array that sum to zero. Example. [-1,0,1,2,-1,-4] -> [[-1,-1,2], [-1,0,1]]
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                int sum = arr[right] + arr[left] + arr[i];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
