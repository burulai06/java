/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {

   
    static class Book {
        private String title;
        private String author;
        private String genre;
        private double rating;

    
        public Book(String title, String author, String genre, double rating) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.rating = rating;
        }

        public Book() {
            this.title = "";
            this.author = "";
            this.genre = "";
            this.rating = 0.0;
        }

        public void displayInfo() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Genre: " + genre);
            System.out.println("Rating: " + rating);
            System.out.println();
        }

        public void updateRating(double newRating) {
            this.rating = newRating;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "1984";
        book1.author = "George Orwell";
        book1.genre = "Dystopian";
        book1.rating = 4.8;
        book1.displayInfo();

        Book book2 = new Book();
        book2.title = "Pride and Prejudice";
        book2.author = "Jane Austen";
        book2.genre = "Romance";
        book2.rating = 4.6;
        book2.displayInfo();

        Book book3 = new Book();
        book3.title = "The Great Gatsby";
        book3.author = "F. Scott Fitzgerald";
        book3.genre = "Classics";
        book3.rating = 4.4;
        book3.displayInfo();

        System.out.println("Updated rating for " + book1.title + ":");
        book1.updateRating(4.9);
        book1.displayInfo();
    }
}
