package com.example.lpy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;


import com.example.lpy.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
//        b.bottomNavigationView.setSelectedItemId(R.id.homeFragment);
//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        navController = Navigation.findNavController(this,R.id.frame_layout);
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);
//        Navigation.findNavController(this, R.id.mobile_nav);
        navController = Navigation.findNavController(this, R.id.frame_layout);
        NavigationUI.setupWithNavController(b.bottomNavigationView, navController);





    }
}