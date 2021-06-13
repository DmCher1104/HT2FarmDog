package com.leverx;

import com.leverx.entity.*;

import java.util.List;


/**
 *  We have all actions that must be done by dogs and working staff right here
 */
public class ActionsForTheDay {


    public static void feedingDog(List<Dog> dogList, List<Volunteer> volunteerList) {
        for (int i = 0; i < dogList.size(); i++) {
            switch (dogList.get(i).getAge()) {
                case YOUNG:
                    System.out.println(volunteerList.get(0).getVolunteerName() + " is feeding an young dog under the number "
                            + dogList.get(i).getIdDog());
                    break;
                case ADULT:
                    System.out.println(volunteerList.get(1).getVolunteerName() + " is feeding an adult dog under the number "
                            + dogList.get(i).getIdDog());
                    break;
                case OLD:
                    System.out.println(volunteerList.get(0).getVolunteerName() + " is feeding an old dog under the number "
                            + dogList.get(i).getIdDog());
            }

        }

    }

    public static void healingDog(List<Dog> dogList, List<Veterinarian> veterinarianList) {
        System.out.println("Checking of the dogs for illness by " + veterinarianList.get(0).getVeterinarianName());
        for (int i = 0; i < dogList.size(); i++) {
            if (dogList.get(i).isHealthy() == false) {
                dogList.get(i).setHealthy(true);
                System.out.println("Dog under the number " + dogList.get(i).getIdDog() + " was healed");
            }

        }
        System.out.println("Report: All dogs are OK");

    }


    public static void workingTimeForDog(List<Dog> dogList, List<com.leverx.entity.Volunteer> volunteerList, List<DogTrainingArea> dogTrainingAreaList) {
        for (int i = 0; i < dogList.size(); i++) {
            switch (dogList.get(i).getAge()) {
                case YOUNG:
                    System.out.println("Dog under the number " + dogList.get(i).getIdDog() + " is working on "
                            + dogList.get(i).getDogJob() + " at the training area " + dogTrainingAreaList.get(i).getCodeNameDogTrainingArea());
                    break;
                case ADULT:
                    System.out.println("Dog under the number " + dogList.get(i).getIdDog() + " is working on " + dogList.get(i).getDogJob());
                    break;
                case OLD:
                    System.out.println("Dog under the number " + dogList.get(i).getIdDog() + " is " + dogList.get(i).getDogJob());
                    break;
            }

        }
    }

    public static void cleaningDogTrainingArea(List<DogAviary> dogAviarieList, List<Volunteer> volunteerList) {

        for (int i = 0; i < dogAviarieList.size(); i++) {

            if (dogAviarieList.get(i).isClean() == false) {
                dogAviarieList.get(i).setClean(true);
                System.out.println("Aviary " + dogAviarieList.get(i).getNameDogAviary() + " was cleaned by " + volunteerList.get(1).getVolunteerName());
            }

        }
        System.out.println("Report: All aviary are clean");
    }
}
