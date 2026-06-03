package week2;
import java.util.Scanner;

import static week2.MyProjectNameConstants.PIN;
public class Day10 {
    static void main(String[] args) {
        guessNumber();
        positiveNumber();
        checkAccess();
        wordCount();
        checkBalance();
    }

    static Scanner sc = new Scanner(System.in);

    //Q1
    //Keep asking the user to guess a number (the answer is 7).
    // Print 'Too low', 'Too high', or 'Correct!' and stop when they get it right.
    static void guessNumber() {
        int guessNumber = 7;
        int userEnteredNumber = 0;
        while (userEnteredNumber != guessNumber) {
            try {
                System.out.println("Enter guess number: ");
                userEnteredNumber = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter valid number: ");
                sc.nextLine();
            }
            if (userEnteredNumber < guessNumber) {
                System.out.println("Too low");
                System.out.println("\n Try again : ");
            } else if (userEnteredNumber > guessNumber) {
                System.out.println("Too high");
                System.out.println("\nTry again : ");

            } else {
                System.out.println("Correct!");
            }
        }
        sc.close();
    }

    //Q2
    //Keep asking the user to enter a positive number.
    // If they enter 0 or a negative, print 'Invalid, try again'. Once they enter a valid number, print 'You entered: [number]'.
    static void positiveNumber() {
        double userEnteredNumber = 0;
        while (userEnteredNumber <= 0) {
            try {
                System.out.println("Enter a number: ");
                userEnteredNumber = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter valid number: ");
                sc.nextLine();
            }
            if (userEnteredNumber <= 0) {
                System.out.println("negative");
                System.out.println("\nTry again : ");
            }
        }
        System.out.printf("You entered: " + userEnteredNumber);
    }

    //Q3
    //A user has 3 attempts to enter the correct PIN (hardcode it as 1234).
    // Print 'Access granted' if correct, 'Wrong PIN, X attempts left' otherwise. Print 'Account locked' if all 3 fail.
    static void checkAccess() {
        int userEnteredNumber = 0;
        int attempt = 3;

        while (attempt > 0 && userEnteredNumber != PIN) {
            System.out.println("Enter PIN number: ");
            try {
                userEnteredNumber = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter valid number: ");
            }
            if (userEnteredNumber != PIN) {
                attempt--;
                System.out.println("Wrong PIN, " + attempt + "attempt left");
            } else {
                System.out.println("Access granted");
                sc.close();
                return;
            }
        }
        System.out.println("Account locked");
        sc.close();
    }

    //Q4
    //Ask the user to keep entering words until they type 'done'.
    // After they type 'done', print how many words they entered (not counting 'done').
    static void wordCount() {
        String userEnteredWord = "";
        String done = "done";
        int count = 0;
        System.out.println("Enter words: ");
        while (!userEnteredWord.equals(done)) {
            try {
                userEnteredWord = String.valueOf(sc.nextLine());
                if (userEnteredWord.matches("^[a-zA-Z]+$")) {
                    count++;
                }
            } catch (Exception e) {
                System.out.println("Enter valid word: ");
                sc.close();
                return;
            }
            if (userEnteredWord.equals(done)) {
                count--;
            }
        }
        System.out.println("count" + " " + count);
    }

    //Q5
    //A bank account starts with Rs. 1000. Keep asking the user how much to withdraw. Each time:
    // if they have enough, deduct and print the new balance. If not, print 'Insufficient funds'. Stop when they enter 0.
    static void checkBalance() {
        int balance = 1000;
        int withdrawAmount = 0;
        while (withdrawAmount <= balance) {
            System.out.println("Enter amount to withdraw: ");
            try {
                withdrawAmount = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter valid amount: ");
                return;
            }
            if (withdrawAmount == 0) {
                break;
            } else if (withdrawAmount > balance) {
                System.out.println("Insufficient funds");
            } else if (withdrawAmount < 0) {
                System.out.println("negative amount not allowed");
            } else {
                System.out.println("money withdraw = " + withdrawAmount);
                balance -= withdrawAmount;
                System.out.println("new balance = " + balance);
            }
        }
    }
}
