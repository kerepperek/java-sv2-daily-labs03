package day01;


import java.util.ArrayList;
import java.util.List;

public class School {

    public static void main(String[] args) {
       Students students =new Students();
       students.addHeight(170);
       students.addHeight(175);
       students.addHeight(180);

       System.out.println(students.isHeightsIncreasing());
    }



}