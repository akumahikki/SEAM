package com.example.bps_csp.mycontacts;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ShowContactActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_contact);
        String[] values = getContacsNames();

    }

    public String[] getContacsNames(){
        int size = ((MyContacts) getApplicationContext()).myContacts.size();
        String[] names = new String[size];
        for(int i = 0; i < size; i++) {
            names[i] = ((MyContacts) getApplicationContext()).myContacts.get(i).getName();
        }

        return names;
    }
}
