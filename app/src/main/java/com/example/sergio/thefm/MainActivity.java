package com.example.sergio.thefm;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sergio.thefm.ui.HypedArtistsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.mainContainer, new HypedArtistsFragment())
                .commit();

    }
}
