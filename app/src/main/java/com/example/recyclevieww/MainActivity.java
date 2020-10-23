package com.example.recyclevieww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myadapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person>people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people=new ArrayList<Person>();
        people.add(new Person("john","rambo","bus"));
        people.add(new Person("fhf","rmcd","plane"));
        people.add(new Person("cccs","ss","bus"));
        people.add(new Person("aaa","reee","plane"));
        people.add(new Person("jkkkk","ddd","bus"));

        myadapter=new PersonAdapter(this,people);
        recyclerView.setAdapter(myadapter);
    }
}