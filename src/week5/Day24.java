package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Comment other answers when testing particular question.

public class Day24 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Ask the user for two numbers and divide them. Wrap in try/catch
// so if they enter 0 as the second number you print 'Cannot divide by zero' instead of crashing.
        System.out.println("enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
            int num3 = 0;
            num3 = num1 / num2;
            System.out.println("Total----------- " + num3);
        } catch (Exception e) {
            System.out.println("can not divide by zero----------- ");
        }


        //Q2
        // Ask the user to type a number. Use Integer.parseInt() to convert it.
        // Wrap in try/catch — if they type 'abc' or leave it blank, print 'That is not a valid number, please type digits only.
        System.out.println("enter a number---");
        try {
            int number = Integer.parseInt(input.nextLine());
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid number, please type digits only");
        }

        //Create an ArrayList of 4 items. Ask the user for an index and try to print the item at that index.
        // If the index is out of range, catch the error and print 'No item exists at that position.'

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hi1");
        list1.add("Hi2");
        list1.add("Hi3");
        list1.add("Hi4");
        System.out.println(list1.size() + "Enter an index to print the item at that index---");
        try {
            int index = input.nextInt();
            System.out.println("Item at this index is-----" + list1.get(index));
        } catch (Exception e) {
            System.out.println("No item exists at that position");
        }


        divideNumbers(10, 0);
        divideNumbers(10, 5);


        //Ask the user to enter 5 numbers one at a time. For each input, try to parse it as an integer.
        // If it fails, print 'Skipping invalid input: [what they typed]' and keep going. After all 5 attempts, print only the valid numbers and their sum.
        List<Integer> list = new ArrayList<>();
        int number = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i);
            try {
                number = Integer.parseInt(input.nextLine());
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid input: " + number);
            }
        }
        System.out.println(list.size() + " numbers in list---" + list.stream().toList());
        System.out.println("Sum--" + list.stream().mapToInt(Integer::intValue).sum());

    }

    //Write a method divideNumbers(int a, int b) that divides a by b. Use a try/catch inside. Add a finally block that always prints 'Division attempted.
    // Call the method twice — once with b=0, once with valid numbers.

    public static void divideNumbers(int a, int b) {
        try {
            int division = a / b;
            System.out.println("division----" + division);
        } catch (Exception e) {
            System.out.println("can not divide by zero----------- ");
        } finally {
            System.out.println("Division attempted");
        }
    }
}
