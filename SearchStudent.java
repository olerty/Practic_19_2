package com.company.z2;

import java.util.ArrayList;

public class SearchStudent {
    public ArrayList<Person> personArrayList = new ArrayList<>();

    public SearchStudent(ArrayList<Person> idNumber) {
        this.personArrayList = idNumber;
    }
    public int linSearch(String name) throws NotFoundException {
        int id = -1;
        for (int i = 0; i < personArrayList.size(); i++) {
            if ((name.equals(personArrayList.get(i).getName()))) {
               id = i;
            }
        }
        if (id == -1) {
            throw new NotFoundException("Данного студента нет в базе", name);
        }
        else {
            return id;
        }
    }
}
