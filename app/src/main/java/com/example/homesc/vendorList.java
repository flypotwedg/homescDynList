package com.example.homesc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Pair;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class vendorList extends AppCompatActivity {

    TextView categoryLabel;
    ListView vendList;

    //change to ArrayList<Pair<String,String>> when able with a custom adapter
    List vendInfo=new ArrayList<Pair<String,String>>();
    List vendNames=new ArrayList<String>();
    List vendUID=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_list);

        categoryLabel=(TextView) findViewById(R.id.categoryLabel);
        vendList=(ListView) findViewById(R.id.vendList);

        categoryLabel.setText(getIntent().getStringExtra("category"));

    }
}