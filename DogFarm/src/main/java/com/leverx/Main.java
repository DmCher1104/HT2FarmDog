package com.leverx;


import com.leverx.crud.CreateCollectrions;
import com.leverx.entity.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Here we are creating our collections for Dogs, Aviaries and so on
         */
        List<Dog> dogList = CreateCollectrions.createDogList();
        List<Volunteer> volunteerList = CreateCollectrions.createVolunteerList();
        List<Veterinarian> veterinarianList = CreateCollectrions.createVeterinarianList();
        List<DogTrainingArea> dogTrainingAreaList = CreateCollectrions.createDogTrainingArea( dogList);
        List<DogAviary> dogAviarieList = CreateCollectrions.createDogAviary(dogList);


        /**
         * Here we are modeling a typical day at the "FarmDod"
         */
        System.out.println("**********************");
        System.out.println("First step");
        ActionsForTheDay.feedingDog(dogList,volunteerList);
        System.out.println("---------------------");
        System.out.println("Second step");
        ActionsForTheDay.healingDog(dogList,veterinarianList);
        System.out.println("---------------------");
        System.out.println("Third step");
        ActionsForTheDay.cleaningDogTrainingArea(dogAviarieList, volunteerList);
        System.out.println("---------------------");
        System.out.println("Fourth step");
        ActionsForTheDay.workingTimeForDog(dogList,volunteerList, dogTrainingAreaList);
        System.out.println("---------------------");
        System.out.println("Fifth step");
        ActionsForTheDay.feedingDog(dogList,volunteerList);
        System.out.println("**********************");


    }
}
