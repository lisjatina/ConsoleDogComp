package com.company.data;


import java.time.LocalDate;

public class Dog {

    private Integer id;
    private String pedigreeName;
    private String petName;
    private String breed;
    private LocalDate dateOfBirth;
    private String microchip;
    private String size;
    private String level;
    private Double time;

    public Dog() {
    }

    public Dog(Integer id, String pedigreeName, String petName, String breed,
               LocalDate dateOfBirth, String microchip, String size, String level, Double time) {
        this.id = id;
        this.pedigreeName = pedigreeName;
        this.petName = petName;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.microchip = microchip;
        this.size = size;
        this.level = level;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPedigreeName() {
        return pedigreeName;
    }

    public void setPedigreeName(String pedigreeName) {
        this.pedigreeName = pedigreeName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }
}
