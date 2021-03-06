package com.company.data;
import java.time.LocalDate;

public class Dog {

    private Integer id;
    private String pedigreeName;
    private String petName;
    private String breed;
    private LocalDate dateOfBirth;
    private String microchip;
    private Double time;
    private String disq;
    private Double fullPenalties;
    private Double timePenalties;
    private Integer numberOfMistakes;
    private Integer refusals;

    public Dog() {
    }

    public Dog(Integer id, String pedigreeName, String petName, String breed, LocalDate dateOfBirth,
               String microchip, Double time, String disq,
               Double fullPenalties, Double timePenalties, Integer penalties, Integer refusals) {
        this.id = id;
        this.pedigreeName = pedigreeName;
        this.petName = petName;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.microchip = microchip;
        this.time = time;
        this.disq = disq;
        this.fullPenalties = fullPenalties;
        this.timePenalties = timePenalties;
        this.numberOfMistakes = penalties;
        this.refusals = refusals;
    }

    public Dog(String petName, Double time, String disq, Integer penalties, Integer refusals) {
        this.petName = petName;
        this.time = time;
        this.disq = disq;
        this.numberOfMistakes = penalties;
        this.refusals = refusals;
    }

    public Dog(Integer id, String petName) {
        this.id = id;
        this.petName = petName;
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

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getDisq() {
        return disq;
    }

    public void setDisq(String disq) {
        this.disq = disq;
    }

    public Double getFullPenalties() {
        return fullPenalties;
    }

    public void setFullPenalties(Double fullPenalties) {
        this.fullPenalties = fullPenalties;
    }

    public Double getTimePenalties() {
        return timePenalties;
    }

    public void setTimePenalties(Double timePenalties) {
        this.timePenalties = timePenalties;
    }

    public Integer getNumberOfMistakes() {
        return numberOfMistakes;
    }

    public void setNumberOfMistakes(Integer numberOfMistakes) {
        this.numberOfMistakes = numberOfMistakes;
    }

    public Integer getRefusals() {
        return refusals;
    }

    public void setRefusals(Integer refusals) {
        this.refusals = refusals;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + petName + '\'' +
                ", time=" + time +
                ", refusals=" + refusals +
                '}';
    }
}
