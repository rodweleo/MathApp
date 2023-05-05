package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btn_parent_login , btn_student_login;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_parent_login = findViewById(R.id.btn_parent_login);
        btn_parent_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParentLogin();
            }
        });

        btn_student_login = findViewById(R.id.btn_student_login);
        btn_student_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentLogin();
            }
        });



    }

    private void ParentLogin(){
        Intent i = new Intent(this, ParentLoginActivity.class);
        startActivity(i);
        finish();
    }

    private void StudentLogin(){
        Intent i = new Intent(this, StudentLoginActivity.class);
        startActivity(i);
        finish();
    }
}