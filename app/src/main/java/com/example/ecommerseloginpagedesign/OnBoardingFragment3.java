package com.example.ecommerseloginpagedesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OnBoardingFragment3 extends Fragment {

    FloatingActionButton clickToSingIn;

    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_on_boarding_fragment3,container,false);

        clickToSingIn = root.findViewById(R.id.click_to_singIn);
        clickToSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}