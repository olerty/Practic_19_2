package com.company.z2;

import java.util.Comparator;

public class StudentComparatorMarks implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getMarks() > o2.getMarks())
            return -1;
        else if (o1.getMarks() < o2.getMarks())
            return 1;
        else
            return 0;
    }
}
