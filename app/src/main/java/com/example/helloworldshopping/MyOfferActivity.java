package com.example.helloworldshopping;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;

import com.example.helloworldshopping.adapter.MyPageAdapter;


public class MyOfferActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_offer);

        MyPageAdapter myPageAdapter = new MyPageAdapter(getSupportFragmentManager());
        final ViewPager pager = findViewById(R.id.viewPager);
        pager.setAdapter(myPageAdapter);
        pager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener());

    }
}