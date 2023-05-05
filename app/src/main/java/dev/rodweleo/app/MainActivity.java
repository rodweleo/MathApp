package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    btn_start = findViewById(R.id.btn_start);

    btn_start.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startApplication();
        }
    });
    }

    private void startApplication(){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }

}