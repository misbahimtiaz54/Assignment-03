package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity3 extends AppCompatActivity {

    String countries[] = {"Argentina","Angola","Australia","Afghanistan","Armenia","America", "Albania", "Algeria","Brazil", "Bahrain", "Barbados","Bangladesh","Belgium", "Canada","China", "Cyprus","Comoros","Croatia",
            "Denmark","Dominica","Djibouti","Democratic Republic ", "Egypt","Eritrea","Ethiopia","Estonia","Ecuador", "Fiji","France", "Finland",
            "Grenada","Georgia","Germany", "Greece", "Honduras","Hungary","Haiti","Iraq","Israel", "Iran", "India",  "Italy", "Jamaica","Japan", "Jordan", "Kenya","Kiribati", "Kuwait", "Kazakhstan",
            "Libya", "Lebanon","Laos","Lithuania", "Mongolia","Malta","Monaco","Malawi", "Maldives","Netherlands","Nauru","Norway", "Nepal", "Nigeria",
            "Oman","Poland", "Pakistan", "Philippines","Panama","Portugal", "Qatar","Rwanda", "Romaina", "Russia","Saint Lucia","Singapore", "Saudia Arabia", "Spain", "Syria","South Africa","Sudan",
           "Tonga","Tajikistan","Tuvalu","Thailand", "Togo", "Tanzania", "Turkey", "United Kingdom","Uganda","United Arab Emirates","Uruguay", "Uzebekistan","Vietnam","Vanuatu", "Venezuela",
            "Wurttemberg", "Western Sahara","Wallis ","Xina(china)","Xipre(cyprus)","Yemen","Yūgosurabia", "Zambia", "Zimbabwe"};
    TextView country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String flag = getIntent().getStringExtra("flag");

        country = (TextView) findViewById(R.id.country);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        ListView listview = (ListView) findViewById(R.id.listView1);
        for (String c : countries) {
            if (c.startsWith(flag)) {
                country.append(c + "\n");
            }
        }
    }
}