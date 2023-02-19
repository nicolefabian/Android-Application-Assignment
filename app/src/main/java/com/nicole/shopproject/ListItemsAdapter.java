package com.nicole.shopproject;



import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemsAdapter extends ArrayAdapter<Items> {
    public ListItemsAdapter(Activity context, ArrayList<Items> attractions){
        super(context,0,attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_items,parent,false);
        }

        Items currentItem = getItem(position);

        ImageView image = listItemView.findViewById(R.id.list_image);
        image.setImageResource(currentItem.getImage());

        TextView itemName = listItemView.findViewById(R.id.list_item_text);
        itemName.setText(currentItem.getTitle());

        TextView description = listItemView.findViewById(R.id.list_item_text2);
        description.setText(currentItem.getDescription());

        return listItemView;
    }

}
