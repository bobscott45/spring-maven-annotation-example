package dev.robertscott.springmavenannotationexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach myCoach = context.getBean("baseballCoach", BaseballCoach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getReportingService().getReport());

        context.close();
    }
}
