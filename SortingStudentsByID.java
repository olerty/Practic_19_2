package com.company.z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByID {
    public ArrayList<Person> personArrayList = new ArrayList<>();
    SortingStudentsByID(ArrayList<Person> tmp) {
        Scanner scan = new Scanner(System.in);
        this.personArrayList = tmp;
        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });

        System.out.println("Отсортированные по ID:");
        for (Person student: personArrayList){
            System.out.println(student.toString());
        }
    }
}
