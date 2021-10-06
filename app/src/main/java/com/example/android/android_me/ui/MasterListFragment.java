package com.example.android.android_me.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// TODO✓(2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
//  In the fragment class, you'll need to implement an empty constructor, and onCreateView

public class MasterListFragment extends Fragment {

    public MasterListFragment() {
    }

    // TODO✓(3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView
    //  The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
    //  The adapter takes as parameters (Context context, List<Integer> imageIds)


    @Override
    public View onCreateView(  LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState) {

        final View rootView = inflater .inflate(  R.layout.fragment_master_list,  container,  false);

        GridView gridView = rootView.findViewById(R.id.images_grid_view);

        MasterListAdapter mAdapter =  new MasterListAdapter( getContext(), AndroidImageAssets.getAll() );

        gridView.setAdapter(mAdapter);

        return rootView;
    }

}
