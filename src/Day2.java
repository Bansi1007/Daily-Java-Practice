public class Day2 {
    public static void main(String[] args) {
    Q1();
    Q2();
    Q3();
    Q4();
    Q5();

    }


    //Q1
//You buy 3 items costing Rs. 45, Rs. 120, and Rs. 75. Calculate and print the total bill.
    public static void Q1() {
        int item1 = 45;
        int item2 = 120;
        int item3 = 75;
        int total = item1 + item2 + item3;
        System.out.println("Total Bill= Rs:" +total);

    }
    //A pizza has 8 slices. 3 friends want to share it equally. Print how many slices each person gets and how many are left over.
    public static void Q2() {
        int slice = 8;
        int friends=3;
        int leftoverSlices= slice % friends;
        int distributedSlices= slice / friends;
        System.out.println("Leftover Slices= "+leftoverSlices+ " and " + "each person gets = " +distributedSlices);
    }

    //Convert a temperature of 37 degrees Celsius to Fahrenheit and print the result.
    public static void Q3() {
        double C_temp=37;
        double F_temp= C_temp * 9 / 5.0 + 32;
        System.out.println("37 degrees Celsius to Fahrenheit temperature = " + F_temp);

    }
    //A shop offers a 15% discount on a product priced at Rs. 2000. Calculate and print the discount amount and the final price.
    public static void Q4() {
        int initial_price= 2000;
        double discount_amount=0.15*initial_price;
        double final_price= initial_price - discount_amount ;

        System.out.println("Initial price = " + initial_price);
        System.out.println("Discount price = " + discount_amount);
        System.out.println("Final price = " + final_price);

    }
    //You drive 350 km on 25 litres of petrol. Calculate and print the mileage (km per litre).
    public static void Q5() {
        int km = 350;
        int litre= 25;
        int mileage= km/litre;
        System.out.println("Mileage = " + mileage);

    }

}

