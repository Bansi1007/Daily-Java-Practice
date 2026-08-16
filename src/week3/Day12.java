package week3;
public class Day12 {
    static void main(String[] args) {
       maxOfThree(5,6,11);

        String[] isPalindromes = new String []{"madam", "racecar", "hello", "level"};
        for (String passed : isPalindromes) {
            System.out.println(isPalindrome(passed));
        }

        Double[] temp1 = new Double[]{0.0,100.0,37.0};
        for(Double Celsius: temp1){
            System.out.print(celsiusToFahrenheit(Celsius));
        }
        Double[] temp2 = new Double[]{212.0,32.0};
        for (Double Fahrenheit: temp2){
            System.out.print(fahrenheitToCelsius(Fahrenheit));
        }

        String sentence = "checking words in this sentence";
        System.out.println(countWords(sentence));

        Double[] amount = new Double[]{1250.00, 49.99, 2540.89, 34.89, 99.98 };
        for (Double amounts : amount) {
            System.out.println(formatPrice(amounts));
        }
    }

    //Q1
    //Write a method called maxOfTwo(int a, int b) that returns the larger of two numbers.
    // Then write maxOfThree(int a, int b, int c) that uses maxOfTwo() inside it.
    static int maxOfTwo(int a, int b){
        int c = Math.max(a,b);
        return c ;
    }

    static void maxOfThree(int a, int b, int c) {
        int largerOfTwo = maxOfTwo(a,b);
        int largest = maxOfTwo(largerOfTwo,c);
        System.out.println("larger of all is : "+largest);
    }

    //Q2
    //Write a method called isPalindrome(String s) that returns true if the word reads the same forwards and backwards.
    // Test with 'madam', 'racecar', 'hello', 'level'.
    static boolean isPalindrome(String s){
       String reverse =  new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reverse);
    }

    //Q3
    //Write two methods: celsiusToFahrenheit(double c) and fahrenheitToCelsius(double f).
    // Convert and print: 0°C, 100°C, 37°C to Fahrenheit — and 32°F, 212°F to Celsius.
    static String celsiusToFahrenheit(double c){
        double fahrenheit = ((c*9)/5) + 32;
        return c+"°C To Fahrenheit "+fahrenheit;
    }

    static String fahrenheitToCelsius(double f){
        double celsius = (f-32)*5/9;
        return f+"°F To Celsius "+celsius;
    }

    //Q4
    //Write a method called countWords(String sentence) that returns how many words are in a sentence.
    static int countWords(String sentence){
        String[] words = sentence.trim().split(" +");
        return words.length;
    }

    //Q5
    //Write a method called formatPrice(double amount) that returns the amount as a formatted string. Call it for 5 different amounts.
    static String formatPrice(double amount){
        return String.format("Rs. %.2f", amount);
    }
}
