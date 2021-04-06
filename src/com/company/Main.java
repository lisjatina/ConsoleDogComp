package com.company;

import com.company.data.Course;
import com.company.data.Dog;
import com.company.data.Participant;

public class Main {

    public static void main(String[] args) {
        Course course = new Course(200, 5.0);
        var participant = new Participant(0,"Lidia", "Belyaeva", new Dog("Varja",43.19,4,0));
        var participant1 = new Participant(0,"Lidia", "Belyaeva", new Dog("Varja",43.19,4,3));
        System.out.println(course.calculateStandardTime());
        System.out.println(course.calculateMaxTime());
        System.out.println(course);
        course.calculateResult(participant);
        course.calculateResult(participant1);

    }
}
