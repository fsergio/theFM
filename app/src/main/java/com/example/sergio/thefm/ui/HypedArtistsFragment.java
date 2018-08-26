package com.example.sergio.thefm.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sergio.thefm.R;

public class HypedArtistsFragment extends Fragment {

    public static final int NUM_COLUMS = 2;

    public static final String LOG_TAG = HypedArtistsFragment.class.getName();

    private RecyclerView mHypedArtistsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.hyped_artists_fragments, container, false);

        mHypedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artists_list);

        return root;
    }

    private void setupArtistsList() {
        mHypedArtistsList.setLayoutManager( new GridLayoutManager(getActivity(), NUM_COLUMS));
    }

}
