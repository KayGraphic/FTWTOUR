package com.example.android.ftwtour;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DessertsFragment extends Fragment {
    



public DessertsFragment() {
// Required empty public constructor
}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
Bundle savedInstanceState) {
View rootView = inflater.inflate(R.layout.word_list, container, false);



// Create a list of Locations
final ArrayList<Location> Locations = new ArrayList<Location>();

    Locations.add(new Location("1","әpә","1234 West North Street",R.drawable.c1));
    Locations.add(new Location("2","әpә","1234 West North Street",R.drawable.c2));
    Locations.add(new Location("3","әpә","WYTRWETREYTWR",R.drawable.c3));
    Locations.add(new Location("4","әpә","1234 West North Street",R.drawable.c4));
    Locations.add(new Location("5","әpә","1234 West North Street",R.drawable.c5));

LocationAdapter adapter =
new LocationAdapter(getActivity(), Locations, R.color.category_desserts);

ListView listView = (ListView) rootView.findViewById(R.id.list);

// Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
// {@link ListView} will display list items for each Location in the list of Locations.
// Do this by calling the setAdapter method on the {@link ListView} object and pass in
// 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

Location Location = Locations.get(position);





}
});

return rootView;
}





}
