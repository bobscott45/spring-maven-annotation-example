package dev.robertscott.springmavenexample;

public class BaseballCoach implements Coach {

    private ReportingService reportingService;

    public BaseballCoach(ReportingService reportingService) {
        this.reportingService = reportingService;
    }

    @Override
    public String getDailyWorkout() {
        return "Batting practice for 30 minutes";
    }

    @Override
    public ReportingService getReportingService() {
        return reportingService;
    }
}
