package com.elijahparkhurst.fakecraftsy;

import android.support.v7.app.ActionBar;
import android.os.Bundle;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setLogo(R.drawable.craftsylogo);
        actionBar.setDisplayUseLogoEnabled(true);
    }

}
