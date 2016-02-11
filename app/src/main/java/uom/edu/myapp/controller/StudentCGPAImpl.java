package uom.edu.myapp.controller;

import android.content.Context;

/**
 * Created by Moein on 2/11/2016.
 */
public class StudentCGPAImpl implements StudentCGPA {

    @Override
    public double getStudentCGPA(int id, Context c) {
       CGPACalculator cgpaCalculator = new CGPACalculator();
        return cgpaCalculator.calculateCGPA(cgpaCalculator.getStudentGrades(id, c));
    }
}
