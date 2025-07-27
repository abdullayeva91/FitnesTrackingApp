package FitnesTrackingApplication;

public class Yoga extends Activity implements IGoalTrackable{
    private String type;

    public Yoga(String name, int durationMinutes, double calorieFactor, String type) {
        super(name, durationMinutes, calorieFactor);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showInfo() {
        System.out.println("Yoga"+getType()+"Minutes"+getDurationMinutes()+"Calorie Burned"+calculateCalories()
                +"kcal");
    }

    @Override
    public boolean isGoalReached(int goalDurationMinutes) {
        return true;
    }

    @Override
    public double calculateCalories() {
        return super.calculateCalories()*4.0;
    }
}

