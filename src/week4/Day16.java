package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Day16 {
    static void main(String[] args) {
        //Q1
        //Create an ArrayList of your 5 favourite foods. Print each one with its number using a for loop.
        ArrayList<String> list = new ArrayList<>();
        list.add("Momo");
        list.add("Dal-rice");
        list.add("Gola");
        list.add("Pizza");
        list.add("karela");
        for (String s : list) {
            System.out.println(list.indexOf(s) + 1 + "---" + s);
        }

        //Q2
        //Start with an empty ArrayList. Ask the user to enter 5 city names one by one. After all are entered, print the full list.
        ArrayList<String> city = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the city name");
            String c = sc.nextLine();
            city.add(c);
        }
        System.out.println(city);

        //Create an ArrayList of 6 names. Print the first item, the last item, and the total size of the list.
        ArrayList<String> names = new ArrayList<>();
        names.add("Agastya");
        names.add("shlok");
        names.add("Adhiraj");
        names.add("Aalok");
        names.add("aryan");
        names.add("Ryan");
        System.out.println("first item: " + names.getFirst() + "\n" + "last item: " + names.getLast() + "\n" + "total size of the list " + names.size());

        //Q4
        //Create an ArrayList of 5 fruits. Remove the fruit at position 2 (the third one). Print the list before and after removing.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Blueberry");
        System.out.println(fruits + "   " + fruits.size());
        fruits.remove(2);
        System.out.println(fruits + "   " + fruits.size());

        //Q5
        //Create an ArrayList of 5 words. Check if it contains 'Mango'. Print 'Found it!' or 'Not in the list'.
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Orange");
        words.add("Mango");
        words.add("Pineapple");
        words.add("Blueberry");
        if (words.contains("Mango")) {
            System.out.println("Found it!");
        } else {
            System.out.println("Not found it!");
        }
    }
}


