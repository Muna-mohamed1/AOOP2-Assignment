package muna.com;

import java.util.ArrayList;
import java.util.List;

public class member {
    public String name;
    private final String memberId;
    private List<book> borrowBooks;


    public member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowBooks = new ArrayList<>();
    }


    public String getMemberId()
    {
        return memberId;
    }

    public List<book> getBorrowBooks() {
        return borrowBooks;
    }

    public void borrowBook(book book)


    {
        addBookToBorrowedList(book);
    }


    private void addBookToBorrowedList(book book) {
        {
            borrowBooks.add(book);
        }
    }

    public void add(member member)
    {
    }
}





