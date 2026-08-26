package week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day23 {
    static void main(String[] args) {
        //Q1();
        //Q2();
        //  Q3();
        //Q4();
        Q5();

    }

    static Scanner sc = new Scanner(System.in);

    //Q1
    //Create a HashMap of 4 products and their stock quantities.
    // Add a new product, update the stock of an existing one using put(), remove one product, and print the full map after each operation.
    static void Q1() {
        Map<String, Integer> products = new HashMap<>();
        products.put("A", 1);
        products.put("B", 2);
        products.put("C", 3);
        System.out.println("Before update---" + products);
        products.put("B", 4);
        System.out.println("After update---" + products);
        products.remove("A");
        System.out.println("After removing A---" + products);

    }

    //Create a HashMap of 5 students and marks. Use getOrDefault() to look up a student who doesn't exist —
    // it should return a default value instead of crashing.

    static void Q2() {
        Map<String, Integer> students = new HashMap<>();
        students.put("A", 1);
        students.put("B", 2);
        students.put("C", 3);
        students.put("D", 4);
        students.put("E", 5);
        int marks = students.getOrDefault("F", -1);
        System.out.println("Value for 'F': " + marks);
    }


    //Q3
    //Create a vote counter using HashMap. Ask the user to enter 8 votes (each vote is a candidate name).
    // For each vote, use getOrDefault to get the current count, add 1, and put it back. Print the final tally.
    static void Q3() {
        Map<String, Integer> vote = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter 8 votes---------- ");
            String name = sc.nextLine();
            vote.put(name, vote.getOrDefault(name, 0) + 1);

        }
        System.out.println("Vote Counter': " + vote);
    }

    //Q4
    //Create a contact book (name → phone). Let the user perform 4 operations in order:
    // add a contact, look one up, update a phone number, delete a contact. Print the map after every operation.
    static void Q4() {
        Map<String, Integer> contact = new HashMap<>();
        String name = "";
        Integer nummber = 0;

        System.out.println("add a contact ---------- ");
        name = sc.nextLine();
        System.out.println("add a number ---------- ");
        nummber = Integer.parseInt(sc.nextLine());
        contact.put(name, nummber);
        System.out.println("Contact details': " + contact);

        System.out.println("look up a contact detail by name ---------- ");
        name = sc.nextLine();
        if (contact.containsKey(name)) {
            contact.get(name);
            System.out.println(contact);
        }


        System.out.println("update a number ---------- ");
        nummber = Integer.parseInt(sc.nextLine());
        if (contact.containsKey(name)) {
            contact.put(name, nummber);
            System.out.println("Updated Contact details': " + contact);

        } else {
            System.out.println("Not found");
        }

        System.out.println("delete contact detail by name ---------- ");
        name = sc.nextLine();
        if (contact.containsKey(name)) {
            contact.remove(name);
            System.out.println(contact);
        } else {
            System.out.println("Not found");
        }

    }

    //Q5
    //Create a HashMap of 6 cities and their populations. Ask the user for a city name. If it exists, print the population.
    // If not, add it by asking for the population. Print the map at the end.
    static void Q5() {
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Waterloo".toLowerCase(), 200000);
        cities.put("River".toLowerCase(), 150000);
        cities.put("toronto".toLowerCase(), 5500000);
        cities.put("London".toLowerCase(), 608000);
        cities.put("Paris".toLowerCase(), 309020);
        String city = "";
        int population = 0;
        System.out.println("Enter city name --- ");
        city = sc.nextLine();
        if (cities.containsKey(city)) {
            System.out.println(cities.get(city));
        } else {
            System.out.println("Not found-----add city name to add");
            city = sc.nextLine();
            System.out.println("Enter city population --- ");
            population = Integer.parseInt(sc.nextLine());
            cities.put(city, population);
            System.out.println("Updated city population --- " + cities);
        }
    }
}

