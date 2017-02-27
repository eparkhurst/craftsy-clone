package com.elijahparkhurst.fakecraftsy;

import android.os.Bundle;

public class SearchActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().setTitle("Search");
        getSupportActionBar().setElevation(0);
    }
}
