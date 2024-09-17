package muna.com;

public class book {
    public String title;
    public String author;
    private String ISBN;
    int copiesAvailable;


    public book(String title, String author, String ISBN, String copiesAvailable ) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.copiesAvailable= Integer.parseInt(copiesAvailable);

    }



    public String getISBN()
    {
        return ISBN;
    }

    public void setCopiesAvailable(int copiesAvailable)
    {

        this.copiesAvailable = copiesAvailable;
    }

    public int getCopiesAvailable()
    {
        return copiesAvailable;
    }


    public void add(book book) {
    }
}