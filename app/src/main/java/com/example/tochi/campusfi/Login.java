package com.example.tochi.campusfi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    ImageView visibility;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        visibility = findViewById(R.id.visibility);
        password = findViewById(R.id.passwordLogIn);
    }

    public void changeVisibility(View view) {

        if (visibility.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.ic_visibility_black_24dp).getConstantState())){

            visibility.setImageResource(R.drawable.ic_visibility_off_black_24dp);
            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            password.setSelection(password.getText().length());
        }else {

            visibility.setImageResource(R.drawable.ic_visibility_black_24dp);
            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            password.setSelection(password.getText().length());

        }

    }

    public void facebookSignIn(View view) {
        Toast.makeText(this, "Facebook login", Toast.LENGTH_SHORT).show();
    }

    public void googleSignIn(View view) {
        Toast.makeText(this, "Google login", Toast.LENGTH_SHORT).show();
    }

    public void logInBtn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void signUp(View view) {

        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);

    }

    public void forgotPassword(View view) {
    }
}