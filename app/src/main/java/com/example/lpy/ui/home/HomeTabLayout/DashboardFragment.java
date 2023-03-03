package com.example.lpy.ui.home.HomeTabLayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lpy.MainActivity;
import com.example.lpy.R;
import com.example.lpy.databinding.FragmentDashboardBinding;
import com.example.lpy.ui.home.Adapter.MyData;
import com.example.lpy.ui.home.Adapter.ViewPagerAdapter;
import com.example.lpy.ui.home.HomeFragment;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    FragmentDashboardBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      b= FragmentDashboardBinding.inflate(inflater, container, false);


        MyData[] myListData = new MyData[]{
                new MyData("Arun Kumar"),
                new MyData("Barun Kumar"),
                new MyData("CArun Kumar"),
                new MyData("DArun Kumar"),
                new MyData("GArun Kumar"),
                new MyData("rArun Kumar"),
                new MyData("wArun Kumar"),
                new MyData("wArun Kumar"),
                new MyData("Arun Kumar"),
                new MyData("1Arun Kumar"),
                new MyData("1Arun Kumar"),
                new MyData("1Arun Kumar"),
                new MyData("1Arun Kumar"),
        };

        b.recylerview.setHasFixedSize(true);









        return b.getRoot();
    }
}