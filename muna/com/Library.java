package muna.com;



import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<book> books;
    private List<member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public static void addBook(book book) {
        book.add(book);
    }

    public void registerMember(member member) {
        member.add(member);
    }


    private book findBookByIsbn(String isbn) {
        for (book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }

        return null;
    }

    private member findMemberById(String memberId) {
        for (member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void lendBook(String ISBN, String memberId) {
        book book = findBookByIsbn(ISBN);
        member member = findMemberById(memberId);

        if (book != null && member != null && book.getCopiesAvailable() > 0) {
            member.borrowBook(book);
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
            System.out.println("Book lent to member successfully!");
        } else {
            System.out.println("Book lending failed!");
        }
    }
}











