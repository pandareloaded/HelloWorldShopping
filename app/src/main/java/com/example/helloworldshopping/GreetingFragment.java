package com.example.helloworldshopping;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GreetingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GreetingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_greeting, container, false);
    }

     public void initMyOfferActivity(View view){
         Intent intent = new Intent(getActivity(), MyOfferActivity.class);
        startActivity(intent);
    }
}