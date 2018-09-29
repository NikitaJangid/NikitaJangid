package com.balaji.kk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.text.TextUtils.*;
import static com.balaji.kk.R.id.activity_sign_up;

public class sign_up extends AppCompatActivity {
    private EditText mUsernameEditTxt;
    private EditText mailEditTat;
    private EditText mPasswordEditTxt;
    private EditText massEditTat;
    public Button mLoginBtn;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mUsernameEditTxt = findViewById(R.id.username_edit_text);
        mailEditTat =findViewById(R.id.email_edit_text);
        mPasswordEditTxt = findViewById(R.id.password_edit_text);
        massEditTat =findViewById(R.id.cpass_edit_text);
        mLoginBtn = findViewById(R.id.Login_btn);
    }
    public void onLoginClick(View view) {
        String username = mUsernameEditTxt.getText().toString();
        String email = mailEditTat.getText().toString();
        String password = mPasswordEditTxt.getText().toString();
        String cpass = massEditTat.getText().toString();

        if (isEmpty(username)) {
            mUsernameEditTxt.setError("Please enter user name");

        } else if (isEmpty(email)) {
            mailEditTat.setError("Please enter a valid email");

        } else if (isEmpty(password)) {
            mPasswordEditTxt.setError("Please enter password");
        } else if (password.length() < 6) {
            mPasswordEditTxt.setError("Please enter minimum 6 char");
        } else if (isEmpty(cpass)) {
            massEditTat.setError("Please enter Same password");
        } else {
            Toast.makeText(getApplicationContext(), "login sucessfull", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(sign_up.this, firstPage.class);
            startActivity(intent);
            finish();
        }
    }
}