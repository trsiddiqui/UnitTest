package uom.edu.stub;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import uom.edu.myapp.controller.CGPACalculator;
import uom.edu.myapp.controller.StudentCGPA;
import uom.edu.myapp.model.Grade;

/**
 * Created by Moein on 2/11/2016.
 */
public class StudentCGPAStub implements StudentCGPA {
    @Override
    public double getStudentCGPA(int id, Context c) {
        CGPACalculator cgpaCalculator = new CGPACalculator();
        List<Grade> grades = new ArrayList<Grade>();
        grades.add(new Grade(100, 3350));
        grades.add(new Grade(90, 4350));
        grades.add(new Grade(95, 5350));
        grades.add(new Grade(87, 6350));
        return cgpaCalculator.calculateCGPA(grades);
    }
}
