package com.example.bps_csp.mycontacts;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by bps_csp on 24/06/15.
 */
public class MyActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void renderAddContact(View view)
    {
        Intent addContactActivity = new Intent(this, AddContactActivity.class);
        startActivity(addContactActivity);
    }

    public void renderSelectContact(View view)
    {
        Intent showContactActivity = new Intent(this, ShowContactActivity.class);
        startActivity(showContactActivity);
    }
}
