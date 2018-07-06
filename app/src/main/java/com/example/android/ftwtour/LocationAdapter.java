package com.example.android.ftwtour;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> Locations, int colorResourceId) {
        super(context, 0, Locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Location currentLocation = getItem(position);
        View listItemView;
        listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        ImageView imageLocationTextView = (ImageView) listItemView.findViewById(R.id.photo_image_view);
        imageLocationTextView.setImageResource(currentLocation.getImageResourceId());


        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
         descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressLocationTextView.setText(currentLocation.getAddress());


        View textContainer = listItemView.findViewById(R.id.text_container);
 
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
       
        textContainer.setBackgroundColor(color);

              return listItemView;
          }


}
