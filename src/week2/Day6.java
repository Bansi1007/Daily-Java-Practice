package week2;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        checkPositiveNegative();
        checkVotingEligiblity();
        calculateGrade();
        checkDiscountEligibility();
        checkCredentials();
    }

    //Q1
    //Ask for a number. Print 'Positive', 'Negative', or 'Zero'.
    public static void checkPositiveNegative() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        try {
            int num = Integer.parseInt(input.nextLine());
            if (num < 0) {
                System.out.println("this number is negative");
            } else if (num > 0) {
                System.out.println("this number is positive");
            } else {
                System.out.println("this number is zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    //Q2
    //Ask for someone's age. If 18 or older print 'You can vote.' Otherwise print 'You cannot vote yet.'
    public static void checkVotingEligiblity() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can not vote yet");
        }
    }

    //Q3
    //Ask for a score out of 100. Print the grade: A (90+), B (75–89), C (60–74), F (below 60).
    public static void calculateGrade() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a score out of 100 : ");
        int score = scan.nextInt();
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else if (score >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }

    //Q4
    //A cinema gives a discount to anyone under 12 or over 60. Ask for their age and print 'Discount applies' or 'Full price'.
    public static void checkDiscountEligibility() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if (age < 12 || age > 60) {
            System.out.println("Discount applies");
        } else {
            System.out.println("Full price");
        }
    }

    //Q5
    //Ask for a username and password. Hardcode the correct ones as 'admin' and 'pass123'.
    // Print 'Login successful' or 'Wrong credentials'.

    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS = "pass123";

    public static void checkCredentials() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String username = scan.next();
        System.out.print("Enter your password : ");
        String password = scan.next();
        if (username == ADMIN_USER && password == ADMIN_PASS) {
            System.out.println("Login successful");
        } else {
            System.out.printf("Wrong credentials");
        }
    }
}
