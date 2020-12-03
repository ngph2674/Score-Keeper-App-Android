package com.example.android.scorekeepermartialarts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.artsmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.judo){
            Intent intent = new Intent(MainActivity.this,Judo.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.karate){
            Intent intent = new Intent(MainActivity.this,Karate.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.taekwondo){
            Intent intent = new Intent(MainActivity.this,Taekwondo.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}