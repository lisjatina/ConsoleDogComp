package com.company.data;

public class Course {

    private Integer length;
    private Double speed;


   public Double calculateStandardTime() {
        return length / speed;
    }

   public Double calculateMaxTime() {
        return (calculateStandardTime()* 2);
    }

   public Double calculateTimePenalties(Double dogTime) {
        if (dogTime > calculateStandardTime()) {
            return (dogTime - calculateStandardTime());
        } else {
            return 0d;
        }
    }
    public Boolean disqForExceedingTime(Double dogTime) {
        if (dogTime> calculateMaxTime()) {
           return true;
        }
        return false;
    }

    public Double calculateTotalPenalties(Integer numberOfMistakes, Double dogTime) {
        Double mistake = 5.0;
        if (calculateTimePenalties(dogTime) > 0) {
            return numberOfMistakes * mistake + calculateTimePenalties(dogTime);
        } else {
            return numberOfMistakes * mistake;
        }
    }


    public boolean disqForThreeRefusals(Integer refusal) {
        if (refusal >= 3) {
          return true;
        }
        return false;
    }

    // ok - если собака снялась, убежав куда не надо
//    public void disqualified() {
//        if (getDogTime() == 500) {
//            //this.dogTime = null;
//            this.disq = "DISQ";
////        }
//    }

    //либо возвращает отсортированный список участников
    public void calculateResult(Participant participant){
    if (disqForExceedingTime(participant.getDog().getTime()) || disqForThreeRefusals(participant.getDog().getRefusals())){
        participant.getDog().setTime(500.0);
        System.out.println("Dog dot disq");
       }
     else {
        System.out.println(calculateTotalPenalties(participant.getDog().getPenalties(), participant.getDog().getTime()));
    }
    }
    //передается список участников, на котором вызывается метод calculate results
    // и возвращает отсортированный список (либо запрос из базы данных)
    public void sortResults(){

    }

    public Course(Integer length, Double speed) {
        this.length = length;
        this.speed = speed;
    }
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Course(){

    }
}
