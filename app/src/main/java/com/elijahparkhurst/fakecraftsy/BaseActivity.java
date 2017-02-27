package com.elijahparkhurst.fakecraftsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class BaseActivity extends AppCompatActivity {

    public void toHome(View view){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);

    }

    public void toFavorites(View view){

        Intent intent = new Intent(getApplicationContext(), FavoritesActivity.class);

        startActivity(intent);

    }


    public void toSearch(View view){

        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);

        startActivity(intent);

    }

    public void toAccount(View view){

        Intent intent = new Intent(getApplicationContext(), AccountActivity.class);

        startActivity(intent);

    }

    public void toCart(View view){

        Intent intent = new Intent(getApplicationContext(), CartActivity.class);

        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        RelativeLayout searchClick =(RelativeLayout)findViewById(R.id.menuSearch);
//        searchClick.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
