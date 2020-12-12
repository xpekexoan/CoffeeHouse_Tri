package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.thecoffeehouse.Adapter.PageAdapter;
import com.example.thecoffeehouse.View.DoiUuDai;
import com.example.thecoffeehouse.View.myUuDai;
import com.google.android.material.tabs.TabLayout;

public class News_Reward extends AppCompatActivity {
    ImageView img_close;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__reward);
        addControls();
        createTabFragment();
    }
    public void addControls() {
        tabLayout = findViewById(R.id.tab_uudai);
        viewPager = findViewById(R.id.view_page_doiuudai);
        ImageView img_close=(ImageView) findViewById(R.id.close_rewards);
        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void createTabFragment() {
        pageAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        pageAdapter.addFragment(new DoiUuDai());
        pageAdapter.addFragment(new myUuDai());
        viewPager.setAdapter(pageAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                pageAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}