package com.example.android.ftwtour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DivesFragment extends Fragment {

    public DivesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final ArrayList<Location> Locations = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.word_list, container, false);

        Locations.add(new Location(getString(R.string.location_redwood), getString(R.string.redwood_inn), getString(R.string.address_redwood), R.drawable.redwood));
        Locations.add(new Location(getString(R.string.location_broadway), getString(R.string.broadway_joes), getString(R.string.address_broadway_joes), R.drawable.broadwayjoes));
        Locations.add(new Location(getString(R.string.location_dugout), getString(R.string.dugout), getString(R.string.address_dugout), R.drawable.dugout));
        Locations.add(new Location(getString(R.string.location_braodway), getString(R.string.description_broadway), getString(R.string.address_broadway_grill), R.drawable.broadwaygrill));
        Locations.add(new Location(getString(R.string.location_rock), getString(R.string.description_rock), getString(R.string.address_rock), R.drawable.rock));

        LocationAdapter adapter = new LocationAdapter(getActivity(), Locations, R.color.category_dives);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
