package com.leverx.entity;

public class Dog {

    private int idDog;
    private DogAge age;
    private boolean isHealthy;
    private boolean isHungry;
    private DogJob dogJob;

    public Dog() {
    }

    public Dog(int idDog, DogAge age, boolean isHealthy, boolean isHungry, DogJob job) {
        this.idDog = idDog;
        this.age = age;
        this.isHealthy = isHealthy;
        this.isHungry = isHungry;
        this.dogJob = job;
    }

    public int getIdDog() {
        return idDog;
    }

    public void setIdDog(int idDog) {
        this.idDog = idDog;
    }

    public DogAge getAge() {
        return age;
    }

    public void setAge(DogAge age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }


    public DogJob getDogJob() {
        return dogJob;
    }

    public void setDogJob(DogJob dogJob) {
        this.dogJob = dogJob;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "idDog=" + idDog +
                ", age=" + age +
                ", isHealthy=" + isHealthy +
                ", isHungry=" + isHungry +
                ", job=" + dogJob +
                '}';
    }
}
