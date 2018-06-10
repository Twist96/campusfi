package com.example.tochi.campusfi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void facebookSignUp(View view) {

        Toast.makeText(this, "Facebook sign up", Toast.LENGTH_SHORT).show();

    }

    public void googleSignUp(View view) {

        Toast.makeText(this, "Google signUp", Toast.LENGTH_SHORT).show();

    }

    public void signUpBtn(View view) {
        Intent intent = new Intent(this, Email.class);
        startActivity(intent);
    }

    public void Login(View view) {
        finish();
    }
}
