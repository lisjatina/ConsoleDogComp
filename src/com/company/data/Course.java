package com.company.data;


public class Course {

    private Integer length;
    private Double speed;
    private Integer refusal; //если три отказа - disq
    //private Integer mistake; - похоже, что не используем эту переменную
    private String disq;
    //private Participant participant;

    // we need method to get list of participants for current course


   public Double calculateStandardTime() {
        return length / speed;
    }

    // ok - умножить на 2
    public Double calculateMaxTime() {
        return (calculateStandardTime()* 2);
    }

    // ok - метод дисквал за превышение максимального времени
    public Boolean calculateIsDogDisqualifiedForExceedingMaxTime(Double dogTime) {
        if (dogTime> calculateMaxTime()) {
            this.disq = "DISQ";
            return true;
        }
        return false;
    }

    // ok - может иметь отрицательное значение!
    // В случае, если значение меньше нуля, то не учитывается в подсчете штрафов
    // на трассе, иначе общее количество штрафов тоже получим отрицательное.
    public Double calculateTimePenalties(Double dogTime) {
        if (dogTime > calculateMaxTime()) {
            return (dogTime - calculateMaxTime());
        } else {
            return 0d;
        }
    }

     // ok - складываем штраф за время(если больше нуля)
    public Double calculateAllPenalties(Integer numberOfMistakes, Double dogTime) {
        Double mistake = 5.0;
        if (calculateTimePenalties(dogTime) > 0) {
            return numberOfMistakes * mistake + calculateTimePenalties(dogTime);
        } else {
            return numberOfMistakes * mistake;
        }
    }

    // ok - собака снялась за три отказа
    public void disqualifiedForThreeRefusals(Integer refusal) {
        if (refusal == 3) {
           // this.dogTime = null;
            this.disq = "DISQ";
        }
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
       if (calculateIsDogDisqualifiedForExceedingMaxTime(participant.getDog().getTime())){
           return;
       }
        calculateTimePenalties(participant.getDog().getTime());
    }
    //передается список участников, на котором вызывается метод calculate results
    // и возвращает отсортированный список (либо запрос из базы данных)
    public void sortResults(){

    }

    public Course() {
    }

    public Course(Integer length, Double speed, Integer refusal, String disq) {
        this.length = length;
        this.speed = speed;
        this.refusal = refusal;
        this.disq = disq;
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

    public Integer getRefusal() {
        return refusal;
    }

    public void setRefusal(Integer refusal) {
        this.refusal = refusal;
    }

    public String getDisq() {
        return disq;
    }

    public void setDisq(String disq) {
        this.disq = disq;
    }
}
