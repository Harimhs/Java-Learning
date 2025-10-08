package LibraryManagementSystem;

import java.util.*;

public class Library  {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addUser(int userId, String name){
        System.out.println("Welcome "+name+"! Your Registration "+"[USER_ID: "+userId +"] is done...");
        User user= new User(userId, name);
        users.add(user);
    }

    public boolean addBorrowedBooks(Book book, User user){
        if(book.isAvailable()){
            if(user.borrowedBooks.size()<3){
                user.borrowedBooks.add(book);
                book.setAvailable(false);
                return true;
            }
            else return false;
        }
        else{
            System.out.println("Selected Book is not available!");
            return false;
        }
    }

    public void showBorrowedBooks(User user){
        if(!user.borrowedBooks.isEmpty()){
            for(int i=0;i<user.borrowedBooks.size();i++){
                String title = user.borrowedBooks.get(i).getTitle();
                String name = user.borrowedBooks.get(i).getAuthor();
                System.out.println("Book name: "+title+ ", Author name: "+name);
            }
        } else System.out.println("Your account has no records of books...");
    }

    public void addBooks(String title, String author, boolean isAvailable){
        System.out.println("New Book Added! "+"title: "+title+" by author "+author+" is now available!");
        books.add(new Book(title, author, isAvailable));
    }

    public static void main(String[] arg) {

        Library myLib= new Library();
        System.out.println("Welcome to Library!");
        System.out.println("1. Register as user");
        System.out.println("2. Borrow a book and register");
        System.out.println("3. Add book to library");
        System.out.println("4. Show the book borrowed history");
        System.out.println("5. Show the users list");
        System.out.println("6. Show the books in library");
        System.out.println("7. Exit");

        Scanner sc = new Scanner(System.in);
        boolean off = false;

        while (!off) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your userId: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    myLib.addUser(userId, name);
                    break;
                case 2:
                    if(myLib.books.isEmpty()) System.out.println("No books available now...");
                    else{
                        System.out.println("Pick a Book from below...");
                        for (Book book : myLib.books) System.out.println(book.getTitle());
                        boolean found= false;
                        Book bookNeeded= null;
                        while(!found){
                            String titleNeed = sc.nextLine();
                            for(Book book: myLib.books){
                                if(book.getTitle().equals(titleNeed)){
                                    found= true;
                                    bookNeeded= book;
                                    System.out.println("Book found!: "+ book.getTitle());
                                    break;
                                }
                            }
                            if(!found) System.out.println("Entered Book is not available! Please choose from list...");
                        }
                        System.out.println("Enter User name: ");
                        String username = sc.nextLine();
                        boolean founduser= false;
                        for(User user: myLib.users){
                            if(user.getName().equals(username)){
                                if(myLib.addBorrowedBooks(bookNeeded, user)){
                                    founduser= true;
                                    System.out.println("Successfully Book added to your Account!");
                                }
                                else System.out.println("Your Account already holds maximum no. of books...");
                                break;
                            }
                        }
                        if(!founduser)System.out.println("User not found!");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter book author: ");
                    String author = sc.nextLine();
                    myLib.addBooks(title, author, true);
                    break;
                case 4:
                    System.out.println("Enter User name: ");
                    sc.nextLine();
                    String username = sc.nextLine();
                    boolean founduser= false;
                    for(User user: myLib.users){
                        if(user.getName().equals(username)){
                            founduser= true;
                            myLib.showBorrowedBooks(user);
                            break;
                        }
                    }
                    if(!founduser)System.out.println("User not found!");
                    break;
                case 5:
                    if(myLib.users.isEmpty()) System.out.println("No user have registered!");
                    else {
                        System.out.println("Here the list of Users in library...");
                        int sno = 0;
                        for (User user : myLib.users) {
                            sno++;
                            System.out.println(sno + ". " + "User ID: " + user.getUserId() + ", Username:  " + user.getName());
                        }
                    }
                    break;
                case 6:
                    if(myLib.books.isEmpty()) System.out.println("No books have added to the library!");
                    else{
                        int sno=0;
                        for(Book book: myLib.books){
                            sno++;
                            System.out.println(sno+". "+"Book Name: "+book.getTitle()+" Author: "+book.getAuthor());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Goodbye! Please visit again.");
                    off = true;
                    break;
            }
        }
    }
}
