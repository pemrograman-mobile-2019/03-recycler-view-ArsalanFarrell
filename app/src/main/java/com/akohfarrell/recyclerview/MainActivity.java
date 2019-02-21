package com.akohfarrell.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.akohfarrell.recyclerview.adapter.ContactsAdapter;
import com.akohfarrell.recyclerview.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);
        contacts = Contact.createContactsList(20);
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }


}
