package com.android1.homework14month3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contactsAdapter extends RecyclerView.Adapter<contactsAdapter.ContactsViewHolder> {


    private ArrayList<Contact>  contactList;



    public contactsAdapter(ArrayList<Contact> contactList) {
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
        Contact contact = contactList.get(position);
        holder.tvContacts.setText(contact.getName());
        holder.tvSecond.setText(contact.getPhone_number());
        holder.image.setImageResource(contact.getImage());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        private TextView tvContacts;
        private TextView tvSecond;
        private ImageView image;



        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            tvContacts = itemView.findViewById(R.id.tv_first);
            tvSecond = itemView.findViewById(R.id.tv_second);
            image = itemView.findViewById(R.id.image);

        }

    }
}
