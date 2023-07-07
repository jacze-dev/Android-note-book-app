package com.ebookfrenzy.myprov01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ebookfrenzy.myprov01.note.Editor;
import com.ebookfrenzy.myprov01.note.NewNote;

public class MainActivity extends AppCompatActivity {
     ViewPager mypager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mypager= findViewById(R.id.mpPager);
        setUpPager(mypager);
        setMypager(0);


    }

public void setMypager(int fragmentNo){
 mypager.setCurrentItem(fragmentNo);
}

    public void setUpPager(ViewPager viewPager){
  PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
  pagerAdapter.addFragment(new Editor(),"myfragment");
  }
}
