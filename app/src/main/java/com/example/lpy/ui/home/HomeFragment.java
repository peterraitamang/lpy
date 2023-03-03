package com.example.lpy.ui.home;



import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lpy.R;
import com.example.lpy.databinding.FragmentHomeBinding;
import com.example.lpy.ui.home.Adapter.ViewPagerAdapter;
import com.example.lpy.ui.home.HomeTabLayout.DashboardFragment;
import com.example.lpy.ui.home.HomeTabLayout.TimelineFragment;

public class HomeFragment extends Fragment {

    FragmentHomeBinding b;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b = FragmentHomeBinding.inflate(getLayoutInflater(),container,false);
        return b.getRoot();



    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        b.tablayout.setupWithViewPager(b.viewPager);




    }
}