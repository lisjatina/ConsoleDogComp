package com.company;

import com.company.data.Course;
import com.company.data.Dog;
import com.company.data.Participant;

public class Main {

    public static void main(String[] args) {
        Course course = new Course(200, 5.0);
        var participant = new Participant(0,"Lidia", "Belyaeva", new Dog("Varja",30.12, "", 0, 0));
        var participant1 = new Participant(0,"Lidia", "Belyaeva", new Dog("Varja",30.12, "disq", 0, 0));
        var participant2 = new Participant(0,"Lidia", "Belyaeva", new Dog("Varja",80.12, "", 0, 0));
        var participant3 = new Participant(0,"Lidia", "Belyaeva", new Dog("Varja",30.12, "", 0, 3));
        System.out.println(course.calculateStandardTime());
        System.out.println(course.calculateMaxTime());
        course.calculateResult(participant);
        course.calculateResult(participant1);
        course.calculateResult(participant2);
        course.calculateResult(participant3);
    }
}
