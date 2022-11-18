package data_types;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testCase(){
        Person person = new Person();
        person.setFirstName("Dasha");
        person.setLastName("Murashkina");
        person.setPasssportId(1);
        Person person2 = new Person();
        person2.setFirstName("Alexandr");
        person2.setLastName("Tsarkov");
        person2.setPasssportId(2);
        Person person3 = new Person();
        person3.setFirstName("Natali");
        person3.setLastName("Murashkina");
        person3.setPasssportId(3);
        Person person4 = new Person();
        person4.setFirstName(" ");
        person4.setLastName(" ");
        person4.setPasssportId(100065);
        assertEquals(person3.getFirstName(),"Natali");
        assertEquals(person4.getPasssportId(),100065);
        assertEquals(person.getPasssportId(),1);
        assertEquals(person4.getLastName()," ");



    }
}