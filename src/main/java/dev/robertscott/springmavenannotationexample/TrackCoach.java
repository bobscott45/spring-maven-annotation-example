package dev.robertscott.springmavenannotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    private ReportingService reportingService;

    @Autowired
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
