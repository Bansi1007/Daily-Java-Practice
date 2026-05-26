public class Day1 {

    //Print your name, your city, and your age — each on its own line.
    public static void main(String[] args) {
        System.out.println("Bansi");
        System.out.println("Pickering");
        System.out.println("26");
        Q2();
        Q3();
        Q4();
        Q5();

    }

    //Create a variable for your age and another for your name. Print a sentence using both.
    public static void Q2(){
        int Age= 26;
        String name= "Bansi";
        System.out.println(" My name is "+name +" and I am "+Age +" years old.");

    }
    //Store the price of a coffee (e.g. 120.50) in a variable. Print a sentence showing the price.
    public static void Q3(){
        double cost = 120.50;
        System.out.println("One coffee costs Rs. "+cost);
    }

    //Create a boolean variable called isRaining and set it to true. Print it in a sentence.
    public static void Q4(){
        boolean isRaining=true;
        System.out.println("Is it raining? " + isRaining);
    }

    //Store your favourite movie title in a String. Print it. Then change it to a different movie and print again.
    public static void Q5(){
        String movie_title ="Dhurandhar";
        System.out.println(movie_title);
        movie_title  ="Harry Potter";
        System.out.println(movie_title);

    }

}
