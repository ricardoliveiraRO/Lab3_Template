package pt.pa.model;

import java.util.List;

public class AverageStatistic implements Statistic{

    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty()) return -1;

        int sum = 0;
        for (StudentGrade grade : grades) {
            sum += grade.getGrade();
        }

        return (sum * 1.0) / grades.size();
    }
}
