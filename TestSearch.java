package com.company.z2;

import java.util.*;

public class TestSearch {
    public ArrayList<Person> idNumber = new ArrayList<>();
    TestSearch() { };
    TestSearch(ArrayList<Person> tmp, String name) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        this.idNumber = tmp;
        SearchStudent s1 = new SearchStudent(idNumber);
        System.out.println("Искомый студент: " + name);
        int id1 = 0;
        try {
            id1 = s1.linSearch(name);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("ID искомого студента в коллекции: " + id1);
        System.out.println(idNumber.get(id1).toString());
    }
}
