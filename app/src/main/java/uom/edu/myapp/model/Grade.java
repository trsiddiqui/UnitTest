package uom.edu.myapp.model;

/**
 * Created by Moein on 2/11/2016.
 */
public class Grade {
    private int codeCourse;
    private double grade;

    public Grade(double grade, int codeCourse) {
        this.grade = grade;
        this.codeCourse = codeCourse;
    }

    public Grade(){

    }

    public int getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(int codeCourse) {
        this.codeCourse = codeCourse;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
