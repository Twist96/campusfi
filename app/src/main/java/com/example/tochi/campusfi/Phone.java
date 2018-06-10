package com.example.tochi.campusfi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Phone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
    }

    public void Continue(View view) {
        Intent intent = new Intent(this, Birthday.class);
        startActivity(intent);
    }
}
