package com.example.cardviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;
    ArrayList<Contact> contacts;
    private ContactAdapter contactAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list=findViewById(R.id.list);
        contacts=new ArrayList<>();
        contacts.add(new Contact(R.drawable.android_image2,"Android","12345"));
        contacts.add(new Contact(R.drawable.android_image,"Android","12345"));

        contactAdapter=new ContactAdapter(this,contacts);


        list.setAdapter(contactAdapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);

    }
}
