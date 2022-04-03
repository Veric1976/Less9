package Veric.SkyPro.Less9;

public class Less9 {
    public static void main(String[] args) {

        Author author1 = new Author( "James", "Hetfield");
        Author author2 = new Author("Lars", "Ulrich");
        Book book1 = new Book( "Blackened", author1, 1988);
        Book book2 = new Book("Enter Sandman", author2, 1990);
        book2.setYearPublishingBook( 1991);
        book1.printBook();
        book2.printBook();
    }
}
