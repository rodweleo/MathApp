package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

import dev.rodweleo.app.model.Student;

public class StudentDashboard extends AppCompatActivity {

    TextView active_student;
    FloatingActionButton fab_start_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);


        Student student = getLoggedStudent();
        //display the details on the student dashboard activity
        active_student = findViewById(R.id.active_student);
        active_student.setText(student.getUsername());

        //starting the test
        fab_start_test = findViewById(R.id.fab_start_test);
        fab_start_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickStartTest();
            }
        });

    }

    private Student getLoggedStudent(){
        //get the logged in student
        Intent i = getIntent();
        Student student =  (Student) i.getSerializableExtra("student");

        return student;
    }

    private void onClickStartTest() {
        Intent i = new Intent(this, TestActivity.class);
        Student student = getLoggedStudent();
        i.putExtra("student", student);
        startActivity(i);
    }
}