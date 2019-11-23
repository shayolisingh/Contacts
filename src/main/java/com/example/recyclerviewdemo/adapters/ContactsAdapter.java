package com.example.recyclerviewdemo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.models.Contact;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {

    private ArrayList<Contact> contactsList;

    public ContactsAdapter(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_contact_item, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact = contactsList.get(position);

        holder.fullNameTextView.setText(contact.getFullName());
        holder.phoneNumberTextView.setText(contact.getPhone());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {

        TextView fullNameTextView, phoneNumberTextView;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            fullNameTextView = itemView.findViewById(R.id.fullname_textview);
            phoneNumberTextView = itemView.findViewById(R.id.phone_number_textview);
        }
    }
}
