package com.ddedu.vo;

import java.util.List;

public class StudentEcharts {
    private List<String> grades;
    private List<Integer> counts ;

    public StudentEcharts() {
    }

    public StudentEcharts(List<String> grades, List<Integer> counts) {
        this.grades = grades;
        this.counts = counts;
    }

    public List<String> getGrades() {
        return grades;
    }

    public void setGrades(List<String> grades) {
        this.grades = grades;
    }

    public List<Integer> getCounts() {
        return counts;
    }

    public void setCounts(List<Integer> counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "StudentEcharts{" +
                  "grades=" + grades +
                  ", counts=" + counts +
                  '}';
    }
}
