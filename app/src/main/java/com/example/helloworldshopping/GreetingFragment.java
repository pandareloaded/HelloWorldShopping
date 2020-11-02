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

    /* public void sendMessage(View view){
         Intent intent = new Intent(GreetingFragment.this.getContext(), OfferingActivity.class);
         EditText editText = (EditText) findViewById(R.id.userNameTextbox);
         String username = editText.getText().toString();

         SharedPreferences sp = getSharedPreferences("HelloWorldShoppingPref", Context.MODE_PRIVATE);
         SharedPreferences.Editor spEditor = sp.edit();
         spEditor.putString("username",username);
         spEditor.commit();

         intent.putExtra(EXTRA_MESSAGE, username);
        startActivity(intent);
    }*/
}