package uom.edu.myapp.model;

import java.util.List;

/**
 * Created by Moein on 2/11/2016.
 */
public class Student {
    private int id;
    private double cgpa;
    private List<Grade> grades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
