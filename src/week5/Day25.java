package week5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day25 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       // studentReportCard();
        expenseTracker();
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
    public static void expenseTracker(){
        String userEnteredWord = "Your expense tracker ";
        HashMap<String, Integer> expences = new HashMap<>();
        while (!userEnteredWord.equals("done")) {
            String category ="";
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
}
