package com.company.data;



public class Course_A3 extends Course {
    //private List <Participant> participants = new ArrayList<>();

    @Override
// ok - умножить на 1,5
    public Double calculateMaxTime() {
        return ((getLength() / getSpeed()) * 1.5);
    }

    //время CACIAg - время самой быстрой собаки в ростовой категории *15% -
    // Ox. comment - тут, как я понимаю, надо идти по ArrayList результатов,
    // и искать minDogTime. Но где у нас ArrayList результатов?

}