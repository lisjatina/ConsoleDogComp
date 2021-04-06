package com.company.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetitionManager {

    private Course course;
    private Course_A3 courseA3;


    public void startCompetition(){
    var standardTime = course.calculateStandardTime();
    var maxTime = course.calculateMaxTime();
    }

    public void startA3(){courseA3.calculateStandardTime();
    }

    public List <Participant> getParticipants(){
     // return list of participants (participants DTO?) with Hibernate connection
        return new ArrayList<>();
    }
}
