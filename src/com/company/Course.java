package com.company;

public class Course {
    String result;
    private int course1;
    private int course2;
    private int course3;


    public Course (int course1, int course2, int course3) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public String doIt(Team team){
        result = "Team name: "+ team.getName()+ " " + '\n';
        for(Person person: team.getPeoples()){
            result += "Person name: " + person.getName()+ " " + '\n';
            int value = person.getCanJump();
            testCourse1(value)
                    .testCourse2(value)
                    .testCourse3(value);

        }

        return result;
    }

    private Course testCourse1 (int value){
        if(value<course1) result += "Сourse 1 passed: "+ '\n';
        return this;
    }

    private Course testCourse2(int value){
        if(value<course2 + 50) result += "Сourse 2 passed: "+ '\n';
        return this;
    }

    private Course testCourse3(int value){
        if(value<course3 - 100) result += "Сourse 3 passed:  "+ '\n';
        return this;
    }
}
