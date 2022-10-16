package com.android1.homework14month3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ContactsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvContacts;


    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);

        tvContacts = itemView.findViewById(R.id.tv_first);

    }


    public void bind(String contacts){
        tvContacts.setText(contacts);
    }
}
