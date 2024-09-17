package testSystem;

import muna.com.Library;
import muna.com.book;
import muna.com.member;

import java.lang.reflect.Member;


public class testClass {
    public static void main(String[]args)
    {
        Library library = new Library();



       book book1=new book("The Kill a Mockingbird", "Harper Lee","08743211","30");
       book book2=new book("the Lord of the rings", "j.r.r","0618640157", "34");


       Library.addBook(book1);
       library.addBook(book2);

        member member1=new member("muna","N008");
        member member2=new member("saida ","P003");


        library.lendBook("1234", "N008");;
        library.lendBook("7890","P003");

System.out.println("muna's borrowed book: "+ member1.getBorrowBooks() + "the kill a monkbird ");
        System.out.println("saida borrowed book: "+ member2.getBorrowBooks() + "the lord of the rings");


    }
}
