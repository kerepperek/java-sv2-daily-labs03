package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> studentsName=new ArrayList<>();

    public static void main(String[] args) {
        Journal journal=new Journal();
        System.out.println(journal.addStudent("Kerep Perek"));
        System.out.println(journal.addStudent("Saca"));
    }

    public boolean addStudent(String studentName){
        studentName=studentName.trim();
        if(!studentName.contains(" ")) return false;
        studentsName.add(studentName);
        return true;
    }
}
