package leonslab;

import leonslab.Instructor;
import leonslab.Person;
import leonslab.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(8776L, "Ash");
        assert instructor instanceof Teacher;
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(8776L, "Ash");
    assert instructor instanceof Person;
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(8776L, "Ash");
        Learner learner = new Student(4567, "E");
        double expected = 8.0;
        learner.learn(1.0);
        instructor.teach(learner, 1.0);
        double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);

    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(3748L, "K");
        Student[] students ={new Student(), new Student(), new Student()};
        instructor.lecture(students,6.0);
        double expected =2.0;
        double actual = students[0].getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.0);

    }
}
