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
public class DivesFragment extends Fragment {
    



public DivesFragment() {
// Required empty public constructor
}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
Bundle savedInstanceState) {
View rootView = inflater.inflate(R.layout.word_list, container, false);



// Create a list of Locations
final ArrayList<Location> Locations = new ArrayList<>();

    Locations.add(new Location("The Redwood Inn","Perfect for those nights when you want to get drunk on skunked Bud Light and eat church youth group pizza squares. Abiance includes overly loud Jukebox with all your favorite late 90s hits. A destination for people who love dark bars and sticky tables","1234 West North Street",R.drawable.redwood));
    Locations.add(new Location("Broadway Joes","If you hate puntuation and restraining orders, this is the place for you. Originally a 2 story building, it caught fire in 2006 and now is a one story building, one that involves late child support payments, that white van that is parked outside the front door that operates as the 'Smoking Lounge' in winter and the pizza rolls that will give you instant acid reflux","1234 Broadway",R.drawable.broadwayjoes));
    Locations.add(new Location("The DugOut","The name functions as a reminder to patrons to bring their drug paraphernalia with them on their next visit. No problem if you forgot your coke mirror, you can use the back of the toilet because you are classy like that.","1234 Fairfield",R.drawable.dugout));
    Locations.add(new Location("","әpә","1234 West North Street",R.drawable.c4));
    Locations.add(new Location("5","әpә","1234 West North Street",R.drawable.c5));

LocationAdapter adapter =
new LocationAdapter(getActivity(), Locations, R.color.category_dives);

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
