package com.example.tochi.campusfi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
    }

    public void changeVisibility1(View view) {
        ImageView eye = findViewById(R.id.visibility1);
        EditText password = findViewById(R.id.password1);

        transformer(eye, password);

    }

    public void changeVisibility2(View view) {
        ImageView eye2 = findViewById(R.id.visibility2);
        EditText password2 = findViewById(R.id.password2);

        transformer(eye2, password2);
    }


    public void transformer(ImageView eye, EditText password){

        if (eye.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.ic_visibility_black_24dp).getConstantState())){
            eye.setImageResource(R.drawable.ic_visibility_off_black_24dp);
            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            password.setSelection(password.getText().length());
        }else {
            eye.setImageResource(R.drawable.ic_visibility_black_24dp);
            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            password.setSelection(password.getText().length());
        }

    }

    public void CreateAccount(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
