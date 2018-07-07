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
public class ParksFragment extends Fragment {

    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Location> Locations = new ArrayList<>();

        Locations.add(new Location(getString(R.string.location_gritty), getString(R.string.description_gritty), getString(R.string.address_gritty), R.drawable.gritty));
        Locations.add(new Location(getString(R.string.location_swiney), getString(R.string.description_swiney), getString(R.string.address_swiney), R.drawable.swiney));
        Locations.add(new Location(getString(R.string.location_fester), getString(R.string.description_fester), getString(R.string.address_fester), R.drawable.fester));
        Locations.add(new Location(getString(R.string.location_stringbell), getString(R.string.description_stringbell), getString(R.string.address_stringbell), R.drawable.stringbell));
        Locations.add(new Location(getString(R.string.location_macdonna), getString(R.string.description_macdonna), getString(R.string.address_macdonna), R.drawable.macdonna));

        LocationAdapter adapter;
        adapter = new LocationAdapter(getActivity(), Locations, R.color.category_parks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
