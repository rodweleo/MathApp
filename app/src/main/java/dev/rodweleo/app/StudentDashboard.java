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
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class StudentDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        SQLiteOpenHelper mathappDatabaseHelper = new MathAppDatabaseHelper(this);
        try{
        SQLiteDatabase db = mathappDatabaseHelper.getReadableDatabase();}
        catch (SQLException e)
        {
            Toast t = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_SHORT);
            t.show();
        }


    }


    public void onClickStartTest(View view) {
        Intent i = new Intent(this, TestActivity.class);
        startActivity(i);
    }
}