package dev.robertscott.springmavenexample;

public class TrackCoach implements Coach {

    private ReportingService reportingService;

    public TrackCoach(ReportingService reportingService) {
        this.reportingService = reportingService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }

    @Override
    public ReportingService getReportingService() {
        return reportingService;
    }
}
