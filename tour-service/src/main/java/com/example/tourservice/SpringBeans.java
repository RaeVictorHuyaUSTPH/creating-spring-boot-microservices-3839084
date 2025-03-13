package com.example.tourservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.tourservice.utilities.TourRepository;
/*
 * This is the configuration for the dependency injection
 */
@Configuration
public class SpringBeans {
 //Set the dependency between the classes
  
 @Bean
  public TourRepository tourRepository() {
    return new TourRepository();
  }
  @Bean
  public TourManagementService tourManagementService() {
    return new TourManagementService(tourRepository());
  }

  @Bean
  public TravelAgentService travelAgentService() {
    return new TravelAgentService(tourRepository());
  } 
}
