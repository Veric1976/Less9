package Veric.SkyPro.Less9;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearPublishingBook;

    public Book ( String nameB, Author authorB, int yearP) {
        this.nameBook = nameB;
        this.authorBook = authorB;
        this.yearPublishingBook = yearP;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearPublishingBook() {
        return yearPublishingBook;
    }

    public void setYearPublishingBook(int yearPublishingBook) {
        this.yearPublishingBook = yearPublishingBook;
    }

    public void printBook () {
        System.out.println("this.nameBook = " + this.nameBook);
        System.out.println("this.authorBook.getFirstNameAuthor() = " + this.authorBook.getFirstNameAuthor());
        System.out.println("this.authorBook.getLastNameAuthor() = " + this.authorBook.getLastNameAuthor());
        System.out.println("this.yearPublishingBook = " + this.yearPublishingBook);
    }

}
