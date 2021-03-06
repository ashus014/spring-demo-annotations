package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> Tennis Coach : inside doMyStartupStuff");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> Tennis Coach : inside doMyCleanupStuff");
    }


    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */

    //creating a default constructor just for logging purpose
    public TennisCoach() {
        System.out.println(">> TennisCoach : Inside default constructor");
    }

    //define a setter method
    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach : Inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }
    */


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
