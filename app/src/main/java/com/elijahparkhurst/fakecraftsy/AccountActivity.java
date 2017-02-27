package com.elijahparkhurst.fakecraftsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AccountActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        getSupportActionBar().setTitle("Account");
    }
}
