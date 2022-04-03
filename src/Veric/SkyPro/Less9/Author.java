package Veric.SkyPro.Less9;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author ( String firstN, String lastN) {
        this.firstNameAuthor = firstN;
        this.lastNameAuthor = lastN;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }
}
