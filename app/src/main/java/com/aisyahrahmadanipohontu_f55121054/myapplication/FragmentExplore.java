package com.aisyahrahmadanipohontu_f55121054.myapplication;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentExplore extends Fragment {
    View view;
    public FragmentExplore(){
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.explore_fragment, container, false);
        return view;
    }

}
