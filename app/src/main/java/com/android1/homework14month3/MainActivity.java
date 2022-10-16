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
    private ArrayList<String> contactsList = new ArrayList<>();
    ListView listView;
    String mTitle[] = {"First", "Second", "Third","Four", "Fife"};
    String mDescription[] = {"First Description","Second Description","Third Description","Four Description","Fife Description",};
    int Image[] = {R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.four,R.drawable.fife,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_contacts = findViewById(R.id.recycler_view);
        contactsList.add("Тима");
        contactsList.add("Акжол");
        contactsList.add("Баха");
        contactsList.add("Эш");
        contactsList.add("Мека");
        contactsList.add("Мики");
        contactsList.add("Жейк");
        contactsList.add("Марс");
        contactsList.add("Сен");
        contactsList.add("Кожа");
        contactsList.add("Мелис");
        contactsList.add("Тима");





        contactsAdapter adapter = new contactsAdapter(contactsList);

        rv_contacts.setAdapter(adapter);
    }
}