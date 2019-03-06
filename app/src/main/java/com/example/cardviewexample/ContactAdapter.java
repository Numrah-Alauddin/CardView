package com.example.cardviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    Context context1;
    ArrayList<Contact> contacts;

    public ContactAdapter(Context context,ArrayList<Contact> contacts) {
        context1=context;
        this.contacts=contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(context1);
        View view=inflater.inflate(R.layout.contact_item,viewGroup,false);
        ContactViewHolder contactViewHolder=new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {

        Contact contact=contacts.get(i);
        contactViewHolder.contact_img.setImageResource(contact.getImage());
        contactViewHolder.contact_name.setText(contact.getName());
        contactViewHolder.contact_num.setText(contact.getNum());
        contactViewHolder.contact_call.setImageResource(contact.getCall());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
