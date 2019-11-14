package com.pwk.ecology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.pwk.ecology.Mod.dataModelAdapter;

public class DetailActivity extends AppCompatActivity {
    TextView tvs1, tvs2, tvs3, tvs4, tvs5, tvs6, tvs7, tvs8, tvs9, tvs10, tvs11, tvs12, tvs13;
    TextView tvs14, tvs15, tvs16, tvs17, tvs18, tvs19;
    TextView tvs20, tvs21, tvs22, tvs23, tvs24, tvs25;
    TextView tvs26, tvs27, tvs28, tvs29, tvs30, tvs31, tvs32, tvs33, tvs34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent aa = getIntent();
        dataModelAdapter dm = aa.getParcelableExtra("Data Utama");

        setContentView(R.layout.activity_detail);
        tvs1 = findViewById(R.id.tvs_1);
        tvs1.setText(dm.getNama());
        tvs2 = findViewById(R.id.a1);
        tvs2.setText(dm.getLuas());
        tvs3 = findViewById(R.id.a2);
        tvs3.setText(dm.getPenduduk());
        tvs4 = findViewById(R.id.a3);
        tvs4.setText(dm.getKk());
        tvs5 = findViewById(R.id.a4);
        tvs5.setText(dm.getLahanPertanian());
        tvs6 = findViewById(R.id.a5);
        tvs6.setText(dm.getProdukPertanian());
        tvs7 = findViewById(R.id.a6);
        tvs7.setText(dm.getLahanPeternakan());
        tvs8 = findViewById(R.id.a7);
        tvs8.setText(dm.getProdukPeternakan());
        tvs9 = findViewById(R.id.a8);
        tvs9.setText(dm.getLahanPerikanan());
        tvs10 = findViewById(R.id.a9);
        tvs10.setText(dm.getProdukPerikanan());
        tvs11 = findViewById(R.id.a10);
        tvs11.setText(dm.getLahanKehutanan());
        tvs12 = findViewById(R.id.a11);
        tvs12.setText(dm.getTotalEmisiKeseluruhan());
        tvs13 = findViewById(R.id.a12);
        tvs13.setText(dm.getDayaRosot());
        tvs14 = findViewById(R.id.a13);
        tvs14.setText(dm.getBioA());
        tvs15 = findViewById(R.id.a14);
        tvs15.setText(dm.getBioB());
        tvs16 = findViewById(R.id.a15);
        tvs16.setText(dm.getBioC());
        tvs17 = findViewById(R.id.a16);
        tvs17.setText(dm.getBioD());
        tvs18 = findViewById(R.id.a17);
        tvs18.setText(dm.getBioE());
        tvs19 = findViewById(R.id.a18);
        tvs19.setText(dm.getBioF());

        tvs20 = findViewById(R.id.a19);
        tvs20.setText(dm.getTeA());
        tvs21 = findViewById(R.id.a20);
        tvs21.setText(dm.getTeB());
        tvs22 = findViewById(R.id.a21);
        tvs22.setText(dm.getTeC());
        tvs23 = findViewById(R.id.a22);
        tvs23.setText(dm.getTeD());
        tvs24 = findViewById(R.id.a23);
        tvs24.setText(dm.getTeE());
        tvs25 = findViewById(R.id.a24);
        tvs25.setText(dm.getTeF());

        tvs26 = findViewById(R.id.a25);
        tvs26.setText(dm.getDeA());
        tvs27 = findViewById(R.id.a26);
        tvs27.setText(dm.getDeB());
        tvs28 = findViewById(R.id.a27);
        tvs28.setText(dm.getDeC());
        tvs29 = findViewById(R.id.a28);
        tvs29.setText(dm.getDeD());
        tvs30 = findViewById(R.id.a29);
        tvs30.setText(dm.getDeE());
        tvs31 = findViewById(R.id.a30);
        tvs31.setText(dm.getDeF());

        tvs32 = findViewById(R.id.a31);
        tvs32.setText(dm.getSum_te());
        tvs33 = findViewById(R.id.a32);
        tvs33.setText(dm.getSum_de());
        tvs34 = findViewById(R.id.a33);
        tvs34.setText(dm.getProsentase());
    }
}
