package uom.edu.myapp.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import uom.edu.myapp.model.Grade;

/**
 * Created by Moein on 2/11/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "StudentDB";

    private static final String TABLE_STUDENTS = "Students";
    private static final String KEY_ID = "courseCode";
    private static final String KEY_TITLE = "grade";
    private static final String KEY_AUTHOR = "id";

    private static final String[] COLUMNS = {KEY_ID,KEY_TITLE,KEY_AUTHOR};

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_STUDENT_TABLE = "CREATE TABLE Students ( " +
                "courseCode NUMERIC PRIMARY KEY, " +
                "grade NUMERIC, "+
                "id NUMERIC )";

        db.execSQL(CREATE_STUDENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS books");
        this.onCreate(db);
    }

    public List<Grade> getStudentGrades(int id) {
        List<Grade> grades= new ArrayList<Grade>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_STUDENTS + " WHERE id=" + id;

        // 2. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        // 3. go over each row, build student grades and add it to list
        Grade grade = null;

        if (cursor.moveToFirst()) {
            do {
                grade = new Grade();
                grade.setCodeCourse(Integer.parseInt(cursor.getString(0)));
                grade.setGrade(Double.valueOf(cursor.getString(1)));

                grades.add(grade);
            } while (cursor.moveToNext());
        }

        // return grades
        return grades;
    }
}
