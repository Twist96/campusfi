package com.example.tochi.campusfi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
    }

    public void Continue(View view) {

        Intent intent = new Intent(this, Password.class);
        startActivity(intent);

    }
}
