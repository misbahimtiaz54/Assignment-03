package com.example.assignment3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e;
    EditText p;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.email);
        p=(EditText)findViewById(R.id.pass);
        b=(Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals("") || p.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "INVALID", Toast.LENGTH_LONG).show();
                }
                else {
                    String email;
                    String password;
                    Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("email",e.getText().toString());
                    intent.putExtra("password", p.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

}