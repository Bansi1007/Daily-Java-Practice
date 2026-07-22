package week5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day25 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        studentReportCard();
        expenseTracker();
        numberGuessingGame();
        librarySystem();
        marksManager();
    }

//Q1
//Build a Student Report Card. Ask for 3 students' names and their marks for 2 subjects each.
// Store in a HashMap>. Calculate and print each student's average and grade.

    static void studentReportCard() {
        HashMap<String, Integer> reportCard = new HashMap<>();
        List<String> grades = Arrays.asList("A", "B", "C");
        for (int i = 1; i <= 3; i++) {
            String name = "";
            List<Integer> marks = new ArrayList<>();
            Integer mark = 0;
            Integer sum = 0;
            Integer avg = 0;
            System.out.print("Enter student name : ");
            try {
                name = input.nextLine();
                for (int j = 1; j <= 2; j++) {
                    System.out.print("Enter marks for subject : " + j + "----");
                    mark = Integer.parseInt(input.nextLine());
                    marks.add(mark);
                }
                sum = marks.stream().mapToInt(Integer::intValue).sum();
                avg = sum / 2;
                reportCard.put(name, avg);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(reportCard);

        // 2. Sort by value descending and collect to an ordered list
        List<Map.Entry<String, Integer>> sortedEntries = reportCard.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());

// 3. Map the sorted items to their respective grades based on index
        Map<String, String> gradedReportCard = IntStream.range(0, sortedEntries.size())
                .boxed()
                .collect(Collectors.toMap(
                        i -> sortedEntries.get(i).getKey(),
                        i -> grades.get(Math.min(i, grades.size() - 1)), // Prevents IndexOutOfBounds if map is larger than grade list
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new // Keeps the highest-to-lowest order
                ));
        System.out.println("Grade--" + gradedReportCard);
    }


    //Build an expense tracker. Keep asking the user to enter a category and an amount (e.g. 'Food 250').
    // Store in a HashMap where the value is the total spent per category.
    // Stop when they type 'done'. Print the full breakdown and grand total.
    public static void expenseTracker() {
        String userEnteredWord = "Your expense tracker ";
        HashMap<String, Integer> expences = new HashMap<>();
        while (!userEnteredWord.equals("done")) {
            String category = "";
            Integer amount = 0;
            try {
                System.out.print("enter next category : ");
                userEnteredWord = String.valueOf(input.nextLine().toLowerCase());
                if (userEnteredWord.matches("^[a-zA-Z]+$")) {
                    category = userEnteredWord;
                }
                System.out.print("enter amount : ");
                amount = Integer.parseInt(input.nextLine());
                expences.put(category, amount);
            } catch (NumberFormatException e) {
                System.out.println("Enter valid word: ");
                input.close();
            }
        }
        if (userEnteredWord.equals("done")) {
            input.close();
        }
        System.out.println("Expenses: " + expences);
        System.out.println("Total amount of expences : " + expences.entrySet().stream().mapToInt(Map.Entry::getValue).sum());

    }

    //Build a number guessing game. Hardcode the secret number as 42. Ask the user to guess.
    // Print 'Too low', 'Too high', or 'Correct!'. Count how many guesses they took and print it when they win.
    static void numberGuessingGame() {
        int secretNumber = 42;
        int userGuessedNumber = 0;
        int count = 0;
        while (userGuessedNumber != 42) {
            try {
                System.out.print("Enter guess number : ");
                userGuessedNumber = Integer.parseInt(input.nextLine());
                if (userGuessedNumber == secretNumber) {
                    System.out.println("Correct!");
                    break;
                } else if (userGuessedNumber > secretNumber) {
                    System.out.println("too high");
                    count++;
                } else {
                    System.out.println("too low");
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number: ");
            }
        }
        System.out.println("You won!....." + count + " guesses taken.....");
    }

    //Build a mini library system. Store 5 book titles in an ArrayList and their authors in a HashMap (title → author).
    // Let the user: search for a book by title (print the author if found), and add a new book. Wrap lookups in try/catch.
    static void librarySystem() {
        ArrayList<String> title = new ArrayList<>();
        title.add("Library");
        title.add("Programming");
        title.add("Mathematics");
        title.add("lifestyle");
        title.add("cooking");
        title.add("sports");
        System.out.println(title);

        HashMap<String, String> author = new HashMap<>();
        author.put("Library", "bansi");
        author.put("Programming", "dishit");
        author.put("Mathematics", "carney");
        author.put("lifestyle", "shakira");

        try {
            System.out.println("Search book by title..");
            String searchTitle = input.nextLine();
            if (author.containsKey(searchTitle)) {
                System.out.println("author name = " + author.get(searchTitle));
            } else {
                System.out.println("No such title");
            }
            System.out.println("add a new book...");
            String newTitle = input.nextLine();
            System.out.println("add a new author...");
            String newAuthor = input.nextLine();
            title.add(newTitle);
            author.put(newTitle, newAuthor);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        System.out.println(author);
    }


    //Build a marks manager using HashMap. Show a menu in a loop: 1. Add a student 2. View all students and marks
    // 3. Find the highest scorer 4. Find the average mark 5. Quit Keep running until the user chooses 5.
    static void marksManager() {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("bansi", 90);
        marks.put("Bella", 50);
        marks.put("Chaya", 40);
        marks.put("Dhara", 100);
        boolean running = true;
        while (running) {
            System.out.println(" 1. Add a student 2. View all students and marks\n" +
                    "    // 3. Find the highest scorer 4. Find the average mark 5. Quit ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter student name : ");
                        String name = input.nextLine();
                        System.out.println("Enter marks for subject : ");
                        Integer mark = input.nextInt();
                        input.nextLine();
                        marks.put(name, mark);
                        break;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                case 2:
                    System.out.println(marks);
                    break;
                case 3:
                    System.out.println("highest score : " + marks.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey());
                    break;
                case 4:
                    System.out.println("avg marks : " + marks.entrySet().stream().mapToInt(Map.Entry::getValue).average());
                    break;
                case 5:
                    System.out.println("quit");
                    running = false;
                    break;
            }
        }
    }
}
