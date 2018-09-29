package com.balaji.kk;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.balaji.kk.R;

public class registration extends AppCompatActivity {

    private static int SPLASH_TIME=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(registration.this,login_page.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME);
    }
}
