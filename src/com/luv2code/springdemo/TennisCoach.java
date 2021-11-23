package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

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
