package week1p;

import java.util.HashMap;
import java.util.Map;

public class Day1 {
    static void main(String[] args) {
        int[] num = {6, 2, 3, 4, 5,};
        sumOfTwo(num, 10);
        maxProfit(num);
    }

    //Given an int array and a target, return the indices of the two numbers that add up to the target. Exactly one answer exists
    public static int[] sumOfTwo(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
            if (map.containsKey(target - array[i])) {
                System.out.println((map.get(target - array[i])) + " " + i);
                return new int[]{map.get(target - array[i]), i};
            }
        }
        return new int[]{-1, -1};
    }

    //Given daily prices, find the maximum profit from buying on one day and selling on a later day. If no profit is possible, return 0.
    public static int maxProfit(int[] prices) {
        int best = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > best) {
                best = price - min;
            }
        }
        System.out.println(
                "Complexity. Time O(n), space O(1)");
        System.out.println(best);
        return best;
    }

}

/*
Part 1: How to Find Time Complexity (Speed)Time complexity is about counting how many times a basic action repeats based on the size of your input (\(n\)).1.
 Look for LoopsLoops are the main drivers of time complexity.No Loops: If your code just does basic math, prints something, or checks an if statement,
 it runs instantly.Complexity: \(O(1)\) (Constant Time).

 One Loop: If a loop runs from the start to the end of a list of size \(n\), the code repeats \(n\) times.
 Complexity: \(O(n)\) (Linear Time).

 Nested Loops: If you have a loop inside another loop, and both run \(n\) times, the code repeats \(n \times n\) times.
Complexity: \(O(n^2)\) (Quadratic Time).

2. Drop the Small DetailsBig-O only cares about the biggest factor when \(n\) becomes a massive number (like one million).


 Drop Constants: If your code has two separate loops that run \(n\) times, that is \(2n\) operations. We drop the \(2\) and call it \(O(n)\).Drop Smaller Terms:
 If your code has a nested loop (\(n^{2}\)) and a single loop (\(n\)), the total is \(n^2 + n\). We drop the smaller \(+n\) and call it \(O(n^2)\).

 Part 2:


 How to Find Space Complexity (Memory)Space complexity is about counting how much extra memory your code creates based on the size of your input (\(n\)).
 Do not count the input itself; only count the new memory your code allocates to solve the problem.

 1. Look for VariablesFixed Variables:
 If your code only creates a few simple variables (like int min = 0;), it uses the same amount of memory whether the input is 5 items or 5 million items.
 Complexity: \(O(1)\) (Constant Space).

 2. Look for New CollectionsNew Lists or Arrays: If you create a new array to store a copy of your data, or a list that
 grows with your input, the space depends directly on \(n\).Complexity: \(O(n)\) (Linear Space).Grid or Matrix: If you create a 2D grid of size \(n \times n\) to
 store data, the space expands quickly.Complexity: \(O(n^2)\) (Quadratic Space).
*/

/*

What is the difference between the stack and the heap?
Local variables and method frames live on the stack, cleaned up when the method returns.
Objects live on the heap and are cleaned up by the garbage collector. Each thread gets its own stack, while the heap is shared
— which is why the heap is where thread-safety problems live.


Is Java pass-by-value or pass-by-reference?
Always pass-by-value. For an object the value copied is the reference, so a method can change the object's fields but cannot make the caller's variable point
 somewhere else. Reassigning the parameter inside the method has no effect outside it.

What is autoboxing and where does it bite?
The compiler converting between int and Integer automatically.
It bites in three places:
unboxing a null Integer throws NullPointerException,
comparing Integers with == compares references beyond the cached range of -128 to 127,
 and boxing inside a tight loop creates a lot of garbage.*/
