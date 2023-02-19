package com.nicole.shopproject;



import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ONCLICKS FOR ACTIVITY_MAIN
    public void onClickBread(View view) {
        Intent categoryListActivity = new Intent(this, CategoryActivity.class);
        categoryListActivity.putExtra("category", "bread");
        startActivity(categoryListActivity);
        //ANIMATION
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_left);
    }

    public void onClickCake(View view) {
        Intent categoryListActivity = new Intent(this,CategoryActivity.class);
        categoryListActivity.putExtra("category", "cake");
        startActivity(categoryListActivity);
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_left);
    }

    public void onClickDessert(View view) {
        Intent categoryListActivity = new Intent(this,CategoryActivity.class);
        categoryListActivity.putExtra("category", "dessert");
        startActivity(categoryListActivity);
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_left);
    }
}
