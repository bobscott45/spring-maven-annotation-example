package dev.robertscott.springmavenexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TellerBaseballCoach myCoach = context.getBean("myCoach", TellerBaseballCoach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getFortuneTeller().getFortune());

        context.close();
    }
}
