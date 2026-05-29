import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
    }

    //Q1
    //Store a name as a String. Print it in all caps, then all lowercase, then print how many characters it has.
    public static void Q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name = ");
        String name = sc.nextLine();

        System.out.println("You entered: " + name.toUpperCase());
        System.out.println("lower case " + name.toLowerCase());
        System.out.println("number of characters: " + name.length());
    }

    //Q2
    //You have the string ' hello world ' (spaces on both sides). Trim the spaces and print the cleaned string and its length.
    public static void Q2() {
        String helloWorld = "   Hello World   ";
        System.out.println(helloWorld);
        System.out.println(helloWorld.trim() + "   length = " + helloWorld.length());
    }

    //Q3
    //A user types their email as 'User@Gmail.COM'. Convert it to all lowercase and print it.
    public static void Q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email : ");
        String email = sc.nextLine();
        System.out.println("Your email in lowerCase: " + email.toLowerCase());
    }

    //Q4
    //You have the sentence 'I love Java programming'. Check if it contains the word 'Java' and print the result.
    public static void Q4() {
        String sentence = "I love Java programming";
        System.out.println(sentence.contains("Java"));
        if (sentence.contains("Java")) {
            System.out.println("Yes it contains the word 'Java'");
        } else {
            System.out.println("No it does not contains the word 'Java'");
        }
    }

    //Q5
    //A product description reads 'This item is Bad and overpriced'.
    // Replace 'Bad' with 'Good' and 'overpriced' with 'affordable'. Print the updated description.
    public static void Q5() {
        String description = "This item is Bad and overpriced";
        System.out.println("product description : " + description);
        String converted = description.replace("Bad", "Good").replace("overpriced", "affordable");
        System.out.println("converted description : " + converted);
    }

    //Given the string 'Sandeep', print the first character and the last character.
    public static void Q6() {
        String s1 = "Sandeep";
        System.out.println("first character  : " + s1.charAt(0) + " .......last character : " + s1.charAt(s1.length() - 1));
    }
}
