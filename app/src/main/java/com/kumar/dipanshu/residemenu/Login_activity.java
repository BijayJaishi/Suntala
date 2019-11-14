package com.kumar.dipanshu.residemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_activity extends AppCompatActivity {


    ImageView shape,front;
    EditText username,password;
    TextView forgot,account,register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);


        shape = (ImageView)findViewById(R.id.sape);
        front = (ImageView)findViewById(R.id.imagefront);
        forgot = (TextView)findViewById(R.id.forgotpwd);
        account = (TextView)findViewById(R.id.forgot);
        register = (TextView)findViewById(R.id.btnregsiter);
        username = (EditText)findViewById(R.id.user_name);
        password = (EditText)findViewById(R.id.passwrd);
        login = (Button)findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register_activity.class));
            }
        });

    }
}