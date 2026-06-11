package week3;

public class Day15 {
    static void main(String[] args) {
        Animal animal = new Animal("animal");
        Dog dog = new Dog("Billu");
        Cat cat = new Cat("Coujii");
        animal.sound();
        dog.sound();
        cat.sound();
        Car car = new Car("Toyota", 100, 4);
        Car car2 = new Car("Nissan", 80, 2);
        Car car3 = new Car("Force", 200, 5);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        Circle circle = new Circle(20);
        System.out.printf("%.2f\n", circle.area());
        Square square = new Square(2.2);
        System.out.println(square.area());
        Manager manager = new Manager("Sandeep", 1500000, 20);
        System.out.println(manager.describe());

        //Q5
//Create an Animal array of size 3. Put in one Dog, one Cat, and one Animal. Loop through and call sound() on each.
// Notice that the right sound() is called depending on the actual type — this is polymorphism.
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Billu");
        animals[1] = new Cat("Coujjiiiii");
        animals[2] = new Dog("star");
        for (Animal a : animals) {
            System.out.println(a.sound());
        }
    }

    //Q1
    //Create an Animal class with a name field and a method sound() that prints 'Some sound'.
    // Create a Dog class that extends Animal and overrides sound() to print 'Woof!'. Create a Cat class that overrides sound() to print 'Meow!'.
    // Create one of each and call sound().
    static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public String sound() {
            return "Some sound";
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "Woof!";
        }
    }

    static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "Meow!";
        }
    }
}

//Q2
//Create a Vehicle class with fields brand and speed. Create a Car class that extends Vehicle and adds a field numDoors.
// Create a Car object and print all three fields.
class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" + "brand = " + this.brand + ", speed = " + this.speed + ", numDoors = " + numDoors + '}';
    }
}

//Q3
//Create a Shape class with a method area() that returns 0. Create a Circle class that extends Shape and overrides area() using the radius.
// Create a Square class that overrides area() using the side. Print the area of one Circle and one Square.
class Shape {

    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * 4;
    }
}

//Create an Employee class with name and salary. Create a Manager class that extends Employee and adds a teamSize field.
// Add a describe() method to Manager that prints all three fields. Create a Manager object and call describe().
class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public String describe() {
        return "Name: " + this.name + ", Salary: " + this.salary + ", Team Size: " + this.teamSize;
    }
}


