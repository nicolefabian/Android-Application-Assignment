package com.nicole.shopproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    String name;
    int image;
    int details;
    int moredetails;
    String detailsprice;
    int catimage;
    int cattext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //GET ALL IDS FROM ACTIVITY_DETAILS
        TextView nameTextView = (TextView) findViewById(R.id.detailsTitle);
        ImageView imageView = (ImageView) findViewById(R.id.detailsImage);
        TextView detailsTextView = (TextView) findViewById(R.id.detailsText);
        TextView detailsTextView2 =(TextView) findViewById(R.id.detailsText2);
        ImageView catimageView = (ImageView) findViewById(R.id.detailscatimage);
        TextView cattextView =(TextView) findViewById(R.id.detailscatext);
        TextView detailsPriceView =(TextView) findViewById(R.id.detailsTextPrice);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        image = intent.getIntExtra("image", 0);
        details = intent.getIntExtra("info",0);
        moredetails = intent.getIntExtra("moreinfo",0);
        catimage = intent.getIntExtra("catimage", 0);
        cattext = intent.getIntExtra("cattext", 0);
        detailsprice = intent.getStringExtra("price");

        nameTextView.setText(name);
        imageView.setImageResource(image);
        detailsTextView.setText(details);
        detailsTextView2.setText(moredetails);
        catimageView.setImageResource(catimage);
        cattextView.setText(cattext);
        detailsPriceView.setText(detailsprice);

        //TO RETURN BACK TO THE CATEGORYACTIVITY
        cattextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }



}

