package com.leverx.entity;

public class Volunteer extends WorkingStaff {


    private int idVolunteer;
    private String volunteerName;

    public Volunteer() {
    }

    public Volunteer(int idVolunteer, String volunteerName) {
        this.idVolunteer = idVolunteer;
        this.volunteerName = volunteerName;
    }

    public int getIdVolunteer() {
        return idVolunteer;
    }

    public void setIdVolunteer(int idVolunteer) {
        this.idVolunteer = idVolunteer;
    }


    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "idVolunteer=" + idVolunteer +
                ", volunteerName='" + volunteerName + '\'' +
                '}';
    }
}
