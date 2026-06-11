package week4;
import java.util.ArrayList;

public class Day17 {
    public static void main(String[] args) {

        //Q1
        //Create an ArrayList of 7 numbers. Loop through with a for loop and print only the numbers that are greater than 10.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(7);
        for (Integer i : numbers) {
            if (i > 10) {
                System.out.println(i);
            }
        }

        //Q2
        //Create an ArrayList of 6 names. Loop through and print only names that have more than 4 characters.
        ArrayList<String> names = new ArrayList<>();
        names.add("duryodhan");
        names.add("ravan");
        names.add("Juli");
        names.add("ram");
        names.add("geeta");
        names.add("sita");
        for (String i : names) {
            if (i.length() > 4) {
                System.out.println(i);
            }
        }

        //Q3
//        Create an ArrayList of 6 prices. Loop through and use set() to apply a 10% discount to every price above Rs. 500.
//         Print the list before and after.
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(999.99);
        prices.add(25.79);
        prices.add(50.0);
        prices.add(600.0);
        prices.add(70.0);
        prices.add(800.0);
        System.out.println("Before: " + prices);
        for (int i = 0; i < prices.size(); i++) {
            double currentPrice = prices.get(i);
            if (currentPrice > 500) {
                prices.set(i, currentPrice * 0.9);
            }
        }
        System.out.println("After: " + prices);

        //Q4
        //Create an ArrayList of 8 exam scores. Count and print how many students passed (score >= 40) and how many failed.
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(30);
        scores.add(80);
        scores.add(40);
        scores.add(43);
        scores.add(10);
        scores.add(50);
        scores.add(68);
        scores.add(90);

        int passCount = 0;
        int failCount = 0;
        for (int i = 0; i < scores.size(); i++) {
            int currentScore = scores.get(i);
            if (currentScore >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }
        System.out.println(passCount + " Students Passed");
        System.out.println(failCount + " Students fail");

        //Q5
        //Create an ArrayList of 6 words. Build a second ArrayList that contains only the words from the first list that start with a vowel (a, e, i, o, u).
        // Print the filtered list.
        ArrayList<String> words = new ArrayList<>();
        words.add("aditya".toLowerCase());
        words.add("bansi".toLowerCase());
        words.add("dishit".toLowerCase());
        words.add("Agastya".toLowerCase());
        words.add("ishika".toLowerCase());
        words.add("europe".toLowerCase());
        ArrayList<String> filteredList = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) == 'a' || words.get(i).charAt(0) == 'e' || words.get(i).charAt(0) == 'i' || words.get(i).charAt(0) == 'o' || words.get(i).charAt(0) == 'u') {
                filteredList.add(words.get(i));
            }
        }
        System.out.println(filteredList + "-------Filtered List that start with a vowel");
    }

}
