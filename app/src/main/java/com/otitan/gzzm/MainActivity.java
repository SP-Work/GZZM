package com.otitan.gzzm;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp_main)
    ViewPager mVp_main;
    @BindView(R.id.rg_main)
    RadioGroup mRg_main;
    @BindView(R.id.rb_gqdt)
    RadioButton mRb_gqdt;
    @BindView(R.id.rb_fbgq)
    RadioButton mRb_fbgq;
    @BindView(R.id.rb_zlk)
    RadioButton mRb_zlk;
    @BindView(R.id.rb_xxbb)
    RadioButton mRb_xxbb;
    @BindView(R.id.rb_grzx)
    RadioButton mRb_grzx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        //
    }
}
