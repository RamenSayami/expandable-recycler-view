package com.example.kabinkale.recyclerexpander;

import java.util.Date;

/**
 * Created by Kabin Kale on 7/22/2016.
 */
public class CrimeChild {
    private Date mDate;
    private boolean mSolved;

    public CrimeChild(Date date, boolean solved) {
        mDate = date;
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
