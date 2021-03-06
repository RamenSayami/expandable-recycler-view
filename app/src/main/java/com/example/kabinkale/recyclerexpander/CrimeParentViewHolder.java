package com.example.kabinkale.recyclerexpander;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

/**
 * Created by Kabin Kale on 7/22/2016.
 */
public class CrimeParentViewHolder extends ParentViewHolder {
    public TextView mCrimeTitleTextView;
    public ImageButton mParentDropDownArrow;

    public CrimeParentViewHolder(View itemView){
        super(itemView);

        mCrimeTitleTextView = (TextView) itemView.findViewById(R.id.parent_list_item_crime_title_text_view);
        mParentDropDownArrow = (ImageButton) itemView.findViewById(R.id.parent_list_item_expand_arrow);

    }
}
