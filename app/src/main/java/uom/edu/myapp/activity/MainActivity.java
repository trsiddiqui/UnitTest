package uom.edu.myapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uom.edu.myapp.R;
import uom.edu.myapp.controller.StudentCGPA;
import uom.edu.myapp.controller.StudentCGPAImpl;
import uom.edu.myapp.dao.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentCGPA db = new StudentCGPAImpl();
        db.getStudentCGPA(778899, this);
    }
}
