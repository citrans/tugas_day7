package com.example.datalist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list1;
    String[] menu = new String[]{"Soto Ayam","Soto Babat", "Bakso", "Mie Ayam",
    "Soto Lamongan", "Bebek Goreng", "Bebek Bakar", "Mie Pangsit", "Nasi Goreng",
    "Mie Goreng", "Mie Rebus", "Mie Nyemek", "Nasi Pecel", "Ayam Lodho", "Es Teh",
    "Es Jeruk", "Kopi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List Menu Warung Sederhana");

        list1 = findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, android.R.id.text1, menu);

        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Memilih : "+menu[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}