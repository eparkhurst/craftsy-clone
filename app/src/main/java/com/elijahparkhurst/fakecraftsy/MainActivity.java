package com.elijahparkhurst.fakecraftsy;

import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import static com.elijahparkhurst.fakecraftsy.R.style.OtherAppTheme;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       setTheme(OtherAppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.action_toolbar);
        setSupportActionBar(myToolbar);
    }

}
