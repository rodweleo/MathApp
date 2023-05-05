package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.Serializable;
import java.util.ArrayList;

import dev.rodweleo.app.model.Student;

public class StudentLoginActivity extends AppCompatActivity  {

    EditText username, password;
    Button student_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        student_login = findViewById(R.id.student_login);
        student_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentLogin();
            }
        });

    }

    private void StudentLogin(){
        //getting the entered login details
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        String uname = username.getText().toString();
        String pass = password.getText().toString();

        //get the details from the database.
        SQLiteOpenHelper mathappdatabasehelper = new MathAppDatabaseHelper(this);
        try {
            SQLiteDatabase mathDB = mathappdatabasehelper.getReadableDatabase();

            //using a cursor to read the details of the database
            String sql = "SELECT * FROM TStudent WHERE username = '"+uname+"'AND password = '"+pass+"'";
            Cursor cursor = mathDB.rawQuery(sql, null);
            if(cursor.moveToFirst())
            {
                Student student = new Student(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
                Intent i = new Intent(this, StudentDashboard.class);
                i.putExtra("student", student);
                startActivity(i);
                finish();
            }
            else {
                Toast toast = Toast.makeText(this, "Incorrect login details", Toast.LENGTH_SHORT);
                toast.show();
            }

        }catch (SQLException e){
            String errorMessage = e.getMessage();
            Toast toast = Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT);
            toast.show();
        }



    }
}