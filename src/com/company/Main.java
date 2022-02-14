package com.company;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Lewis Owens", 100);
        person[1] = new Person("Kyle Black", 200);
        person[2] = new Person("Darrell Perez", 300);
        person[3] = new Person("Anthony Castro", 400);
        Team team = new Team ("Untamed", person);
        Course course = new Course (250,350,390);
        String result = course.doIt (team);
        System.out.println(result);
    }
}
