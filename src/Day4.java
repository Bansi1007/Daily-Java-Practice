import java.time.Year;
import java.util.Scanner;

public class Day4 {
    static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
    }

    //Q1
    //Ask the user to enter their name. Print: 'Hello, [name]! Welcome to Java.'
    public static void Q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    //Ask the user for two whole numbers. Print their sum, difference, and product.
    public static void Q2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int number1 = sc.nextInt();
        System.out.println("enter 2nd number : ");
        int number2 = sc.nextInt();
        System.out.println("Sum : ");
        System.out.println(number1 + number2);
        System.out.println("difference : ");
        System.out.println(number1 - number2);
        System.out.println("product : ");
        System.out.println(number2 * number1);
    }

    //Ask the user for their birth year. Calculate how old they are (assume current year is 2025) and print it.
    public static void Q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your  birth year : ");
        int year = sc.nextInt();
        int currentYear = Year.now().getValue();
        int difference = currentYear - year;
        System.out.println("You are " + difference + " years old");
    }

    //Ask the user for the price of an item and a discount percentage. Calculate and print the final price after the discount.
    public static void Q4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of an item : ");
        int price = sc.nextInt();
        System.out.println("enter a discount percentage : ");
        double discountPercentage = sc.nextDouble() / 100;
        double difference = price * discountPercentage;
        double finalPrice = price - difference;
        System.out.println("Your final price after the discount is " + finalPrice);
    }

    //Q5
    //Ask the user for their first name and last name separately.
    // Print their full name on one line and how many total characters it has (including the space in between).
    public static void Q5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name : ");
        String firstName = sc.nextLine();
        System.out.println("enter your last name : ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("full name : " + fullName + System.lineSeparator() + "Total characters : " + fullName.length());
    }
}
