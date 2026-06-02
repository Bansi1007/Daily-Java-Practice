package week2;

import java.util.Scanner;

import static week2.MyProjectNameConstants.ADMIN_PASS;
import static week2.MyProjectNameConstants.ADMIN_USER;
public class Day6 {
    static void main(String[] args) {
        checkPositiveNegative();
        checkVotingEligibility();
        calculateGrade();
        checkDiscountEligibility();
        checkCredentials();
        input.close();
    }

    static Scanner input = new Scanner(System.in);

    //Q1
    //Ask for a number. Print 'Positive', 'Negative', or 'Zero'.
    public static void checkPositiveNegative() {
        System.out.print("Enter a number : ");
        int num = 0;
        try {
            num = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }
        if (num < 0) {
            System.out.println("this number is negative");
        } else if (num > 0) {
            System.out.println("this number is positive");
        } else {
            System.out.println("this number is zero");
        }
    }

    //Q2
    //Ask for someone's age. If 18 or older print 'You can vote. 'Otherwise print 'You cannot vote yet.'
    public static void checkVotingEligibility() {
        System.out.print("Enter your age : ");
        int age = 0;
        try {
            age = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can not vote yet");
        }
    }

    //Q3
    //Ask for a score out of 100. Print the grade: A (90+), B (75–89), C (60–74), F (below 60).
    public static void calculateGrade() {
        System.out.print("Enter a score out of 100 : ");
        int score = 0;
        try {
            score = Integer.parseInt(input.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }
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
        System.out.print("Enter your age : ");
        int age = 0;
        try {
            age = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }
        if (age < 12 || age > 60) {
            System.out.println("Discount applies");
        } else {
            System.out.println("Full price");
        }
    }

    //Q5
    //Ask for a username and password. Hardcode the correct ones as 'admin' and 'pass123'.
    // Print 'Login successful' or 'Wrong credentials'.
    public static void checkCredentials() {
        System.out.print("Enter your username : ");
        String username = input.next();
        System.out.print("Enter your password : ");
        String password = input.next();
        if (username.equals(ADMIN_USER) && password.equals(ADMIN_PASS)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Wrong credentials");
        }
    }
}