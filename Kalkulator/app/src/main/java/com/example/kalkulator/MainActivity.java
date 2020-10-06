package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_hapus, btn_tambah, btn_kurang, btn_kali, btn_bagi;
    EditText edit_1, edit_2;
    TextView text_hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hapus = findViewById(R.id.btn_hapus);
        btn_kurang = findViewById(R.id.btn_kurang);
        btn_kali = findViewById(R.id.btn_kali);
        btn_tambah = findViewById(R.id.btn_tambah);
        btn_bagi = findViewById(R.id.btn_bagi);
        edit_1 = findViewById(R.id.edit_angka1);
        edit_2 = findViewById(R.id.edit_angka2);
        text_hasil = findViewById(R.id.text_hasil);
    }

    public void hapus(View view) {
        edit_1.setText("");
        edit_2.setText("");
        text_hasil.setText("");
    }

    public void hitung(int pilihan){
        if (edit_1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Isikan Angka Pertama",Toast.LENGTH_LONG).show();
        }else if (edit_2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Isikan Angka Kedua", Toast.LENGTH_LONG).show();
        }else{
            double satu = Double.parseDouble(edit_1.getText().toString());
            double dua = Double.parseDouble(edit_2.getText().toString());
            switch (pilihan){
                case 1 :
                    text_hasil.setText(Double.toString(satu+dua));
                    break;
                case 2 :
                    text_hasil.setText(Double.toString(satu-dua));
                    break;
                case 3 :
                    text_hasil.setText(Double.toString(satu*dua));
                    break;
                case 4 :
                    text_hasil.setText(Double.toString(satu/dua));
                    break;
                default:
                    Toast.makeText(getApplicationContext(),"Pilihan Tidak Tersedia",Toast.LENGTH_LONG).show();
            }

        }
    }

    public void tambah(View view) {
        hitung(1);
    }

    public void kurang(View view) {
        hitung(2);
    }

    public void kali(View view) {
        hitung(3);
    }

    public void bagi(View view) {
        hitung(4);
    }
}