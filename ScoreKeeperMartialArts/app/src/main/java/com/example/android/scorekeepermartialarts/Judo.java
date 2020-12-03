package com.example.android.scorekeepermartialarts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.scorekeepermartialarts.R.id.person_a_score;
import static com.example.android.scorekeepermartialarts.R.id.person_b_score;

public class Judo extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;
    Button btt1A, btt2A, btt3A, btt4A, btt5A;
    Button btt1B, btt2B, btt3B, btt4B, btt5B, btt6;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judo);

        btt1A = findViewById(R.id.ipponA);
        btt1A.setOnClickListener(v -> {
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(R.string.win1);
        });

        btt1B = findViewById(R.id.ipponB);
        btt1B.setOnClickListener(v -> {
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(R.string.win);
        });

        btt2A = findViewById(R.id.wazaariA);
        btt2A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 10;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt2B = findViewById(R.id.wazaariB);
        btt2B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 10;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt3A = findViewById(R.id.yukoA);
        btt3A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 1;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt3B = findViewById(R.id.yukoB);
        btt3B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 1;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt4A = findViewById(R.id.hansokuA);
        btt4A.setOnClickListener(v -> {
            totalScoreA = totalScoreA - 100;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt4B = findViewById(R.id.hansokuB);
        btt4B.setOnClickListener(v -> {
            totalScoreB = totalScoreB - 100;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt5A = findViewById(R.id.shidoA);
        btt5A.setOnClickListener(v -> {
            totalScoreA = totalScoreA - 30;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt5B = findViewById(R.id.shidoB);
        btt5B.setOnClickListener(v -> {
            totalScoreB = totalScoreB - 30;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt6 = findViewById(R.id.resetBoth);
        btt6.setOnClickListener(v -> {
            int resetScore = 0;
            totalScoreA = resetScore;
            totalScoreB = resetScore;
            TextView scoreView1 = findViewById(person_a_score);
            scoreView1.setText(String.valueOf(totalScoreA));
            TextView scoreView2 = findViewById(person_b_score);
            scoreView2.setText(String.valueOf(totalScoreB));
        });

    }
}