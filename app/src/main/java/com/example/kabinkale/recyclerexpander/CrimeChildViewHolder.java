package com.example.kabinkale.recyclerexpander;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

/**
 * Created by Kabin Kale on 7/22/2016.
 */
public class CrimeChildViewHolder extends ChildViewHolder {
    public TextView mCrimeDateText;
    public CheckBox mCrimeSolvedCheckBox;

    public CrimeChildViewHolder(View itemView) {
        super(itemView);
        mCrimeDateText = (TextView) itemView.findViewById(R.id.child_list_item_crime_solved);
        mCrimeSolvedCheckBox = (CheckBox) itemView.findViewById(R.id.child_list_item_crime_solved_check_box);

    }
}
