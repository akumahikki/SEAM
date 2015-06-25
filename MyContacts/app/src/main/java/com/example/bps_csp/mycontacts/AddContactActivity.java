package com.example.bps_csp.mycontacts;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.bps_csp.mycontacts.data.Contact;


public class AddContactActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_contact);
    }

    public void addContact(View view)
    {
        Context context = getApplicationContext();
        Toast toast;
        String nameField = ((EditText) findViewById(R.id.editText)).getText().toString();
        String emailField = ((EditText) findViewById(R.id.editText2)).getText().toString();
        long phoneField = Long.parseLong(((EditText) findViewById(R.id.editText3)).getText().toString());
        String addressField= ((EditText) findViewById(R.id.editText4)).getText().toString();

        Contact newContact = new Contact(nameField, emailField, addressField, phoneField);
        ((MyContacts) getApplicationContext()).myContacts.add(newContact);
        toast = Toast.makeText(context, getString(R.string.added_message), Toast.LENGTH_SHORT);
        toast.show();
    }
}
