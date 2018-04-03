package pl.edu.ur.oopl5.bazaFirmy;

/**
 *
 * @author Przemysław Paliński
 */
public class Worker {

    private String name;
    private String surname;
    private int age;
    private String position;

    public Worker(String name, String surname, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name=" + name + "\nSurname=" + surname + "\nAge=" + age + "\nPosition=" + position;
    }

}
