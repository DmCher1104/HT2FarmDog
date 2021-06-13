package com.leverx.entity;

import lombok.*;


/**
 * Here I use the lombok instead of setter , getter and so on
 */
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class DogAviary {
    private int idDogAviary;
    private String NameDogAviary;
    private boolean isClean;
    private Dog dog;


}

