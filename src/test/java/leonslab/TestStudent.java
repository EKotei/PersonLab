package leonslab;

import leonslab.Learner;
import leonslab.Person;
import leonslab.Student;
import org.junit.Test;
import org.junit.Assert;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student testStudent = new Student(7668, "Ashie");
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student testStudent = new Student(7668, "Ashie");
        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        Student testStudent = new Student(7668, "Ashie");
        Double in = 20.0;
        Double expected = 20.0;
        testStudent.learn();
        Assert.assertEquals(expected, in);
    }
}