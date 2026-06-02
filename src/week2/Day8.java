package week2;

import java.util.Scanner;

public class Day8 {
    public Day8() {
    }

    static void main(String[] args) {
        numberPerLine();
        evenNumber();
        multiplication();
        sumOfEnteredNumbers();
        countDown();
    }

    static void numberPerLine() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }
    }

    static void evenNumber() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    static void multiplication() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("7 x " + i + " = " + i * 7);
        }
    }

    static void sumOfEnteredNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = 0;
        try {
            n = Integer.parseInt(input.nextLine());
        } catch (Exception var4) {
            System.out.println("Invalid input");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void countDown() {
        for (int i = 10; i > 0; --i) {
            System.out.println(i);
        }
        System.out.println("Blast off!");
    }
}
