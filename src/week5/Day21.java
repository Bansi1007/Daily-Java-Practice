package week5;

import java.util.HashMap;
import java.util.Scanner;

class Day21 {
    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
    }


    static Scanner sc = new Scanner(System.in);

//Create a HashMap of 5 countries and their capitals.
// Ask the user to enter a country name and print its capital, or 'Not found'.

    static void Q1() {
        HashMap countries = new HashMap<>();
        countries.put("India".toLowerCase(), "New Delhi");
        countries.put("USA".toLowerCase(), "New York");
        countries.put("France".toLowerCase(), "Paris");
        countries.put("Canada".toLowerCase(), "Ontario");
        countries.put("Japan".toLowerCase(), "beijing");

        System.out.println("enter the name of the country");
        String country = sc.nextLine();
        if (countries.containsKey(country)) {
            System.out.println(countries.get(country));
        } else {
            System.out.println("Not found");
        }

    }

    //Q2
    //Create a HashMap of 5 items and their prices (name → price).
    // Ask the user for an item name and print its price, or 'Item not available'.
    static void Q2() {
        HashMap item = new HashMap<>();
        item.put("brush".toLowerCase(), 5);
        item.put("cherry".toLowerCase(), 10);
        item.put("peach".toLowerCase(), 20);
        item.put("sandwich".toLowerCase(), 18);
        item.put("pineapple".toLowerCase(), 9);

        System.out.println("enter the name of the item");
        String itemName = sc.nextLine();
        if (item.containsKey(itemName)) {
            System.out.println(item.get(itemName));
        }
    }

    //Q3
    //Create a phone book using HashMap (name → phone number).
    // Add 5 contacts. Ask the user for a name and look up the number. Also let them add a new contact.
    static void Q3() {
        HashMap phoneBook = new HashMap<>();
        phoneBook.put("dishit".toLowerCase(), 123);
        phoneBook.put("bansi".toLowerCase(), 456);
        phoneBook.put("cherry".toLowerCase(), 789);
        phoneBook.put("malyka".toLowerCase(), 9876);
        phoneBook.put("sweta".toLowerCase(), 765678);
        System.out.println("enter the name");
        String name = sc.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        }

        System.out.println("Add new contact details");
        String name2 = sc.nextLine();
        System.out.println("enter the phone number");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        phoneBook.put(name2, phoneNumber);

        System.out.println(phoneBook);

    }

    //Q4
    //Create a HashMap of 5 students and their marks (name → marks).
    // Ask the user for a student name. If found, print their marks. If not found, print 'Student not found'.

    static void Q4() {
        HashMap students = new HashMap<>();
        students.put("dishit".toLowerCase(), 80);
        students.put("cherry".toLowerCase(), 90);
        students.put("bansi".toLowerCase(), 70);
        students.put("sweta".toLowerCase(), 60);
        students.put("pineapple".toLowerCase(), 40);
        System.out.println("enter the name of the student");
        String name = sc.nextLine();
        if (students.containsKey(name)) {
            System.out.println(students.get(name));
        } else {
            System.out.println("Student Not Found");
        }

    }

    //Q5
    //Create a HashMap of 4 words and their meanings (like a mini dictionary).
    // Add a word, update a word's meaning, remove a word, and print the size before and after each operation.
    static void Q5() {
        HashMap words = new HashMap<>();
        words.put("Bonjour".toLowerCase(), "Hello");
        words.put("Nom".toLowerCase(), "name");
        words.put("maison".toLowerCase(), "house");
        words.put("fait-maison".toLowerCase(), "home-made");

        System.out.println("enter new word");
        String word = sc.nextLine();
        System.out.println("Enter meaning");
        String meaning = sc.nextLine();
        System.out.println("size before adding new word---" + words.size());
        words.put(word, meaning);
        System.out.println("size after adding new word---" + words.size());


        System.out.println("enter word to update");
        String update = sc.nextLine();
        if (words.containsKey(update)) {
            System.out.println("update meaning");
            String meaning2 = sc.nextLine();
            System.out.println("size before updating new word---" + words.size());
            words.put(update, meaning2);
            System.out.println("size after updating new word---" + words.size());
        } else {
            System.out.println("Not found");
        }

        System.out.println("Enter a word to remove");
        String remove = sc.nextLine();
        if (words.containsKey(remove)) {
            System.out.println("size before removal--------" + words.size());
            words.remove(remove);
            System.out.println("after removal -----" + words.size());
        }

    }
}

