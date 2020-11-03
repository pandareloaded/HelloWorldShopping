package com.example.helloworldshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShopActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.greetingText_greetingFragment);

        SharedPreferences sp = getSharedPreferences("HelloWorldShoppingPref", Context.MODE_PRIVATE);
        String username = sp.getString("username","null");


        textView.setText("HOWDY"+" : "+username);
    }

    public void initMyOfferActivity(View view){
        Intent intent = new Intent(this, MyOfferActivity.class);
        startActivity(intent);
    }
}