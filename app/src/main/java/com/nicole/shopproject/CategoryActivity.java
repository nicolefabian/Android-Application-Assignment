package com.nicole.shopproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_categories);

        Intent intent = getIntent();
        item = intent.getStringExtra("category");

        //GET THE SAME VALUE ON EACH ONCLICK ON .MAINACTIVITY
        //TO DISPLAY ALL CONTENT ON THEIR RESPECTIVE CATEGORIES
        if(item.equals("bread")){
            showBread();
            getSupportActionBar().setTitle("Breads");
        }

        if(item.equals("cake")){
            showCake();
            getSupportActionBar().setTitle("Cakes");
        }

        if(item.equals("dessert")){
            showDessert();
            getSupportActionBar().setTitle("Desserts");
        }
    }

    //@FUNCTION TO ADD ALL CONTENT ON EACH ARRAY AND DISPLAY ADDITIONAL DETAILS AFTER CLICKING
    private void showBread(){
        final ArrayList<Items> foodBread = new ArrayList<>();
        foodBread.add(new Items("Croissant",R.string.croissant_details,R.drawable.bcroissant,R.string.croissant_info,R.drawable.bbanner1,R.string.bread_category, "Price: $8.50"));
        foodBread.add(new Items("Banana Bread",R.string.banana_bread_details,R.drawable.bbanana_bread,R.string.banana_bread_info,R.drawable.bbanner1,R.string.bread_category,"Price: $12.30"));
        foodBread.add(new Items("Scone",R.string.scone_details,R.drawable.bscone,R.string.scones_info,R.drawable.bbanner1,R.string.bread_category, "Price: $5.50"));
        foodBread.add(new Items("Red bean bun",R.string.red_bean_details,R.drawable.bredbean,R.string.red_bean_info,R.drawable.bbanner1,R.string.bread_category, "Price: $7.99"));
        foodBread.add(new Items("Cinnamon",R.string.cinnamon_details,R.drawable.bcinnamon,R.string.cinnamon_info,R.drawable.bbanner1,R.string.bread_category, "Price: $6.25"));
        foodBread.add(new Items("Challah",R.string.challah_details,R.drawable.bchallah,R.string.challah_info,R.drawable.bbanner1,R.string.bread_category, "Price: $3.99"));
        foodBread.add(new Items("Chocolate bread",R.string.choco_bread_details,R.drawable.bchocobread,R.string.choco_bread_info,R.drawable.bbanner1,R.string.bread_category, "Price: $10.20"));
        foodBread.add(new Items("Cross buns",R.string.cross_buns_details,R.drawable.bcrossbuns,R.string.crossbuns_info,R.drawable.bbanner1,R.string.bread_category, "Price: $4.50"));
        foodBread.add(new Items("Sourdough",R.string.sourdough_details,R.drawable.bsourdough,R.string.sourdough_info,R.drawable.bbanner1,R.string.bread_category, "Price: $6.75"));
        foodBread.add(new Items("Garlic bread",R.string.garlic_bread_details, R.drawable.bgarlicbread,R.string.garlic_bread_info,R.drawable.bbanner1,R.string.bread_category, "Price: $11.25"));

        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, foodBread);

        ListView listView = findViewById(R.id.categoriesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Items food = foodBread.get(position);
                Intent i = new Intent(getBaseContext(), DetailsActivity.class);
                i.putExtra("name",food.getTitle());
                i.putExtra("image",food.getImage());
                i.putExtra("info",food.getDescription());
                i.putExtra("moreinfo",food.getMoredescription());
                i.putExtra("catimage",food.getCatimage());
                i.putExtra("cattext",food.getCattext());
                i.putExtra("price",food.getDetailsprice());
                startActivity(i);
                //ANIMATION
                overridePendingTransition(R.transition.slide_in_right,R.transition.slide_out_left);
            }
        });
    }


    private void showCake(){
        final ArrayList<Items> foodCake = new ArrayList<>();
        foodCake.add(new Items("Mango Cake",R.string.mangocake_details,R.drawable.cmangocake,R.string.mangocake_info,R.drawable.cbanner,R.string.cake_category,"Price: $70.00"));
        foodCake.add(new Items("Tiramisu Cake",R.string.tiramisu_details,R.drawable.ctiramisu,R.string.tiramisu_info,R.drawable.cbanner,R.string.cake_category, "Price: $60.25"));
        foodCake.add(new Items("Strawberry Cake",R.string.strawberry_details,R.drawable.cstrawberry,R.string.strawberrycake_info,R.drawable.cbanner,R.string.cake_category, "Price: $75.50"));
        foodCake.add(new Items("Chocolate Cake",R.string.choco_details,R.drawable.cchococake,R.string.chococake__info,R.drawable.cbanner,R.string.cake_category, "Price: $62.00"));
        foodCake.add(new Items("Choco Berry Cake",R.string.strawberrychoc_details,R.drawable.cchocostrawberry,R.string.strawberrychoc_info,R.drawable.cbanner,R.string.cake_category, "Price: $75.80"));
        foodCake.add(new Items("Fruit Cake",R.string.fruitcake_details,R.drawable.cfruitcake,R.string.fruitcake_info,R.drawable.cbanner,R.string.cake_category, "Price: $65.50"));
        foodCake.add(new Items("Oreo Cake",R.string.cookiescake_details,R.drawable.ccookies,R.string.cookiescake__info,R.drawable.cbanner,R.string.cake_category, "Price: $66.70"));
        foodCake.add(new Items("Black Forest Cake",R.string.blackforest_details,R.drawable.cblackforest,R.string.blackforest_info,R.drawable.cbanner,R.string.cake_category, "Price: $72.50"));
        foodCake.add(new Items("Birthday Cake",R.string.birthday_details,R.drawable.cbirthday,R.string.birthday_info,R.drawable.cbanner,R.string.cake_category, "Price: $68.99"));
        foodCake.add(new Items("Vanilla Berry Cake",R.string.strawvanilla_details,R.drawable.cstrawvanilla,R.string.strawvanilla_info,R.drawable.cbanner,R.string.cake_category, "Price: $75.80"));

        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, foodCake);

        ListView listView = findViewById(R.id.categoriesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Items food = foodCake.get(position);
                Intent i = new Intent(getBaseContext(), DetailsActivity.class);
                i.putExtra("name",food.getTitle());
                i.putExtra("image",food.getImage());
                i.putExtra("info",food.getDescription());
                i.putExtra("moreinfo",food.getMoredescription());
                i.putExtra("catimage",food.getCatimage());
                i.putExtra("cattext",food.getCattext());
                i.putExtra("price",food.getDetailsprice());

                startActivity(i);
                //ANIMATION
                overridePendingTransition(R.transition.slide_in_right,R.transition.slide_out_left);
            }
        });

    }
    private void showDessert() {
        final ArrayList<Items> foodDessert = new ArrayList<>();
        foodDessert.add(new Items("Almond tart", R.string.almondtart_details, R.drawable.dalmondtart,R.string.almondatart_info,R.drawable.dbanner,R.string.dessert_category,"Price: $14.99"));
        foodDessert.add(new Items("Egg tart", R.string.eggtart_details, R.drawable.deggtart,R.string.eggtart_info,R.drawable.dbanner,R.string.dessert_category, "Price: $16.75"));
        foodDessert.add(new Items("Choco Berry Cupcake", R.string.chocstrawberrycup_details, R.drawable.dchocostrawcupcake,R.string.chocstrawberrycup_info,R.drawable.dbanner,R.string.dessert_category,"Price: $8.50"));
        foodDessert.add(new Items("Chocolate Cookies", R.string.cookies_details, R.drawable.dcookies,R.string.cookies_info,R.drawable.dbanner,R.string.dessert_category, "Price: $6.25"));
        foodDessert.add(new Items("Cookies Sandwich", R.string.cookiesandwich_details, R.drawable.dcookiesandwich,R.string.cookiesandwich_info,R.drawable.dbanner,R.string.dessert_category, "Price: $8.50"));
        foodDessert.add(new Items("Macaron", R.string.macaron1_details, R.drawable.dmacaron1,R.string.macaron1_info,R.drawable.dbanner,R.string.dessert_category, "Price: $12.20"));
        foodDessert.add(new Items("Macaron", R.string.macaron2_details, R.drawable.dmacaron2,R.string.macaron2_info,R.drawable.dbanner,R.string.dessert_category,"Price: $10.45"));
        foodDessert.add(new Items("Peanut butter Cookies", R.string.peanutcookie_details, R.drawable.dpeanut,R.string.peanutcookie_info,R.drawable.dbanner,R.string.dessert_category, "Price: $7.50"));
        foodDessert.add(new Items("Sprinkled Cupcake", R.string.sprinklescupcake_details, R.drawable.dsprinkles,R.string.sprinklescupcake_info,R.drawable.dbanner,R.string.dessert_category, "Price: $4.99"));
        foodDessert.add(new Items("Chocolate Cupcake", R.string.whipcupcake_details, R.drawable.dwhipchoco,R.string.whipcupcake_info,R.drawable.dbanner,R.string.dessert_category, "Price: $7.80"));

        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, foodDessert);

        ListView listView = findViewById(R.id.categoriesList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Items food = foodDessert.get(position);
                Intent i = new Intent(getBaseContext(), DetailsActivity.class);
                i.putExtra("name",food.getTitle());
                i.putExtra("image",food.getImage());
                i.putExtra("info",food.getDescription());
                i.putExtra("moreinfo",food.getMoredescription());
                i.putExtra("catimage",food.getCatimage());
                i.putExtra("cattext",food.getCattext());
                i.putExtra("price",food.getDetailsprice());

                startActivity(i);
                //ANIMATION
                overridePendingTransition(R.transition.slide_in_right,R.transition.slide_out_left);
            }
        });
    }
}