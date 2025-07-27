package FitnesTrackingApplication;

public class FitnessAppMain {
    public static void main(String[] args) {

    Running running=new Running("Run",45,45.0,5.0);
    Yoga yoga=new Yoga("Yoga",60,240.0,"Vinyasa");
    Activity walk= new Activity("Walking",30,90.0);

        running.showInfo();
        System.out.println("-------------");

        yoga.showInfo();
        System.out.println("--------------");

        walk.showInfo();
        System.out.println("---------------");


    FitnessTracker fitnessTracker=new FitnessTracker();
    fitnessTracker.logActivity(running);
    fitnessTracker.logActivity(yoga);
    fitnessTracker.logActivity(walk);

        boolean runningGoalReached= running.isGoalReached(45);
        System.out.println("Running goal reach"+runningGoalReached);

        boolean yogaGoalReached = yoga.isGoalReached(60);

        System.out.println("Yoga goal reach"+yogaGoalReached);


    fitnessTracker.checkGoal(running,45);
    fitnessTracker.checkGoal(yoga,60);


    Activity polymorphicRunning=new Activity("Polymorphic Run",30,450);
    polymorphicRunning.showInfo();
    Activity polymorphicYoga=new Activity("Polymorphic Yoga",60,240);
    polymorphicYoga.showInfo();
    Activity polymorphicWalking=new Activity("Polymorphic Walking",30,90.0);
    polymorphicWalking.showInfo();




    }
}
