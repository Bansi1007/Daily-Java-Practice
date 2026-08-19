package week2p;

import java.util.HashSet;
import java.util.Set;

public class Day9 {
    static void main(String[] args) {
        int[]nums = {1,2,3,4};
        arrayExceptSelf(nums);

        Day9 d = new Day9();
        d.longestConsecutive(nums);
    }

   /* Product of Array Except SelfMedium
    For each index, return the product of every other element. No division allowed.

            Example. [1,2,3,4] -> [24,12,8,6]*/

    public static void arrayExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int leftProduct =0;
        for(int i=0; i<n; i++){
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }
        int rightProduct =1;
        for(int i=n-1; i>=0; i++){
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }
    }

    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int n:set){
            if(!set.contains(n-1)){
                int current = n;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }

}
