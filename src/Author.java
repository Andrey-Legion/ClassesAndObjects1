public class Author {
     final String name;
     final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getname() {
        return name;
    }

    public String getsurname() {
        return surname;
    }

    @Override
    public String toString() {
        return getname() + ' ' + getsurname();
    }
}
