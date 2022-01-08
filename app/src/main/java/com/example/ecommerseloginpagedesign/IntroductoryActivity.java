package com.example.ecommerseloginpagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class IntroductoryActivity extends AppCompatActivity {
    ImageView coverPhoto,airmollLogo,homeAppliances;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);
    }
}