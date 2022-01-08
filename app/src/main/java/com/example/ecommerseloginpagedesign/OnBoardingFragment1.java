package com.example.ecommerseloginpagedesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OnBoardingFragment1 extends Fragment {

    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_on_boarding_fragment1,container,false);
        return root;
    }
}