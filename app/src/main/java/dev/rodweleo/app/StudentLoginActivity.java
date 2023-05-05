package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentLoginActivity extends AppCompatActivity {

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
        Intent i = new Intent(this, StudentDashboard.class);
        startActivity(i);
        finish();
    }
}