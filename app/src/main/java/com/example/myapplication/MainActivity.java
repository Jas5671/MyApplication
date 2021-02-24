package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Script;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;

public class MainActivity extends AppCompatActivity {

    TextView txtWelcome;
   RadioGroup rdGrp;
   RadioButton rtngender;
   Button btnsubmit;
   Spinner spncountry;
    Button btnalert,btndismiss;


    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrp.findViewById(R.id.rdogroup);
        spncountry = findViewById(R.id.spnContry);
        btnsubmit = findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =rdGrp.getCheckedRadioButtonId();
                rtngender = findViewById(id);
                Toast.makeText(MainActivity.this, rtngender.getText().toString(), Toast.LENGTH_SHORT).show();
                String country = spncountry.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "Country:" + "<br/> gender:"+ rtngender.getText().toString(),Toast.LENGTH_SHORT).show();

                final Dialog dialog = new Dialog(context);


            }
        });

        //Bundle bundle = getIntent().getExtras();
       // String name =bundle.getString("name");


        //txtWelcome = findViewById(R.id.textView);
       // txtWelcome.setText("Welcome,"+name);
    }
}