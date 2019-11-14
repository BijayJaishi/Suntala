package com.kumar.dipanshu.residemenu;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Register_activity extends AppCompatActivity {

    ImageView topbck,logo;
    EditText fname,mname,lname,email,password,confirmpass;
    Spinner gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);


        topbck = (ImageView)findViewById(R.id.sape);
        logo = (ImageView) findViewById(R.id.imagefront);
        fname = (EditText)findViewById(R.id.user_name);
        mname = (EditText)findViewById(R.id.mname);
        lname = (EditText)findViewById(R.id.lastname);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        gender = (Spinner)findViewById(R.id.gender);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        gender.setAdapter(adapter);
    }
}
