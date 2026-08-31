package week2p;

import java.util.HashSet;
import java.util.Set;

public class Day9 {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
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
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }

    /*  "To find the longest consecutive sequence in O(n) time,
     we need to find the start of each sequence and count how far it goes.
     I used a HashSet to achieve this because it gives us O(1) lookups."


     "The algorithm works in three clear steps:Deduplicate:
     First, I dump all the numbers into a HashSet. This lets us look up any number instantly and ignores duplicates.
     Find the Start: Next, I iterate through the unique numbers. To avoid redundant work,
     I only start counting a sequence if n - 1 does not exist in the set.
     This guarantees we only pitch our count from the absolute beginning of a sequence.Count the Sequence:
      Once a start is found, I use a while loop to check for current + 1, tracking the length and updating the global maximum."

     */


}
