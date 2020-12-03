package com.example.android.scorekeepermartialarts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.scorekeepermartialarts.R.id.person_a_score;
import static com.example.android.scorekeepermartialarts.R.id.person_b_score;

public class Karate extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;
    Button btt1A, btt2A, btt3A, btt4A;
    Button btt1B, btt2B, btt3B, btt4B, btt5;

    @SuppressLint({"ResourceType", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karate);

        btt1A = findViewById(R.id.ipponA);
        btt1A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 3;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt1B = findViewById(R.id.ipponB);
        btt1B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 3;
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(String.valueOf(totalScoreB));
        });

        btt2A = findViewById(R.id.wazaariA);
        btt2A.setOnClickListener(v -> {
            totalScoreA = totalScoreA + 2;
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(String.valueOf(totalScoreA));
        });

        btt2B = findViewById(R.id.wazaariB);
        btt2B.setOnClickListener(v -> {
            totalScoreB = totalScoreB + 2;
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

        btt4A = findViewById(R.id.knockOutA);
        btt4A.setOnClickListener(v -> {
            TextView scoreView = findViewById(person_a_score);
            scoreView.setText(R.string.win);
        });

        btt4B = findViewById(R.id.knockOutB);
        btt4B.setOnClickListener(v -> {
            TextView scoreView = findViewById(person_b_score);
            scoreView.setText(R.string.win1);
        });

        btt5 = findViewById(R.id.resetBoth);
        btt5.setOnClickListener(v -> {
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