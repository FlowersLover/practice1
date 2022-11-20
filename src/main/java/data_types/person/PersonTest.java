package data_types.person;

import data_types.person.Person;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testFirstName(){
        Person person = new Person();
        person.setFirstName("Dasha");
        Person person1 = new Person();
        person1.setFirstName("Alexandr");
        Person person2 = new Person("Natali","Murashkina",2);
        Person person3 = new Person();
        person3.setFirstName(null);
        Person person4 = new Person();
        Person person5 = new Person("Yaroslav","Samartcev");
        assertEquals(person.getFirstName(),"Dasha");
        assertEquals(person1.getFirstName(),"Alexandr");
        assertEquals(person2.getFirstName(),"Natali");
        assertEquals(person3.getFirstName(),null);
        //assertEquals(person4.getFirstName(),"a");
        assertEquals(person5.getFirstName(),"Yaroslav");
    }
    @Test
    public void testLastName(){
        Person person = new Person();
        person.setLastName("Beethoven");
        Person person1 = new Person("James","Cook");
        Person person2 = new Person("Charles","Darwin",226);
        Person person3=new Person();
        person3.setLastName(null);
        assertEquals(person.getLastName(),"Beethoven");
        assertEquals(person1.getLastName(),"Cook");
        assertEquals(person2.getLastName(),"Darwin");
        assertEquals(person3.getLastName(),null);
    }
    @Test
    public void testPassportId(){
        Person person = new Person();
        person.setPasssportId(1234);
        Person person1 = new Person(123);
        Person person2 = new Person("Charles","Darwin",226);
        assertEquals(person.getPasssportId(),1234);
        assertEquals(person1.getPasssportId(),123);
        assertEquals(person2.getPasssportId(),226);
    }
}