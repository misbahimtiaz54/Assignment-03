package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String flag[];
    TextView msg;
    String emails[]={"a@gmail.com","b@gmail.com","c@gmail.com","d@gmail.com","e@gmail.com","f@gmail.com","g@gmail.com","h@gmail.com","i@gmail.com","j@gmail.com"};
    String passwords[]={"acom","bcom","ccom","dcom","ecom","fcom","gcom","hcom","icom","jcom"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg = (TextView) findViewById(R.id.msg);
        String emails = getIntent().getStringExtra("email");
        String passwords = getIntent().getStringExtra("password");
        if((emails.equals("a@gmail.com") && passwords.equals("acom")) || (emails.equals("b@gmail.com") && passwords.equals("bcom")) || (emails.equals("c@gmail.com") && passwords.equals("com"))
                || (emails.equals("d@gmail.com") && passwords.equals("dcom")) || (emails.equals("e@gmail.com") && passwords.equals("ecom")) || (emails.equals("f@gmail.com") && passwords.equals("fcom"))
                || (emails.equals("g@gmail.com") && passwords.equals("gcom")) || (emails.equals("h@gmail.com") && passwords.equals("hcom")) || (emails.equals("i@gmail.com") && passwords.equals("icom"))
                || (emails.equals("j@gmail.com") && passwords.equals("jcom")))
        {

            flag=getResources().getStringArray(R.array.alphabets);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, flag);
            GridView gridview = (GridView) findViewById(R.id.gridView1);
            gridview.setAdapter(adapter);
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id)
                {
                    Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("flag",flag[position]);
                    startActivity(intent);
                }
            });
        }

         else
         {
             msg.setText("INVALID E-MAIL OR PASSWORD");
        }
    }


}
