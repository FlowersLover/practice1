package data_types.person;

public class Person {
    private String firstName;
    private String lastName;
    private int passsportId;
    private Gender gender;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passsportId) {
        this.passsportId = passsportId;
    }

    public Person(String firstName, String lastName, int passsportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passsportId = passsportId;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, int passsportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passsportId = passsportId;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPasssportId() {
        return passsportId;
    }

    public void setPasssportId(int passsportId) {
        this.passsportId = passsportId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person("Sasha", "Tsarkov");
        Person person4 = new Person(4);
        Person person5 = new Person("Liza", "Abdullina", 5);
        person1.setFirstName("Dasha");
        person1.setLastName("Murashkina");
        person1.setPasssportId(1);
        person.setFirstName("Natasha");
        person.setLastName("Murashkina");
        person.setPasssportId(2);
        person2.setFirstName("Misha");
        person2.setLastName("Murashkin");
        person2.setPasssportId(3);
    }
}
