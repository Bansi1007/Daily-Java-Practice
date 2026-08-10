package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day26 {
   static Account account = new Account(200,90);
    public static void main(String[] args) {
        int[] finaltotal = {1,100,500,25};
        totalListOfAmount(finaltotal);
        returnLargestValue(finaltotal);
        String[] lists={"cad","usd","inr"};
        String target = "inr";
        numofOccurance(lists,target);
        reverseString("Bansi");
        List<Integer> numbers =  Arrays.asList(100,900,60000,10000,350);
        newList(numbers);
        account.deposit(100);
        account.withdraw(60);
    }

    //Given int[] amounts holding transaction values in cents, return the total
    public static int totalListOfAmount(int[] amountsInCents ){
        int total=0;
       for(int values : amountsInCents){
           total+=values;
       }
        System.out.println(total);
        return total;
    }

    //Return the largest value in an int[]. Decide what your method does when the array is empty, and say why.
    public static void returnLargestValue(int[] list){
        int largest=0;
        if(list.length==0){
            System.out.println("The list is empty");
        }else {

            for (int number : list) {
                if (number > largest) {
                    largest = number;
                }
            }
            System.out.println(largest);
        }
    }

    public static int numofOccurance(String[] currencies, String target){
       int count = 0;
       for(String curr : currencies){
           if (target.equalsIgnoreCase(curr)){
               count++;
           }
       }
       System.out.println(count);
       return count;
    }

    //Return the reverse of a String. Write it with a loop first, then say what the one-line version is.
    public static void reverseString(String str){
       StringBuilder builder = new StringBuilder(str.length());

     //  System.out.println( builder.reverse().toString());
        if (str.length()!=0){
            for(int i=str.length()-1;i>=0;i--){
                builder.append(str.charAt(i));
            }
            System.out.println(builder.toString());
        }
    }

    //Given List<Integer> amounts, return a new list containing only the entries above 1000. Leave the input untouched.
    public static void newList(List<Integer> amounts){
        List<Integer> newList = new ArrayList<>();
        if(!amounts.isEmpty()){
           newList=amounts.stream().filter(amount->amount>1000).toList();
            System.out.println( "new list -"+newList.toString());
        }
    }

    public static class Account{
        private int id;
        private int  balance;
        Account(int id, int balance){
            this.id=id;
            this.balance=balance;
        }

        public void deposit(int amount){
            balance+=amount;
            System.out.println("deposite fund---"+balance);
        }
        public void withdraw(int amount){
            if (amount<balance&&amount>0){
            balance-=amount;
            System.out.println("remaining balance---"+balance);
        }else {
                System.out.println("Insufficient funds");
            }
            }
    }



}
