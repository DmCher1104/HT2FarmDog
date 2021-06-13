package com.leverx.entity;

public class Veterinarian extends WorkingStaff{

    private int idVeterinarian;
    private String veterinarianName;

    public Veterinarian(int idVeterinarian, String veterinarianName) {
        this.idVeterinarian = idVeterinarian;
        this.veterinarianName = veterinarianName;
    }

    public Veterinarian() {
    }

    public int getIdVeterinarian() {
        return idVeterinarian;
    }

    public void setIdVeterinarian(int idVeterinarian) {
        this.idVeterinarian = idVeterinarian;
    }

    public String getVeterinarianName() {
        return veterinarianName;
    }

    public void setVeterinarianName(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "idVeterinarian=" + idVeterinarian +
                ", veterinarianName='" + veterinarianName + '\'' +
                '}';
    }
}
