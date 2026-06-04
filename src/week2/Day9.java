package week2;

import java.util.Scanner;
public class Day9 {
    static void main(String[] args) {
        divisibleNumbers();
        average();
        findLargestNumber();
        findVowels();
        multiplicationTable();
    }

    static Scanner sc = new Scanner(System.in);

    //Q1
    //Print all numbers from 1 to 50 that are divisible by both 3 and 5.
    static void divisibleNumbers() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    //Q2
    //Ask the user for 5 numbers one at a time using a loop. After all 5, print their sum and average.
    static void average() {
        int numberLength = 5;
        int sum = 0;
        for (int i = 1; i <= numberLength; i++) {
            System.out.print("Enter a number " + i + " = ");
            try {
                sum += sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("sum =" + sum);
        System.out.println("average = " + sum / numberLength);
    }

    //Q3
    //Ask the user for 5 numbers. Find and print the largest one entered.
    static void findLargestNumber() {
        int maxNumber = 0;
        int enteredNumber = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number " + i + " = ");
            try {
                enteredNumber = Integer.parseInt(sc.next());
            } catch (Exception e) {
                System.out.println("enter valid number");
            }
            if (enteredNumber > maxNumber) {
                maxNumber = enteredNumber;
            }
        }
        System.out.println("Largest number is =  " + maxNumber);
    }

    //    Ask the user for their name. Count and print how many vowels (a, e, i, o, u) are in it.
    static void findVowels() {
        System.out.print("Enter your name ");
        String name = sc.nextLine().toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Total vowel in your name = " + vowelCount);
    }

    //Print the multiplication tables for numbers 1 to 5 — each table on its own line.
    static void multiplicationTable() {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%-15s", i + " x " + j + " = " + i * j);
            }
        }
    }
}
