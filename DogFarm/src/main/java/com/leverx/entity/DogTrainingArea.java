package com.leverx.entity;

import lombok.*;


/**
 * Here I use the lombok instead of setter , getter and so on
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DogTrainingArea {
    private int idDogTrainingArea;
    private String CodeNameDogTrainingArea;
    private Dog dog;

}
