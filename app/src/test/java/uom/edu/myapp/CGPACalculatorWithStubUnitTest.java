package uom.edu.myapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import uom.edu.myapp.controller.CGPACalculator;
import uom.edu.myapp.controller.StudentCGPA;
import uom.edu.myapp.model.Grade;
import uom.edu.stub.StudentCGPAStub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Moein on 2/11/2016.
 */
public class CGPACalculatorWithStubUnitTest {

    @Before
    public void setup(){

    }

    @Test
    public void calculateCGPAWithStub_1() throws Exception {
        StudentCGPA studentCGPA = new StudentCGPAStub();
        double cgpa = studentCGPA.getStudentCGPA(778899, null);
        System.out.print(cgpa);
        assertNotNull(cgpa);
        assertEquals(93, cgpa, 0);
    }

    @After
    public void tearDown(){
        
    }
}
