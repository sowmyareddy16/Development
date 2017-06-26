package com.example.konda.fragments;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       FragmentManager fragmentManager=getSupportFragmentManager();
       android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();




    }
}
