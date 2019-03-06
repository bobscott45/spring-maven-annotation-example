package dev.robertscott.springmavenexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach myCoach = context.getBean("myCoach", BaseballCoach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getReportingService().getReport());

        context.close();
    }
}
