package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18 {
    static void main(String[] args) {
        // tasks();
        //tasks2();
        // tasks3();
        //tasks4();
        toDolist();

    }

    static Scanner sc = new Scanner(System.in);

    //Q1
    //Create an ArrayList with 4 tasks: 'Buy groceries', 'Pay bills', 'Call doctor', 'Read book'.
    // Insert a new task 'Exercise' at position 1 (second spot). Print the list.
    public static void tasks() {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Buy groceries");
        list.add(1, "Pay bills");
        list.add(2, "Call doctor");
        list.add(3, "Read book");
        System.out.println("before-------" + list);
        list.add(1, "Exercise");
        System.out.println("after -------" + list);
    }

    //Q2
    //Create an ArrayList of 5 names. Replace the name at position 3 with a new name using set(). Print the list before and after.
    public static void tasks2() {
        ArrayList<String> name = new ArrayList<>();
        name.add(0, "dishit");
        name.add(1, "rahul");
        name.add(2, "sandeep");
        name.add(3, "malyka");
        name.add(4, "sweta");
        System.out.println("before-------" + name);
        name.set(3, "Bansi");
        System.out.println("after -------" + name);
    }

    //Create an ArrayList of 5 fruits. Remove the fruit 'Banana' by value (not by index). Print the list before and after.
    public static void tasks3() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");
        fruits.add("Pear");
        System.out.println("before-------" + fruits);
        fruits.remove("Banana");
        System.out.println("after -------" + fruits);
    }

    //Q4
    //Create an ArrayList of 5 items. Print it. Then clear the entire list using clear().
    // Print the list again and check if it is empty using isEmpty().
    public static void tasks4() {
        ArrayList<String> object = new ArrayList<>();
        object.add("Banana");
        object.add("Cherry");
        object.add("Grape");
        object.add("Pear");
        object.add("Apple");
        System.out.println("before-------" + object);
        object.clear();
        System.out.println("after_clear -------" + object);

        object.isEmpty();
        System.out.println("isEmpty -------" + object.isEmpty());
    }

    //Q5
    //Build a simple to-do list. Start with 3 tasks. Let the user: (1) add a new task, (2) mark a task as done by entering its number (remove it),
    // (3) view all tasks. Run each option once and print the list after each change.
    public static void toDolist() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Laundry");
        list.add("gym");
        list.add("walk");
        int choice = 0;
        String task = null;
        int number = 0;
        System.out.println("-------1) add a new task ------2) mark task as done------3)view all tasks");
        System.out.println("Select one option:    ");
        while (!list.isEmpty()) {
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
            switch (choice) {
                case 1:
                    System.out.println("Add task here---");
                    try {
                        task = sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                    }
                    list.add(task);
                    System.out.println("task added to the list---" + list);
                    break;
                case 2:
                    System.out.println("mark a task as done by entering its number");
                    try {
                        number = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                    }
                    while (list.size()>=0 &&number<list.size()) {
                        list.remove(number - 1);
                        System.out.println("task marked as done and removed from the list----" + list);
                    }System.out.println("No task in list");

                    break;
                case 3:
                    System.out.println("Here is list of all tasks ---" + list);
                    break;
            }
        }
        System.out.println("thanks for using todolist --------" + list);
    }
}

