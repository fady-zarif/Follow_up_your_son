package com.example.foda_.follow_your_son;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link My_Sons.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link My_Sons#newInstance} factory method to
 * create an instance of this fragment.
 */
public class My_Sons extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my__sons, container, false);
    }

}
