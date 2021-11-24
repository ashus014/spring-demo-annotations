package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //call out new swim coach methods ... has the props values injected
        System.out.println("Team Name : " + theCoach.getTeam());
        System.out.println("\nEmail address : " + theCoach.getEmail());


        //close the context
        context.close();

    }
}
