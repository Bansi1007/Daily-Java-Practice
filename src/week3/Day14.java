package week3;

public class Day14 {
    static void main(String[] args) {
        Person person = new Person("Justin", 40);
        System.out.println(person);
        Student[] students = new Student[5];
        students[0] = new Student("Jack", 70);
        students[1] = new Student("John", 80);
        students[2] = new Student("Sam", 60);
        students[3] = new Student("Jackie", 40);
        students[4] = new Student("Jacob", 90);
        for (Student student : students) {
            System.out.println(student.name + "--------" + student.grade);
        }
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle.describe());
        Rectangle rectangle2 = new Rectangle(15, 30);
        System.out.println(rectangle2.describe());
        Rectangle rectangle3 = new Rectangle(25, 35);
        System.out.println(rectangle3.describe());
        //Test a sequence: increment 5 times, decrement 2 times, print count, reset, print count.
        Counter counter = new Counter();
        for (int i = 1; i <= 5; i++) {
            System.out.println(counter.increment());
        }
        System.out.println(counter.decrement());
        System.out.println(counter.decrement());
        System.out.println(counter.getCount());
        System.out.println(counter.reset());
        System.out.println(counter.getCount());
        // Create 3 Temperature objects and call describe() on each.
        Temperature temperature = new Temperature(32);
        Temperature temperature2 = new Temperature(9);
        Temperature temperature3 = new Temperature(50);
        temperature.describe();
        temperature2.describe();
        temperature3.describe();
    }
}

//Q1
//Add a toString() method to your Person class that describes the object. Then create a Person and print it directly.
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}

//Q2
//Create an array of 5 Student objects (from Day 13). Loop through and print each student's name and grade.
class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

//Q3
//Create a Rectangle class with width and height. Methods: area(), perimeter(), and describe() that prints something like 'A 5x3 rectangle — area: 15,
// perimeter: 16'. Create 3 rectangles and call describe() on each.
class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public String describe() {
        return "A " + width + " x " + height + " rectangle - area: " + area() + "\nperimeter: " + perimeter();
    }
}

//Q4
//Create a Counter class. It starts at 0. Methods: increment() adds 1, decrement() subtracts 1 (never go below 0), reset() sets back to 0, getCount() returns the current count.

class Counter {
    int count = 0;

    public int increment() {
        return this.count++;
    }

    public int decrement() {
        if (this.count == 0) {
            return 0;
        } else {
            return this.count--;
        }
    }

    public int reset() {
        return this.count = 0;
    }

    public int getCount() {
        return this.count;
    }
}

//Q5
//Create a Temperature class that stores a value in Celsius. Methods: toFahrenheit() returns the converted value, isHot() returns true
// if above 30, isCold() returns true if below 10, describe() prints a sentence.
class Temperature {
    int Celsius;

    public Temperature(int Celsius) {
        this.Celsius = Celsius;
    }

    public double toFahrenheit() {
        return (double) (this.Celsius * 9) / 5 + 32;
    }

    public boolean isHot() {
        return this.Celsius > 30;
    }

    public boolean isCold() {
        return this.Celsius < 10;
    }

    public void describe() {
        String describe = "";
        if (isHot()) {
            describe = "A hot";
        } else if (isCold()) {
            describe = "A cold";
        }
        System.out.println(this.Celsius + "  celsius to Fahrenheit  " + toFahrenheit() + " and it's " + describe);
    }
}