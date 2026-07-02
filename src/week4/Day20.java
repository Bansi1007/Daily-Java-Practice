package week4;

import week4.model.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Day20 {
    public static void main(String[] args) {
       // printAll();
       // Q2();
       // Q3();
       // Q4();
        Q5();
    }



static class task {
    String task;
    public task(String task){
        this.task =  task;
    }
    @Override
    public String toString() {
        return task;
    }

}
//Create two ArrayLists: morningTasks with 3 tasks and afternoonTasks with 3 tasks.
// Use addAll() to combine them into a single allTasks list. Print allTasks.
public static void printAll() {
    ArrayList<task> morningTasks = new ArrayList<task>();
    ArrayList<task> afternoonTasks = new ArrayList<task>();
    ArrayList <task>allTasks = new ArrayList<>();
    morningTasks.add(new task("Brush"));
    morningTasks.add(new task("Tea"));
    morningTasks.add(new task("Walk"));

    afternoonTasks.add(new task("Lunch"));
    afternoonTasks.add(new task("work"));
    afternoonTasks.add(new task("grocery"));

    allTasks.addAll(morningTasks);
    allTasks.addAll(afternoonTasks);
    for (task t:allTasks){
        System.out.println(t);
    }
}


//Q2

    //Create an ArrayList of 6 items in a shopping cart. Create another ArrayList of 3 items that are out of stock.
    // Use removeAll() to remove the out-of-stock items from the cart. Print the updated cart.
    public static class item {
    String name;
    boolean inStock;
    public item(String name, boolean inStock) {
        this.name = name;
        this.inStock = inStock;
    }

        public String getName() {
            return name;
        }

        public boolean isInStock() {
            return inStock;
        }

        @Override
    public String toString() {
        return name;
    }
    }
    public static void Q2(){
        ArrayList<item> shoppingCart = new ArrayList<>();

            shoppingCart.add(new item("Brush",true));
            shoppingCart.add(new item("Tea",true));
            shoppingCart.add(new item("meat",false));
            shoppingCart.add(new item("soup",false));
            shoppingCart.add(new item("chicken",false));
            shoppingCart.add(new item("veggies",true));

            System.out.println(shoppingCart);

            shoppingCart.removeAll(shoppingCart.stream().filter(item -> !item.isInStock()).toList());
            System.out.println(shoppingCart);
    }

    //Q3
    //You have two class lists: classA with 5 names and classB with 4 names.
    // Combine them into one list and loop through to print all students with a number next to each name.
    static class name{
        String name;
        int number;
        public name(String name, int number){
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void Q3(){
       List<name>classA = new ArrayList<>();
       List<name>classB = new ArrayList<>();
       classA.add(new name("sandip",1));
       classA.add(new name("malyka",2));
       classA.add(new name("raj",3));
       classA.add(new name("simran",4));
       classA.add(new name("kinjal",5));

       classB.add(new name("karan",1));
       classB.add(new name("kartik",2));
       classB.add(new name("sweta",3));
       classB.add(new name("rahul",4));
       List<name>classC = new ArrayList<>(classA);
       System.out.println(classC);
       classC.addAll(classB);
       for(name c:classC){
           System.out.println(c+" "+c.number);
       }

    }

    //Q4
    //You have a list of 8 allowed usernames and a list of 3 banned usernames.
    // Use removeAll() to remove the banned ones from the allowed list. Print the final clean list.
    static class username{
        String name;
        boolean isAllowed;
        public username(String name,boolean isAllowed){
            this.name=name;
            this.isAllowed=isAllowed;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    public static void Q4(){
        List<username>finalList = new ArrayList<>();
        finalList.add(new username("sandip",true));
        finalList.add(new username("malyka",false));
        finalList.add(new username("raj",true));
        finalList.add(new username("kinjal",false));
        finalList.add(new username("sweta",true));
        finalList.add(new username("rahul",true));
        finalList.add(new username("dishit",false));
        finalList.add(new username("bansi",true));
        System.out.println(finalList);
        finalList.removeAll(finalList.stream().filter(user -> !user.isAllowed).collect(Collectors.toList()));
        System.out.println(finalList);
    }

    //Q5
    //Create an ArrayList of all the fruits you like (at least 5). Create another list of fruits you are allergic to (2–3 items).
    // Remove the allergic ones from your list using removeAll(). Print what you can safely eat.
    static class fruits{
        String name;
        public fruits(String name){
            this.name=name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    static void Q5(){
        ArrayList<fruits>fruit = new ArrayList<>();
        ArrayList<fruits>allergicFruits = new ArrayList<>();
        fruit.add(new fruits("APPLE"));
        fruit.add(new fruits("ORANGE"));
        fruit.add(new fruits("PEAR"));
        fruit.add(new fruits("PEACH"));
        fruit.add(new fruits("PINEAPPLE"));
        fruit.add(new fruits("mango"));

        allergicFruits.add(new fruits("PEAR"));
        allergicFruits.add(new fruits("cherry"));
        allergicFruits.add(new fruits("peach"));

        System.out.println(fruit);
      List<fruits>remove =  fruit.stream()
                                  .filter(fruits -> allergicFruits.stream().anyMatch(allergic->allergic.name.equalsIgnoreCase(fruits.name))).toList();

      fruit.removeAll(remove);
       System.out.println(fruit);


    }
}