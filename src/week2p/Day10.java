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

   /* Container With Most Water
    Each array value is the height of a vertical line. Pick the two lines that hold the most water between them.

            Example. [1,8,6,2,5,4,8,3,7] -> 49*/

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while(left<right){
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea =  Math.max(maxArea, currentArea);

            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }

        }
        return maxArea;
    }

  /*
    1. The Strategy (The "Why")"To solve the Container With Most Water problem optimally," +
            " we must move away from a brute-force O(N²) approach and exploit a fundamental geometric property of the container." +
            "The volume of water is constrained by two factors: width and the height of the shorter line. " +
            "If we start at the maximum possible width—by placing pointers at the absolute " +
            "left and right ends of the array—we establish a baseline area."*/


   /* 2. The Core Optimization (The "Aha!" Moment)"From there, we can prune the search space efficiently." +
            " If we move the pointer corresponding to the taller line, the width decreases, " +
            "but our height bottleneck remains entirely unchanged or gets worse. " +
            "Therefore, moving the taller line can never yield a larger area." +
            "The only logical way to potentially find a larger container is to abandon the shorter line and move its pointer inward," +
            " searching for a taller boundary."*/



}
