package com.example.android.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.Arrays;

// TODO☑ (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
//  In the fragment class, you'll need to implement an empty constructor, and onCreateView

public class MasterListFragment extends Fragment {

    public MasterListFragment() { }


    // TODO☑ (3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView
    //  The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
    //  The adapter takes as parameters (Context context, List<Integer> imageIds)
    MasterListAdapter mMasterListAdapter;


    @Nullable
    @Override
    public View onCreateView(  @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mMasterListAdapter =  new MasterListAdapter(  this.getContext(), AndroidImageAssets.getAll() );

        View rootView = inflater .inflate(  R.layout.fragment_master_list,  container,  false);
        GridView gridView = (GridView) rootView.findViewById(R.id.fragment_master_list__gridview);
        gridView.setAdapter(mMasterListAdapter);

        return rootView;
    }

}
