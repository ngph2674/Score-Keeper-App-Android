package com.example.android.scorekeepermartialarts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.scorekeepermartialarts.R.id.person_a_score;
import static com.example.android.scorekeepermartialarts.R.id.person_b_score;

public class Taekwondo extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;
    Button btt1A, btt2A, btt3A, btt4A, btt5A;
    Button btt1B, btt2B, btt3B, btt4B, btt5B, btt6;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taekwondo);

        btt1A = findViewById(R.id.basicA);
        btt1A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 1;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt1B = findViewById(R.id.basicB);
        btt1B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 1;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt2A = findViewById(R.id.spinningA);
        btt2A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 2;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt2B = findViewById(R.id.spinningB);
        btt2B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 2;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt3A = findViewById(R.id.headA);
        btt3A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 3;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt3B = findViewById(R.id.headB);
        btt3B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 3;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt4A = findViewById(R.id.penaltyA);
        btt4A.setOnClickListener(v -> {
            totalScoreA = totalScoreA - 1;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt4B = findViewById(R.id.penaltyB);
        btt4B.setOnClickListener(v -> {
            totalScoreB = totalScoreB - 1;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt5A = findViewById(R.id.knockOutA);
        btt5A.setOnClickListener(v -> {
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(R.string.win1);
        });

        btt5B = findViewById(R.id.knockOutB);
        btt5B.setOnClickListener(v -> {
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(R.string.win);
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