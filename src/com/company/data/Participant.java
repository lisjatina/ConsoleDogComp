package com.company.data;


public class Participant {

    private Integer id;
    private String name;
    private String surname;
    private Dog dog;

    public Participant() {
    }

    public Participant(Integer id, String name, String surname, Dog dog) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dog = dog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
