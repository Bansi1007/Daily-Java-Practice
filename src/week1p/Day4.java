package week1p;

import java.util.Stack;


public class Day4 {
    static void main(String[] args) {
        bracketsCheck("[{()}]");
        stackOperation s = new stackOperation();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(15);
        System.out.println(s.getMin());
        isPalindrome("anAd");

    }


   /* Given a string of brackets, decide whether they are opened and closed in the right order.

            Example. {[]} -> true ([)] -> false*/

    public static boolean bracketsCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return false;
                }
                char top = stack.pop();
                if (c == ']' && top != '[' || c == '}' && top != '{' || c == ')' && top != '(') {
                    System.out.println("false");
                    return false;
                }
            }
        }
        System.out.println("true");
        return stack.isEmpty();
    }

    // Decide whether a string reads the same forwards and backwards, ignoring case and anything that is not a letter or digit.

    public static boolean isPalindrome(String str) {

        if (str.isBlank() ||str==null) {
            System.out.println("enter valid string");
            return false;
        }
        String cleaned = str.replaceAll(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();
        if (reversed.equals(cleaned)) {
            System.out.println("Ta-da.....string is palindrome");
            return true;
        }

        System.out.println("oopsie.....string is not palindrome");
        return false;
    }


}

 /* Design a stack supporting push, pop, top and getMin, all in constant time.

    Example. push 5, push 2, getMin -> 2, pop, getMin -> 5*/

class stackOperation {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int x) {
        stack.push(x);

        if (min.isEmpty() || x < min.peek()) {
            min.push(x);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {

        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
        min.pop();
    }

    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (stack.isEmpty()) {
            return -1;
        }
        return min.peek();
    }
}
