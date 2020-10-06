package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsimpan,btnreset;
    TextView text_nama, text_alamat;
    EditText editnama,editalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_nama = findViewById(R.id.text_nama);
        text_alamat = findViewById(R.id.text_alamat);
        editnama = findViewById(R.id.edit_nama);
        editalamat = findViewById(R.id.edit_alamat);
        btnsimpan = findViewById(R.id.btn_simpan);
        btnreset = findViewById(R.id.btn_reset);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama, alamat;
                if (editnama.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Silahkan Isikan Nama", Toast.LENGTH_LONG).show();
                    text_nama.requestFocus();
                }else if (editalamat.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Silahkan Isikan Alamat", Toast.LENGTH_LONG).show();
                    text_alamat.requestFocus();
                }else{
                    nama = editnama.getText().toString();
                    alamat = editalamat.getText().toString();
                    Toast.makeText(MainActivity.this,"Selamat Datang "+nama+" dari "+alamat, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void reset(View view) {
        editalamat.setText("");
        editnama.setText("");
    }
}