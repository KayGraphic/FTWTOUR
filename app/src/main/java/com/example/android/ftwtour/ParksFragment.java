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
 * A simple {@link Fragment} subclass. Inflates a viewGroup, uses wordlistXML to make items.
 */
public class ParksFragment extends Fragment {




    public ParksFragment() {
// Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
// Create an arraylist to add locations to.
final ArrayList<Location> Locations = new ArrayList<Location>();
    
Locations.add(new Location("Gritty Park","Great place for kids if they don't have allergies to ragweed, lambs quarters or poison ivy. One splinter-filled picnic table is all you need for family fun time ","1234 West North Street",R.drawable.gritty));
    Locations.add(new Location("Swiney Park","This strip of land is currently recuperating from being on local police records as an area known for prostitution and drug dealing. Now it operates as the overflow basin when the Maumee river overflows.","1234 West North Street",R.drawable.swiney));
    Locations.add(new Location("Fester Park","әpә","WYTRWETREYTWR",R.drawable.fester));
    Locations.add(new Location("Stringbell Park","әpә","1234 West North Street",R.drawable.macdonna));
    Locations.add(new Location("MacDonna Park","әpә","1234 West North Street",R.drawable.stringbell));

LocationAdapter adapter;
    adapter = new LocationAdapter(getActivity(), Locations, R.color.category_parks);

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
