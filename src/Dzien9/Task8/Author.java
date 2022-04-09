package Dzien9.Task8;

public class Author {
    private String surname;
    private String nationality;

    public Author(String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }

    public void print () {
        System.out.println(this);
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
