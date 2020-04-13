package leonslab;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }
    public Instructor(){
        super(0L, null);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
            learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLeaner = numberOfHours/learners.length;
        for(Learner learner : learners ){
            learner.learn(numberOfHoursPerLeaner);
        }
}




}
