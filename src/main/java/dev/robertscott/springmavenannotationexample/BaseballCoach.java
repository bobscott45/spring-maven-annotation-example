package dev.robertscott.springmavenannotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    private ReportingService reportingService;

    @Autowired
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
