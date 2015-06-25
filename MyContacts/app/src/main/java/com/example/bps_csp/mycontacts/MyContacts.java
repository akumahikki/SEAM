package com.example.bps_csp.mycontacts;

import android.app.Application;

import com.example.bps_csp.mycontacts.data.Contact;

import java.util.ArrayList;


public class MyContacts extends Application{

    public ArrayList<Contact> myContacts;

    public MyContacts(){ myContacts = new ArrayList<>();}

    public Contact searchContactByName(String name)
    {
        Contact myContact = null;
        for(Contact contact : myContacts)
        {
            if(contact.getName() == name)
            {
                myContact = contact;
                break;
            }
        }
        return myContact;
    }
}
