package com.company.z2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> personArrayList = new ArrayList<>();
        System.out.println("Введите количество студентов:");
        int cnt = scan.nextInt();
        System.out.println("Введите данные студентов:");
        for (int i = 0; i < cnt; i++) {
            personArrayList.add(new Student(scan.next(), scan.nextDouble(), scan.nextInt()));
        }
        SortingStudentsByID test1 = new SortingStudentsByID(personArrayList);
        SortingStudentsByGPA test2 = new SortingStudentsByGPA(personArrayList);
        System.out.println("Введите имя студента, которого надо найти:");
        TestSearch test3 = new TestSearch(personArrayList, scan.next());
    }
}
