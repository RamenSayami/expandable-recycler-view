package com.example.kabinkale.recyclerexpander;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.Objects;

/**
 * Created by Kabin Kale on 7/22/2016.
 */
public class Crime implements ParentObject {
    private List<Object> mChildList;
    private String mTitle;
    @Override
    public List<Object> getChildObjectList() {
        return mChildList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildList = list;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
