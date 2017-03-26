package com.example.kabinkale.recyclerexpander;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.layout.)

    }

    private ArrayList<ParentObject> generateCrimes() {
        CrimeLab crimeLab = CrimeLab.get(getActivity());
        List<Crime> crimes = crimeLab.getCrimes();
        ArrayList<ParentObject> parentObjects = new ArrayList<>();
        for (Crime crime : crimes) {
            ArrayList<Object> childList = new ArrayList<>();
            childList.add(new CrimeChild(crime.getDate(), crime.isSolved()));
            crime.setChildObjectList(childList);
            parentObjects.add(crime);
        }
        return parentObjects;
    }
}
