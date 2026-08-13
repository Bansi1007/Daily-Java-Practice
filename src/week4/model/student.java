package week4.model;

public class student {
   public String name;
   public int marks;
    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static class BankAccount{
        int balance;
        String name;

        public BankAccount(int balance, String name) {
            this.balance = balance;
            this.name = name;
        }

        public int deposit(int amount){
            this.balance += amount;
            return balance;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ScholarStudents{
        String name;
        int marks;

        public ScholarStudents(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }
    }

    public static class Movie{
        String title;
        double rating;
        public Movie(String title, double rating) {
            this.title = title;
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public double getRating() {
            return rating;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }
    }
}
