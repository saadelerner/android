package com.futureapps.fragments;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
ViewPager pager;
    TabLayout tblayout;
    fragmentAdapter fragmentadapter;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tblayout=(TabLayout) findViewById(R.id.tablayout);

        tblayout.addTab(tblayout.newTab().setText("ONE").setIcon(R.mipmap.ic_launcher));
        tblayout.addTab(tblayout.newTab().setText("1NE").setIcon(R.mipmap.ic_launcher));
        tblayout.addTab(tblayout.newTab().setText("2NE").setIcon(R.mipmap.ic_launcher));

//        tblayout.setTabTextColors(ContextCompat.getColorStateList(this, R.color.colorWhite));
//tblayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorAccent));
       // tblayout.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tblayout.setTabGravity(TabLayout.GRAVITY_FILL);
        pager=(ViewPager) findViewById(R.id.pager);
        fragmentadapter=new fragmentAdapter(getSupportFragmentManager(),tblayout.getTabCount());
        pager.setAdapter(fragmentadapter);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tblayout));
tblayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {



        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});
    }
}
