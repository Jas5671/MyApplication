package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginAcitivity<Edittext> extends AppCompatActivity {
    Button nextButton;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acitivity);

        getSupportActionBar().setTitle("Login Here");
        nextButton = findViewById(R.id.btnnext);
        editName = findViewById(R.id.editName);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(LoginAcitivity.this,MainActivity.class);
                intent.putExtra("name", editName.getText().toString());
                startActivity(intent);
            }
        });
    }
}