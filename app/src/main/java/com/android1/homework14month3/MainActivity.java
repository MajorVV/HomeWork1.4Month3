package com.android1.homework14month3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_contacts = findViewById(R.id.recycler_view);
        ArrayList<Contact> contactsList = new ArrayList<>();
        contactsList.add(new Contact("Тима","0777889909",R.drawable.man));
        contactsList.add(new Contact("Айша","0997874432",R.drawable.woman2));
        contactsList.add(new Contact("Айлиш","0500043933",R.drawable.woman));
        contactsList.add(new Contact("Арс","0222993254",R.drawable.dad));
        contactsList.add(new Contact("Жека","0555776747",R.drawable.man2));
        contactsList.add(new Contact("Эля","0555555555",R.drawable.woman));
        contactsList.add(new Contact("Марс","0707889000",R.drawable.man));
        contactsList.add(new Contact("Гуля","0404033999",R.drawable.woman2));
        contactsList.add(new Contact("Бейк","0998264792",R.drawable.man2));
        contactsList.add(new Contact("Аллен ага","0558372727",R.drawable.dad));






        contactsAdapter adapter = new contactsAdapter(contactsList);

        rv_contacts.setAdapter(adapter);
    }
}