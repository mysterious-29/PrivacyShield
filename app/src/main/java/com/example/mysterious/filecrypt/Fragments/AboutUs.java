package com.example.mysterious.filecrypt.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import com.example.mysterious.filecrypt.R;

public class AboutUs extends Fragment {


    public AboutUs() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_about_us, container, false);
    }
}
