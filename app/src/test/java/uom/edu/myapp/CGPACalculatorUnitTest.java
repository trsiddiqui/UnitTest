package uom.edu.myapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import uom.edu.myapp.controller.CGPACalculator;
import uom.edu.myapp.model.Grade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Moein on 2/11/2016.
 */
public class CGPACalculatorUnitTest {

    List<Grade> grades = new ArrayList<Grade>();

    @Before
    public void setup(){
        grades.add(new Grade(100, 3350));
        grades.add(new Grade(90, 4350));
        grades.add(new Grade(95, 5350));
        grades.add(new Grade(87, 6350));
    }

    @Test
    public void calculateCGPA_1() throws Exception {
        CGPACalculator cgpaCalculator = new CGPACalculator();
        double cgpa = cgpaCalculator.calculateCGPA(grades);
        System.out.print(cgpa);
        assertNotNull(cgpa);
        assertEquals(93, cgpa, 0);
    }

    @After
    public void tearDown(){

    }
}
