package week3;

public class Day11 {
    static void main(String[] args) {
        String[] greetingNames = {"Bansi","Malyka","Sandeep"};
        greet(greetingNames);
        add(200,500);
        int[]numbers = {4,7,0,13};
       for(int n :  numbers){
           System.out.println(isEven(n));
       }
       calculateBill(3,150);
       calculateBill(7,80);
       title("This is Title ");
    }

    //Q1
    //Write a method called greet(String name) that prints 'Hello, [name]! Good to see you.' Call it 3 times with different names.
    static void greet(String[] names){
        for(String name : names){
            System.out.println("Hello,"+name+"! Good to see you.");
        }
    }

    //Q2
    //Write a method called add(int a, int b) that returns the sum. Call it from main() and print the result.
    static int add(int a, int b){
        int sum = a+b;
        System.out.println("Sum: "+sum);
        return sum;
    }

    //Q3
    //Write a method called isEven(int n) that returns true if the number is even, false otherwise. Test it with 4, 7, 0, and 13.
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    //Q4
    //Write a method called calculateBill(int quantity, double price) that returns the total cost.
    // Call it for: 3 items at Rs.150, and 7 items at Rs.80. Print both results.
    static double calculateBill(int quantity, double price){
        double cost = quantity*price;
        System.out.println("Cost: "+cost);
        return cost;
    }

//    Write a method called printSeparator() that prints line of 30 dashes.
//    Call it before and after printing a title to make it look like a header.
    static void printSeparator(){
        for (int i = 1; i <= 30; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    static void title(String title){
        printSeparator();
        System.out.println(title);
        printSeparator();
    }
}
