package FitnesTrackingApplication;

public class Running extends Activity implements IGoalTrackable{
    double distanceKM;

    public Running(String name, int durationMinutes, double calorieFactor, double distanceKM) {
        super(name, durationMinutes, calorieFactor);
        this.distanceKM = distanceKM;
    }

    public double getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(double distanceKM) {
        this.distanceKM = distanceKM;
    }

    @Override
    public void showInfo() {
        System.out.println("Running"+getDurationMinutes()+"Minutes"+getDistanceKM()+"KM"+
                "Calorie Burned"+calculateCalories()+"kcal");
    }

    @Override
    public boolean isGoalReached(int goalDurationMinutes) {
        return true;
    }
    public double calculateCalories(){
        return getDurationMinutes()*8.0;
    }
}

