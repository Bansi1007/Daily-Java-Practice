package week2p;

import java.util.HashMap;
import java.util.Map;

public class Day11 {
    static void main(String[] args) {

    }


   /* Longest Substring Without Repeating Characters
    Find the length of the longest substring with no repeated character.

            Example. abcabcbb -> 3 (abc)*/

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map = new HashMap<>();
        int start  = 0;
        int best  = 0;

       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if (map.containsKey(ch)){
               start = Math.max(best,map.get(ch)+1);
           }
           map.put(ch,i);
           best = Math.max(best,i-start+1);
       }
        return best;
    }

    /*"To solve the Longest Substring Without Repeating Characters problem,
     I used an optimized sliding window algorithm with a hash map to achieve an efficient \(O(N)\) time complexity.
     The core strategy is to maintain a dynamic window defined by a start and an end pointer.
      As I iterate through the string with the end pointer, I track the most recent index of each character in a hash map called lastSeen.
      If I encounter a character that we’ve already seen, it means we have a duplicate.
      Instead of naively shrinking the window one step at a time,
      I instantly jump the start pointer forward to one index past the duplicate's last known position.
      However, to prevent the window from accidentally moving backward into old, invalid indices,
      I use Math.max against the current start.Finally, at every iteration,
       I update the character's new position and calculate the current window length using end - start + 1,
       tracking the global maximum in best. This approach ensures we scan the string in a single pass."*/


   /* Maximum SubarrayMedium
    Find the largest sum of any contiguous subarray.

    Example. [-2,1,-3,4,-1,2,1,-5,4] -> 6*/

    public int maxSubArray(int[] nums) {
        int current =  nums[0];
        int best = nums[0];
        for(int i=1;i<nums.length;i++){
            current = Math.max(nums[i],current+nums[i]);
            best = Math.max(current,best);
        }
        return best;
    }

    /*"This is Kadane's Algorithm, which runs in O(N) time and O(1) space.
    It uses Math.max at each element to make a brutal choice: Do I extend my running streak,
    or do I start a brand-new subarray right here?If the past streak is negative,
    it drags us down, so we reset our starting point. We then update our global best score on the fly in a single pass."*/
}
