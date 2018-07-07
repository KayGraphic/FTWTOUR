package com.example.android.ftwtour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DessertsFragment extends Fragment {
    public DessertsFragment() {
}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
Bundle savedInstanceState) {
View rootView = inflater.inflate(R.layout.word_list, container, false);

final ArrayList<Location> Locations = new ArrayList<>();

    Locations.add(new Location(getString(R.string.location_sugar), getString(R.string.description_sugar), getString(R.string.address_sugar), R.drawable.d4));
    Locations.add(new Location(getString(R.string.location_cupcake), getString(R.string.description_cupcake), getString(R.string.address_cupcake), R.drawable.d2));
    Locations.add(new Location(getString(R.string.location_tree), getString(R.string.description_tree), getString(R.string.address_tree), R.drawable.d3));
    Locations.add(new Location(getString(R.string.location_foursweet), getString(R.string.description_foursweets), getString(R.string.address_foursweets), R.drawable.d1));


    LocationAdapter adapter = new LocationAdapter(getActivity(), Locations, R.color.category_desserts);
    ListView listView = (ListView) rootView.findViewById(R.id.list);
    listView.setAdapter(adapter);

    return rootView;
}


}

