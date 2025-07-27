package FitnesTrackingApplication;

public class FitnessTracker {
    public void logActivity(Activity activity){
        activity.showInfo();

        if (activity.calculateCalories()>100){
            System.out.println("Congratulations! High-intensity activity!");
        }else {
            System.out.println("Keep going, you`re doing great!");
        }
    }
    public void checkGoal(IGoalTrackable activity, int goalDurationMinutes){
       boolean completed= activity.isGoalReached(goalDurationMinutes);
        System.out.println("Goal:"+goalDurationMinutes+"minutes. Reached"+completed+".");
    }


    }

