package week2;

import java.util.Scanner;

public class Day7 {
    static void main(String[] args) {
        dayOfTheMonth();
        monthOfYear();
        seasonOfMonth();
        fallThroughToGroup();
        vendingMachine();
    }

    static Scanner input = new Scanner(System.in);

    //Q1
    //Ask the user to enter a number 1–7.
    // Use switch to print the name of the day. 1 = Monday, 2 = Tuesday, ... 7 = Sunday. Print 'Invalid' for anything else.
    static void dayOfTheMonth() {
        System.out.println("Enter a number 1-7");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    //2
    //Ask the user for a month number (1–12). Print the name of the month. Print 'Invalid month' for anything outside 1–12.
    static void monthOfYear() {
        System.out.println("Enter a month number 1-12");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
    //Q3
    //Ask the user to enter a season ('summer', 'winter', 'monsoon', 'spring').
    // Use switch to print one activity to do in that season. Print 'Unknown season' for anything else.

    static void seasonOfMonth() {
        System.out.println("Enter a season : 'summer', 'winter', 'monsoon', 'spring'");
        String season = input.next();
        switch (season) {
            case "summer":
                System.out.println("Tracking");
                break;
            case "winter":
                System.out.println("Skiing");
            case "monsoon":
                System.out.println("splash in puddle");
                break;
            case "spring":
                System.out.println("hiking");
                break;
            default:
                System.out.println("Unknown season");
        }
    }

    //Q4
    //Use switch with fall-through to group the days of the week. Days 1–5 should print 'Weekday'.
    // Days 6–7 should print 'Weekend'. Fall-through means: if you don't write break, the next case runs automatically.
    // So cases 1, 2, 3, 4 can all fall through to case 5 which does the printing.
    static void fallThroughToGroup() {
        System.out.println("Enter a number 1-5");
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }

    //Q5
    //A vending machine has 3 items: press 1 for Water (Rs.20), 2 for Juice (Rs.40), 3 for Soda (Rs.30).
    // Ask the user to press a number and print what they get and the cost. Print 'Invalid choice' for other inputs.
    static void vendingMachine() {
        System.out.println("Enter a number 1-3:  1 for Water (Rs.20), 2 for Juice (Rs.40), 3 for Soda (Rs.30) ");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("You get water for Rs.20");
                break;
            case 2:
                System.out.println("You get juice for Rs.40");
                break;
            case 3:
                System.out.println("You get soda for Rs.30");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
