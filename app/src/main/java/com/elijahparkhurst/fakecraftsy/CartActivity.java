package com.elijahparkhurst.fakecraftsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        getSupportActionBar().setTitle("Cart");
        getSupportActionBar().setElevation(0);

    }
}
