package com.example.android.ftwtour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
/* Android Fragment onCreateView code from Miwok app, supplemented by code from JournalDev.com
https://www.journaldev.com/9266/android-fragment-lifecycle Accessed 2018_07_07*/
public class CoffeeFragment extends Fragment {
    public CoffeeFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Location> Locations = new ArrayList<>();

        Locations.add(new Location(getString(R.string.location_itzz), getString(R.string.description_itzz), getString(R.string.address_itzz), R.drawable.coffee1));
        Locations.add(new Location(getString(R.string.location_jimmers), getString(R.string.description_jimmers), getString(R.string.address_jimmers), R.drawable.coffee2));
        Locations.add(new Location(getString(R.string.location_joe), getString(R.string.description_joe), getString(R.string.address_joe), R.drawable.coffee3));
        Locations.add(new Location(getString(R.string.location_nerdy), getString(R.string.description_nerdy), getString(R.string.address_nerdy), R.drawable.coffee4));
        Locations.add(new Location(getString(R.string.location_casablanca), getString(R.string.description_casablanca), getString(R.string.address_casablanca), R.drawable.coffee5));

        LocationAdapter adapter = new LocationAdapter(getActivity(), Locations, R.color.category_coffee);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}