package com.android1.homework14month3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {


    private ArrayList<String>  contactList;



    public contactsAdapter(ArrayList<String> contactList) {
        this.contactList = contactList;
    }



    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new  ContactsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent,
                false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.bind(contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
