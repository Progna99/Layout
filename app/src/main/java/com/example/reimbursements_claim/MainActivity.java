package com.example.reimbursements_claim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<cardproduct> pdlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        pdlist = new ArrayList<>();
        cardadapter ad2 = new cardadapter(this, pdlist);
        pdlist.add(new cardproduct("Reimbursable item","November 17",R.drawable.icon));
        recyclerView.setAdapter(ad2);
    }
}
