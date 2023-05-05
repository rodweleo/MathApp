package dev.rodweleo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class TestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView answered_questions = findViewById(R.id.answered_questions);

        Button btn_next_question = findViewById(R.id.btn_next);
        btn_next_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickIncreaseQuestions();
            }
        });

    }

    public void onClickIncreaseQuestions() {
        int count = 15;
        TextView answered_questions = findViewById(R.id.answered_questions);
        //display the updated count
        answered_questions.setText(count);
    }
}