package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.recyclerviewdemo.adapters.ContactsAdapter;
import com.example.recyclerviewdemo.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Create dummy data
        ArrayList<Contact> contacts = getDummyData();

        //TODO: bind the recycler view to java class
        RecyclerView contactsRecyclerView = findViewById(R.id.contacts_recycler_view);

        // TODO: LayoutManager
          LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        contactsRecyclerView.setLayoutManager(linearLayoutManager);

        // TODO: View Model and Adapter
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        contactsRecyclerView.setAdapter(adapter);

        // Hurray Run the code

    }
     private ArrayList<Contact> getDummyData(){

        ArrayList<Contact> contacts=new ArrayList<>();
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Yash", "12345699890"));
        contacts.add(new Contact("Shayoli", "1234867890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        contacts.add(new Contact("Shayoli", "1234567890"));
        return contacts;
     }

}

