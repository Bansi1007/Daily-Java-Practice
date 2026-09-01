package week4;

import week4.model.product;
import week4.model.student;

import java.util.*;
import java.util.stream.Collectors;


public class Day19 {
    static void main(String[] args) {
        //Student();
        //prouct();
        //BankAccount();
        // Student2();
        Movie();
    }

    static Scanner sc = new Scanner(System.in);

    //Q1
    //Create an ArrayList of 5 Student objects (name + marks). Loop through and print every student's name and grade.
    public static void Student() {


        ArrayList<student> students = new ArrayList<>();
        students.add(new student("john", 87));
        students.add(new student("rose", 72));
        students.add(new student("jade", 93));
        students.add(new student("jeal", 60));
        students.add(new student("jack", 98));
        for (student student : students) {
            System.out.println("name----" + student.name + ", Grade----" + student.marks);
        }
    }

    //Q2
    //Create an ArrayList of 5 Product objects (name + price). Ask the user to enter a product name.
    // Search the list and print the price, or 'Not found'.
    public static void prouct() {
        String product = null;
        ArrayList<product> products = new ArrayList<>();
        products.add(new product("papers", 50));
        products.add(new product("pen", 10));
        products.add(new product("files", 40));
        products.add(new product("folders", 90));
        products.add(new product("keyboard", 200));


        System.out.println("enter product name ---");
        product = sc.nextLine();
        boolean found = false;
        for (product p : products) {

            if (p.name.equalsIgnoreCase(product)) {
                System.out.println("price------" + p.price);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }

    }
    //Q3
    //Create an ArrayList of 4 BankAccount objects. Deposit Rs. 500 into each account using a loop.
    // Then print all account names and their balances.

    public static void BankAccount() {
        ArrayList<student.BankAccount> BankAccount = new ArrayList<>();
        BankAccount.add(new student.BankAccount(0, "raj"));
        BankAccount.add(new student.BankAccount(76, "rose"));
        BankAccount.add(new student.BankAccount(900, "rose"));
        BankAccount.add(new student.BankAccount(8000, "Jeal"));
        BankAccount.add(new student.BankAccount(200, "Siya"));
        for (student.BankAccount bankAccount : BankAccount) {
            bankAccount.deposit(500);
            System.out.println("name--" + bankAccount.getName() + "------balance----" + bankAccount.getBalance());
        }
    }

    //Q4
    //Create an ArrayList of 5 Student objects. Loop through and build a second ArrayList containing only students who scored 75 or above.
    // Print the second list.
    public static void Student2() {
        ArrayList<student> students = new ArrayList<>();
        ArrayList<student.ScholarStudents> scholarStudents = new ArrayList<>();
        students.add(new student("raj", 90));
        students.add(new student("rose", 72));
        students.add(new student("zak", 60));
        students.add(new student("jeal", 90));
        students.add(new student("jack", 98));
        List<student> studentList = students.stream().filter(student -> student.marks >= 75).collect(Collectors.toList());
        studentList.forEach(student -> System.out.println("name ---" + student.name + "  marks " + student.marks));
//        for (student student : students) {
//
//            if (student.marks >= 75) {
//                week4.model.student.ScholarStudents scholarStudents1 = new week4.model.student.ScholarStudents(student.name, student.marks);
//                scholarStudents.add(scholarStudents1);
//                System.out.println("name--"+scholarStudents1.getName()+"------balance----"+scholarStudents1.getMarks());
//            }
//        }
    }

    //Q5
    //Create an ArrayList of 5 Movie objects (title + rating).
    // Loop through and find the movie with the highest rating. Print its title and rating.
    public static void Movie() {
        ArrayList<student.Movie> movies = new ArrayList<>();
        movies.add(new student.Movie("Mirzapur", 9.6));
        movies.add(new student.Movie("off campus", 10));
        movies.add(new student.Movie("obsession", 3.5));
        movies.add(new student.Movie("ddlj", 5));
        movies.add(new student.Movie("raz", 8));
        OptionalInt movie1 = movies.stream().mapToInt(movie -> (int) movie.getRating()).max();
        movie1.ifPresent(System.out::println );
    }

}

