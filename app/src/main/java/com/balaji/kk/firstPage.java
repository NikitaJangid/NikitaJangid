package com.balaji.kk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class firstPage extends AppCompatActivity {

    private EditText mUsernameEditTxt;

    private EditText mPasswordEditTxt;

    private Button mLoginBtn;
    private Button mLoginBtn1;

    private TextView mForgetPasswordTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        mUsernameEditTxt = findViewById(R.id.username_edit_text);
        mPasswordEditTxt = findViewById(R.id.password_edit_text);
        mLoginBtn = findViewById(R.id.Login_btn);

        mForgetPasswordTxtView = findViewById(R.id.forgot_password_text_view);

        //mLoginBtn.setOnClickListener()
        // public void onLoginClickView){
    }


    public void onLoginClick(View view) {
        String username = mUsernameEditTxt.getText().toString();
        String password = mPasswordEditTxt.getText().toString();

        if (TextUtils.isEmpty(username)) {
            mUsernameEditTxt.setError("Please enter user name");

        } else if (TextUtils.isEmpty(password)) {
            mPasswordEditTxt.setError("Please enter password");
        } else if (password.length() < 6) {
            mPasswordEditTxt.setError("Please enter minimum 6 char");
        } else {
            Toast.makeText(getApplicationContext(), "login sucessfull", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(firstPage.this, Home.class);
            intent.putExtra("home", username);
            startActivity(intent);
            finish();
        }
    }

    public void onLoginClick1(View view) {
            Toast.makeText(getApplicationContext(), "goto sign up", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(firstPage.this, sign_up.class);
         //intent.putExtra("home", username);
            startActivity(intent);
        }
    }
