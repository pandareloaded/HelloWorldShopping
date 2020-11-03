package com.example.helloworldshopping.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.helloworldshopping.Offer1Fragment;
import com.example.helloworldshopping.Offer2Fragment;
import com.example.helloworldshopping.Offer3Fragment;

public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager fragMan, int behavior) {
        super(fragMan, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    public MyPageAdapter(FragmentManager fragMan) {
        super(fragMan, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Offer1Fragment.newInstance(null, null);
            case 1:
                return Offer2Fragment.newInstance(null, null);
            case 2:
                return Offer3Fragment.newInstance(null, null);
            default:
                return null;
        }
    }
}