package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private int userId;
    private String name;
    List<Book> borrowedBooks = new ArrayList<>();

    public User(int userId, String name) {
        this.userId= userId;
        this.name= name;
    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
