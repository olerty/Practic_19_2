package com.company.z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingStudentsByGPA {
    public ArrayList<Person> personArrayList = new ArrayList<>();
    private StudentComparatorMarks comparator = new StudentComparatorMarks();

    SortingStudentsByGPA(ArrayList<Person> tmp) {
        this.personArrayList = tmp;
        Scanner scan = new Scanner(System.in);
        Collections.sort(personArrayList, new StudentComparatorMarks());
        System.out.println("Отсортированные по среднему баллу:");
        out(personArrayList);
    }

    public void out(ArrayList<Person> array) {
        for (Person student:array){
            System.out.println(student.toString());
        }
    }
}
