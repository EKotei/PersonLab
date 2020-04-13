package leonslab;

import leonslab.Person;
import org.junit.Test;
import org.junit.Assert;

public class TestPerson{

    @Test
    public void testConstructor(){
        String name = "Ed";
        Long id = 4669L;
        Person testPerson = new Person(id, name);
        String expected = "Ed";
        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
}
    public void testSetName(){

}





}
