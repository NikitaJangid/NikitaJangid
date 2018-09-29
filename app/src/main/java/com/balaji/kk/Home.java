package com.balaji.kk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    private TextView mwelcomeTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mwelcomeTxtView = findViewById(R.id.welcome_view);
        String username= getIntent().getStringExtra("home");

        mwelcomeTxtView.setText("Welcome "+username);
    }
}
