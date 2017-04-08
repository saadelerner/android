package com.futureapps.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by saad on 3/9/2017.
 */
public class fragmentAdapter extends FragmentPagerAdapter{
    int mNumOfTabs;
    public fragmentAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
Log.e("main","---Pos"+position);
                return new FRA();

            case 1:
                Log.e("main","---Pos"+position);
                return new FRB();

            case 2:
                Log.e("main","---Pos"+position);
                return new FRC();

            default:

             return null;


        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
