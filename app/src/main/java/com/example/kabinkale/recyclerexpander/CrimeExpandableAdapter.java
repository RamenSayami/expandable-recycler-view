package com.example.kabinkale.recyclerexpander;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import java.util.List;


/**
 * Created by Kabin Kale on 7/22/2016.
 */
public class CrimeExpandableAdapter extends ExpandableRecyclerAdapter<ParentViewHolder,ChildViewHolder> {

    LayoutInflater mInflater;

    public CrimeExpandableAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_crime_parent,viewGroup,false);

        return new CrimeParentViewHolder(view);
    }

    @Override
    public ChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_crime_child, viewGroup, false);
        return new CrimeChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(ParentViewHolder crimeParentViewHolder, int i, Object parentObject) {
//        Crime crime = (Crime) parentObject;
//        crimeParentViewHolder.mCrimeTitleTextView.
    }


    public void onBindParentViewHolder(CrimeParentViewHolder crimeParentViewHolder, int i, Object parentObject) {
        Crime crime = (Crime) parentObject;
        crimeParentViewHolder.mCrimeTitleTextView.setText(crime.getTitle());
    }

    @Override
    public void onBindChildViewHolder(ChildViewHolder childViewHolder, int i, Object o) {

    }

    public void onBindChildViewHolder(CrimeChildViewHolder crimeChildViewHolder, int i, Object childObject) {
        CrimeChild crimeChild = (CrimeChild) childObject;
        crimeChildViewHolder.mCrimeDateText.setText(crimeChild.getDate().toString());
        crimeChildViewHolder.mCrimeSolvedCheckBox.setChecked(crimeChild.isSolved());
    }
}
