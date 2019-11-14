package com.kumar.dipanshu.residemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kumar.dipanshu.residemenu.Fragments.Dashboardfragment;

public class Popularjuiceinfo extends AppCompatActivity {
    String juicename,juicedesc,juicecost,juicequantity;
    int juiceimage;

    TextView popularjuicename,popularjuicedescription,popularjuicecost,quantity;
    ImageView popularjuiceimage;

    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popularjuiceinfo);


        popularjuicename = findViewById(R.id.popularjuicename);
        popularjuicedescription = findViewById(R.id.popularjuicedescriptionn);
        popularjuicecost = findViewById(R.id.popularjuicecost);
        popularjuiceimage = findViewById(R.id.popularjuiceimage);
        quantity = findViewById(R.id.quantity);
        backbtn = findViewById(R.id.backbtn);


        juicename = getIntent().getStringExtra("popularjuicename");
        juicedesc = getIntent().getStringExtra("popularjuicedescription");
        juicecost = getIntent().getStringExtra("popularjuicecost");
        juiceimage = getIntent().getIntExtra("popularjuiceimage",0);
        juicequantity= getIntent().getStringExtra("popularjuiceamount");


        popularjuicename.setText(juicename);
        popularjuicedescription.setText(juicedesc);
        popularjuicecost.setText(juicecost);
        popularjuiceimage.setImageResource(juiceimage);
        quantity.setText(juicequantity);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));


            }
        });

    }
}
