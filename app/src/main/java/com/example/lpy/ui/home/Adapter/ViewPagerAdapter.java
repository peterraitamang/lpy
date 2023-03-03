package com.example.lpy.ui.home.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lpy.ui.home.HomeTabLayout.DashboardFragment;
import com.example.lpy.ui.home.HomeTabLayout.TimelineFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {




    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment = null;
        if (position == 0 )
        {
            fragment = new DashboardFragment();
        }
        else if(position == 1)
        {
            fragment = new TimelineFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return fragmentArrayList.size();
    }


    public void addFragment(Fragment fragment , String title){
        fragmentArrayList.add(fragment);
        fragmentTitle.add(title);
    }

    getPa
}
