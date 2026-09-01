package week5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Day22 {
    public static void main(String[] args) {

        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
    }

    //Q1
//Create a HashMap of 5 students and their marks. Loop through all entries using entrySet() and print each student's name and marks.
    static void Q1() {
        Map<String, Integer> students = new HashMap();
        students.put("bansi".toLowerCase(), 90);
        students.put("dishit".toLowerCase(), 40);
        students.put("riya".toLowerCase(), 80);
        students.put("kavita".toLowerCase(), 80);
        students.put("sweta".toLowerCase(), 60);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Create a HashMap of 5 items and their prices. Loop through using keySet() and print only items that cost more than Rs. 200.
    static void Q2() {
        Map<String, Integer> items = new HashMap();
        items.put("air-fryer", 90);
        items.put("fan", 150);
        items.put("boat", 8000);
        items.put("kayak", 1000);
        items.put("basketball", 60);
        for (String item : items.keySet()) {
            int price = items.get(item);
            if (price > 200) {
                System.out.println("price above 200------" + item + "----" + price);
            }
        }
    }

    //Q3
    //Create a HashMap of 5 students and their marks. Loop through and find the student with the highest marks. Print their name and score.
    static void Q3() {
        Map<String, Integer> students = new HashMap();
        students.put("bansi".toLowerCase(), 90);
        students.put("dishit".toLowerCase(), 40);
        students.put("riya".toLowerCase(), 80);
        students.put("kavita".toLowerCase(), 80);
        students.put("sweta".toLowerCase(), 60);

        String name = Collections.max(students.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(name + "----" + students.get(name));

    }

    //Q4
    //Create a HashMap of 6 employees and their salaries. Loop through all entries and give everyone a 10% raise by updating each
    // value using put(). Print the salaries before and after.
    static void Q4() {
        Map<String, Double> employees = new HashMap();
        employees.put("bansi".toLowerCase(), 90000.90);
        employees.put("dishit".toLowerCase(), 40000.00);
        employees.put("riya".toLowerCase(), 80000.00);
        employees.put("kavita".toLowerCase(), 84000.98);
        employees.put("sweta".toLowerCase(), 620000.43);

        for (String emp : employees.keySet()) {
            Double salary = employees.get(emp);
            Double raise = 0.10 * salary;
            double newSalary = salary + raise;
            employees.put(emp, newSalary);
            System.out.println(emp + " - " + salary + " - " + newSalary);
        }


    }

    //Create a HashMap of a student's subjects and their marks (5 subjects). Loop through all values to calculate the total and average.
    // Print each subject with its mark, then the average at the end.
    static void Q5() {
        Map<String, Integer> students = new HashMap();
        students.put("science", 90);
        students.put("sports", 80);
        students.put("physics", 60);
        students.put("chemistry", 50);
        students.put("maths", 70);
        int sum = 0;
        int avg = 0;
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            sum = students.values().stream().mapToInt(Integer::intValue).sum();
            avg = sum / students.size();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("total" + " ----- " + sum);

        System.out.println("average ----- " + avg);
    }
}