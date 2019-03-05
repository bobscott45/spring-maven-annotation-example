package dev.robertscott.springmavenexample;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Batting practice for 30 minutes";
    }
}
