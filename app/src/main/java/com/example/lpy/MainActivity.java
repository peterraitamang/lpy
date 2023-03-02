package com.example.lpy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.example.lpy.databinding.ActivityMainBinding;
import com.example.lpy.ui.chat.ChatFragment;
import com.example.lpy.ui.file.FileFragment;
import com.example.lpy.ui.group.GroupFragment;
import com.example.lpy.ui.home.HomeFragment;
import com.example.lpy.ui.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.io.File;
import java.nio.file.attribute.GroupPrincipal;

public class MainActivity extends AppCompatActivity{

    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,homeFragment).commit();

        b.navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,homeFragment).commit();
                        return true;
                    case R.id.nav_chat:
                        ChatFragment chatFragment = new ChatFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,chatFragment).commit();
                        return true;
                    case R.id.nav_group:
                        GroupFragment groupFragment = new GroupFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,groupFragment).commit();
                        return true;
                    case R.id.nav_file:
                        FileFragment fileFragment = new FileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fileFragment).commit();
                        return true;
                    case R.id.nav_profile:
                        ProfileFragment profileFragment = new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,profileFragment).commit();
                        return true;

                }
                return false;
            }
        });

        b.navigation.setSelectedItemId(R.id.nav_home);
    }
}