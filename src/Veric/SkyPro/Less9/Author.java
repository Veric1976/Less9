package Veric.SkyPro.Less9;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Author: " +
                firstNameAuthor + ' ' +
                lastNameAuthor + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstNameAuthor.equals(author.firstNameAuthor) && lastNameAuthor.equals(author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }
}
