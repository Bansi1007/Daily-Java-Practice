package week3;
public class Day13 {
    static void main(String[] args) {
        Person person = new Person("Bansi", 26);
        Person person1 = new Person("Malyka", 30);
        Person person2 = new Person("Sandeep", 32);

        person.introduce();
        person1.introduce();
        person2.introduce();

        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(300);
        bankAccount.deposit(2000);
        bankAccount.withdraw(500);

        bankAccount.printBalance();

        Product product = new Product();
        product.name="Phone";
        product.price=1000;
        product.quantity=10;
        product.totalValue();

        Student student = new Student("Dishit",45);
        Student student2 = new Student("Bansi",85);
        Student student3 = new Student("Malyka",90);
        Student student4 = new Student("Sweta",70);

        System.out.println(student.getGrade());
        System.out.println(student2.getGrade());
        System.out.println(student3.getGrade());
        System.out.println(student4.getGrade());

        Movie movie = new Movie("Animal", "", 7.9);
        Movie movie2 = new Movie("Dhurandhar", "Dhar", 11.2);
        Movie movie3 = new Movie("Pyramid scheme", "abc", 9.2);
        Movie movie4 = new Movie("Dhurandhar", "Dhar", 4.2);

        System.out.println(movie.title + "---------" + movie.isRecommended());
        System.out.println(movie2.title + "---------" + movie2.isRecommended());
        System.out.println(movie3.title + "---------" + movie3.isRecommended());
        System.out.println(movie4.title + "---------" + movie4.isRecommended());


    }

}

//Q1
//Create a Person class with fields name and age, and a constructor.
// Add a method introduce() that prints 'Hi, I am [name] and I am [age] years old.'Create 3 Person objects and call introduce() on each.
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}

//Q2
//Create a BankAccount class with ownerName and balance. Methods: deposit(double amount) adds to the balance,
// withdraw(double amount) subtracts (but never go below zero), printBalance() prints the current balance.
// Test it with a few deposits and withdrawals.
class BankAccount {
    String ownerName = null;
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
        }

    }

    void printBalance() {
        System.out.println("Total balance is " + balance);
    }
}

//Q3
//Create a Product class with name, price, and quantity. Add a method totalValue() that returns price × quantity.
// Create 3 products and print the total value of each.
class Product {
    String name;
    double price;
    int quantity;

    double totalValue() {
        return price * quantity;
    }
}

//Q4
//Create a Student class with name and marks (an int). Add a method getGrade() that returns 'A' for 90+, 'B' for 75–89, 'C' for 60–74, 'F' for below 60.
// Create 4 students with different marks and print each name and grade.
class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    char getGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else {
            return 'F';
        }
    }
}

//Q5
//Create a Movie class with title, director, and rating (double, out of 10). Add a method isRecommended()
// that returns true if the rating is 7.0 or above. Create 4 movies and print each title and whether it is recommended.
class Movie {
    String title;
    String director;
    double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        setRating(rating);
    }

    void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating");
        }
    }

    boolean isRecommended() {
        return this.rating >= 7.0;
    }
}