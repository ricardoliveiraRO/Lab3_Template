package pt.pa.model;

import java.util.List;

public class LowestStatistic implements Statistic{

    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty()) return -1;

        int lowest = grades.get(0).getGrade();
        for (int i = 1; i < grades.size(); i++) {
            if(grades.get(i).getGrade() < lowest)
                lowest = grades.get(i).getGrade();
        }

        return lowest;
    }
}
