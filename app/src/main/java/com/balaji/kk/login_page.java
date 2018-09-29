package com.balaji.kk;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_page extends AppCompatActivity {

    private Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        //mLoginBtn.setOnClickListener()
        // public void onLoginClickView){
        mLoginBtn = findViewById(R.id.Login_btn);
    }


    public void onLoginClick(View view) {

        Toast.makeText(getApplicationContext(), "login sucessfull", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(login_page.this, firstPage.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onLoginClick1(View view) {
        Toast.makeText(getApplicationContext(), "goto sign-up", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(login_page.this, sign_up.class);
        startActivity(intent);
    }
}