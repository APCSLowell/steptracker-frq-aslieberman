import java.util.ArrayList;
public class StepTracker {
    private int minSteps, totalSteps, daysTracked, activeDays;

    public StepTracker(int min) {
        minSteps = min;
        totalSteps = 0;
        daysTracked = 0;
        activeDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        daysTracked++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (daysTracked == 0) {
            return 0.0;
        }
        return (double) totalSteps / daysTracked;
    }
}