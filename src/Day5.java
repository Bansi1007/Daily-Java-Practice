import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
    }

    //Q1
    //A price is stored as the String '499'. Convert it to an integer, add 100 to it, and print the result.
    public static void Q1() {
        String price = "499";
        int convertPrice = Integer.parseInt(price);
        int addition = convertPrice + 100;
        System.out.println("result =  " + addition);
    }

    //Q2
    //You have a double value 3.75678. Print it rounded to 2 decimal places.
    public static void Q2() {
        double value = 3.75678;
        System.out.println("");
        System.out.printf("result =  " + "%.2f", value);
    }

    //Q3
    //Ask the user for their weight in kg (decimal) and height in metres (decimal).
    // Calculate BMI = weight / (height * height) and print it rounded to 1 decimal place.
    public static void Q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weight in kg (decimal)");
        double weight = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter height in metres (decimal)");
        double height = sc1.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("result: ");
        System.out.printf("%.1f", bmi);
    }

    //Q4
    //Cast the double 7.9 to an int and print it.
    // Then cast 3.1 to an int and print it. Write a comment explaining what happened to the decimal part.
    public static void Q4() {
        int value1 = (int) 7.9;
        System.out.println(value1);
        int value2 = (int) 3.1;
        System.out.println(value2);
        //decimal part is not rounding. casting from double to int removes decimal part.
    }

    //Ask the user for a price as a String (like they typed it in a form).
    // Convert it to a double, apply 18% GST, and print the price before and after GST formatted to 2 decimal places.
    public static void Q5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price in string");
        String price = sc.nextLine();
        double value = Double.parseDouble(price);
        double gst = value * 0.18;
        double total = value + gst;
        System.out.printf("price before GST : %.2f%n", value);
        System.out.printf("price after GST : %.2f%n", total);
    }
}
