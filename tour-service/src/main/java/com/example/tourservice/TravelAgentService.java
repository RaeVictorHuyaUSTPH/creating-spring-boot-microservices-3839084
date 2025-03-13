package com.example.tourservice;

import org.springframework.stereotype.Service;

import com.example.tourservice.utilities.TourRepository;

/*
 * Add @Service
 * this are stereotypes that gives a message to spring that says
 * okay for this service i have this dependency tour repository
 * it will inject the repository (dependency) automatically 
 */
@Service
public class TravelAgentService {
    private  TourRepository tourRepository;

    public TravelAgentService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
    public void displayTours() {
        tourRepository.findAll().stream().forEach(System.out::println);
    }

    public void displayToursBy(Boolean isKidFriendly) {
        tourRepository.findByType(isKidFriendly).stream()
                .forEach(System.out::println);
    }
}
