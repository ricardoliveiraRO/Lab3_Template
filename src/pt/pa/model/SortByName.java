package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements GradeSorting, Comparator<StudentGrade> {
    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortByName());
    }

    @Override
    public int compare(StudentGrade s1, StudentGrade s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
