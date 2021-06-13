package com.leverx.crud;

import com.leverx.entity.*;

import java.util.ArrayList;
import java.util.List;

public class CreateCollectrions {


    public static List<Dog> createDogList() {
        List<Dog> dogList = new ArrayList<>();

        dogList.add(new Dog(1, DogAge.ADULT, false, false, DogJob.EMERGENCY));
        dogList.add(new Dog(2, DogAge.YOUNG, true, false, DogJob.TRAINING));
        dogList.add(new Dog(3, DogAge.ADULT, true, false, DogJob.POLICE));
        dogList.add(new Dog(4, DogAge.OLD, false, false, DogJob.PENSION));


        return dogList;

    }

    public static List<Volunteer> createVolunteerList() {
        List<Volunteer> volunteerList = new ArrayList<>();

        volunteerList.add(new Volunteer(1, "Dima"));
        volunteerList.add(new Volunteer(2, "Slava"));

        return volunteerList;

    }

    public static List<Veterinarian> createVeterinarianList() {
        List<Veterinarian> veterinarianList = new ArrayList<>();

        veterinarianList.add(new Veterinarian(1, "Egor"));

        return veterinarianList;

    }

    public static List<DogTrainingArea> createDogTrainingArea(List<Dog> dogList) {
        List<DogTrainingArea> dogTrainingArea = new ArrayList<>();


        dogTrainingArea.add(new DogTrainingArea(1, "South", dogList.get(1)));
        dogTrainingArea.add(new DogTrainingArea(2, "West", null));
        dogTrainingArea.add(new DogTrainingArea(3, "North", null));
        dogTrainingArea.add(new DogTrainingArea(4, "East", null));

        return dogTrainingArea;

    }

    public static List<DogAviary> createDogAviary(List<Dog> dogList) {
        List<DogAviary> dogAviarie = new ArrayList<>();

        dogAviarie.add(new DogAviary(1, "A1", false, dogList.get(1)));
        dogAviarie.add(new DogAviary(2, "B1", false, dogList.get(2)));
        dogAviarie.add(new DogAviary(3, "C1", true, dogList.get(0)));
        dogAviarie.add(new DogAviary(4, "D1", true, dogList.get(3)));

        return dogAviarie;

    }

}
