package leonslab;

import leonslab.People;
import leonslab.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        people.add(new Person(2567L, "Dan"));
        people.add(new Person(5558L, "Ed"));
        people.add(new Person(9098L, "King"));
        Assert.assertEquals(Integer.valueOf(3),people.count());
    }
    @Test
    public void testRemove(){
        ArrayList<Person> y = new ArrayList<>();
        y.add(new Person(2567L, "Dan"));
        y.add(new Person(5558L, "Ed"));
        y.add(new Person(9098L, "King"));
    }





}
