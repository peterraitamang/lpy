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

//    ActivityMainBinding b;
    private BottomNavigationView bottomNavigationView;
    private NavController navController;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        b = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View view = b.getRoot();
//        setContentView(view);


//        b.bottomNavigationView.setSelectedItemId(R.id.homeFragment);


        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        navController = Navigation.findNavController(this,R.id.frame_layout);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);




    }
}