package FitnesTrackingApplication;

public class Activity {
    private String name;
    private int durationMinutes;
    private double calorieFactor;

    public Activity(String name, int durationMinutes, double calorieFactor) {
        this.name = name;
        this.durationMinutes = durationMinutes;
        this.calorieFactor = calorieFactor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalorieFactor() {
        return calorieFactor;
    }

    public void setCalorieFactor(double calorieFactor) {
        this.calorieFactor = calorieFactor;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    public double calculateCalories() {
        return calorieFactor;
    }
    public void showInfo(){
        System.out.println("Activity:"+name+"Duration:"+durationMinutes+"Calorie Burned:"+calculateCalories()+"kcal");
    }


}
