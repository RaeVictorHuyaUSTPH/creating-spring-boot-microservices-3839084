package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.tourservice.SpringBeans;
import com.example.tourservice.TravelAgentService;

public class Application {

    public static void main(String[] args) {
        //Instantiate an application context and pass the SpringBeans.class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeans.class);
        /*
         * From that context getBean and get the TravelAgentService class
         * it'll have within the springboot container that object
         */ 
        TravelAgentService agent = context.getBean(TravelAgentService.class);
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}