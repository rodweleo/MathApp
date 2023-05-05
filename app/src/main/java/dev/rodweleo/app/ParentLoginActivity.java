package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentLoginActivity extends AppCompatActivity {

    Button parent_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_parent);

        parent_login = findViewById(R.id.parent_login);
        parent_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParentLogin();
            }
        });
    }

    private void ParentLogin(){
        Intent i = new Intent(this, ParentDashboard.class);
        startActivity(i);;
        finish();
    }


}