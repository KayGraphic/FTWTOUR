package com.example.android.ftwtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DessertsActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);
        getSupportFragmentManager().beginTransaction()
        .replace(R.id.container, new DessertsFragment())
        .commit();
    }
}

