package com.example.android.ftwtour;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

    Locations.add(new Location("SugarMama's","әpә","1234 West North Street",R.drawable.d1));
    Locations.add(new Location("Cupcake Junction","әpә","1234 West North Street",R.drawable.d2));
    Locations.add(new Location("Tree Renegade","әpә","WYTRWETREYTWR",R.drawable.d3));
    Locations.add(new Location("4Sweet's Sake","әpә","WYTRWETREYTWR",R.drawable.d4));
    Locations.add(new Location("Cribbagge","әpә","1234 West North Street",R.drawable.d1));

LocationAdapter adapter =
new LocationAdapter(getActivity(), Locations, R.color.category_desserts);

ListView listView = (ListView) rootView.findViewById(R.id.list);

listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

}
});

return rootView;
}
}
