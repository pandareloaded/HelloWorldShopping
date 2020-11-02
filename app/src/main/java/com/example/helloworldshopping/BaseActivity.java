package com.example.helloworldshopping;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    private static BaseActivity lastPausedActivity = null;

    @Override
    public void onBackPressed(){

        moveTaskToBack(true);
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }
}