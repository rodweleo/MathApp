package dev.rodweleo.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import dev.rodweleo.app.model.Parent;
import dev.rodweleo.app.model.Question;
import dev.rodweleo.app.model.Student;

public class MathAppDatabaseHelper extends SQLiteOpenHelper {

    private static final String db_name = "mathapp";
    private static final int db_version = 1;


    public MathAppDatabaseHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //creating the students table
        db.execSQL("CREATE TABLE TStudent(id INTEGER, username TEXT NOT NULL UNIQUE, password TEXT NOT NULL)");
        //get the students and add them to the database
        for (int i = 0; i < Student.students.length; i++) {
            Student student = Student.students[i];
            //insert the data into the database
            addStudent(db, student);
        }

        //creating the parents table
        db.execSQL("CREATE TABLE TParent(id INTEGER, username TEXT NOT NULL UNIQUE, password TEXT NOT NULL)");
        //get the parents and add them to the database
        for (int i = 0; i < Parent.parents.length; i++) {
            Parent parent = Parent.parents[i];
            //inserting the parent into the database
            addParent(db, parent);
        }

        //creating the tests table
        db.execSQL("CREATE TABLE TTest(id INTEGER, studentID INTEGER NOT NULL, score INTEGER NOT NULL DEFAULT 0, date TEXT NOT NULL)");
        //getting the tests and saving them to the database


        //creating the tests table
        db.execSQL("CREATE TABLE TQuestion(id INTEGER, QuestionText TEXT NOT NULL)");
        //inserting the questions to the databases
        //get the parents and add them to the database
        /*for (int i = 0; i < Question.questions.length; i++) {
            Question question = Question.questions[i];
            //inserting the parent into the database
            addQuestion(db, question);
        }*/



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addStudent(SQLiteDatabase db, Student student){
        ContentValues studentValues = new ContentValues();
        studentValues.put("username", student.getUsername());
        studentValues.put("password", student.getPassword());

        //adding the student details into the database
        db.insert("TStudent", null, studentValues);

    }

    public void addParent(SQLiteDatabase db, Parent parent){
        ContentValues parentValues = new ContentValues();
        parentValues.put("username", parent.getUsername());
        parentValues.put("password", parent.getPassword());

        //adding the student details into the database
        db.insert("TParent", null, parentValues);
    }

    public void addQuestion(SQLiteDatabase db, Question question)
    {
        ContentValues questionValues = new ContentValues();
        questionValues.put("questionText", question.getQuestionText());

        //adding the question details into the database
        db.insert("TQuestion", null, questionValues);
    }

}
