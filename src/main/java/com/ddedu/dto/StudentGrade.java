package com.ddedu.dto;

public class StudentGrade {
    private String grade;
    private Integer count;

    public StudentGrade() {
    }

    public StudentGrade(String grade, Integer count) {
        this.grade = grade;
        this.count = count;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                  "grade='" + grade + '\'' +
                  ", count=" + count +
                  '}';
    }
}
