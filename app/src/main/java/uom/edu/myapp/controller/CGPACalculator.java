package uom.edu.myapp.controller;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import uom.edu.myapp.dao.DBHelper;
import uom.edu.myapp.model.Grade;

/**
 * Created by Moein on 2/11/2016.
 */
public class CGPACalculator {

    public double calculateCGPA(List<Grade> grades){
        double sum = 0.0;

        for (Grade grade : grades){
            sum = sum + grade.getGrade();
        }

        //Dummy buggy code
        // sum = 0;

        return sum / grades.size();
    }

    public List<Grade> getStudentGrades(int id, Context c){
        List<Grade> grades = new ArrayList<Grade>();
        DBHelper db = new DBHelper(c);
        grades = db.getStudentGrades(id);
        return  grades;
    }
}
