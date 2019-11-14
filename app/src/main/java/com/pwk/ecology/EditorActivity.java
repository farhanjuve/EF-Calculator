package com.pwk.ecology;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.pwk.ecology.Mod.dataModel;
import com.pwk.ecology.Mod.dataModel2;
import com.pwk.ecology.Mod.dataModel3;
import com.pwk.ecology.Mod.dataModel4;
import com.pwk.ecology.Mod.dataModel5;
import com.pwk.ecology.Mod.dataModel6;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import github.chenupt.springindicator.SpringIndicator;

public class EditorActivity extends AppCompatActivity implements
        FirstFragment.OnFragmentInteractionListener,
        SecondFragment.OnFragmentInteractionListener,
        editor_2.OnFragmentInteractionListener,
        editor_3.OnFragmentInteractionListener,
        editor_4.OnFragmentInteractionListener,
        editor_5.OnFragmentInteractionListener,
        editor_6.OnFragmentInteractionListener,
        editor_7.OnFragmentInteractionListener,
        dataDiri {
    FragmentPagerAdapter adapterViewPager;
    private SharedViewModel vm;
    dataDiri hh;

    ImageButton mNextBtn, mSkipBtn;
    static Button mFinishBtn;

    String text, luas_wil, jml_kk, jml_penduduk, padi, padi2, jagung, jagung2, kkedelai, kkedelai2;
    String ktanah, ktanah2, khijau, khijau2, ubikayu, ubikayu2, ubijalar, ubijalar2, gula, gula2;
    String rumput, semak, kering, kebun, ton_daging, ton_telur, ton_susu;
    String sungai, waduk, laut, kolam, ikan_tawar, ikan_laut, produksi, rakyat, lindung, ton_kayu;
    String kend_kecil, kend_besar, jml_rmhtgg, listrik_rmhtgg, listrik_industri, listrik_sosial, listrik_komersil;
    DBHelper myDB;

    static int page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editor33);

        myDB = new DBHelper(this);
        final ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);

        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

        vpPager.setCurrentItem(page);
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mSkipBtn.setVisibility(page == 0 ? View.GONE : View.VISIBLE);
                mNextBtn.setVisibility(page == 8 ? View.GONE : View.VISIBLE);
                mFinishBtn.setVisibility(page == 8 ? View.VISIBLE : View.GONE);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        DotsIndicator dotsIndicator = findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(vpPager);

        mNextBtn = (ImageButton) findViewById(R.id.intro_btn_next);
        mSkipBtn = (ImageButton) findViewById(R.id.intro_btn_skip);
        mFinishBtn = (Button) findViewById(R.id.intro_btn_finish);

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page += 1;
                Log.d("++", "onClick: next" + page);
                Log.d("++", "onClick: next" + text);
                vpPager.setCurrentItem(page, true);
            }
        });

        mSkipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page -= 1;
                Log.d("--", "onClick: skip" + page);
                vpPager.setCurrentItem(page, true);
            }
        });

        mFinishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
                ScrollingActivity.btnRefresh.performClick();
            }
        });
        hh = (dataDiri) this;
        vm = ViewModelProviders.of(this).get(SharedViewModel.class);
        vm.getEcology().observe(this, new Observer<dataModel>() {
            @Override
            public void onChanged(dataModel dm) {
                if (dm != null) {
                    hh.nama_kab(dm.getNama());
                    hh.luas_wil(dm.getLuas());
                    hh.jml_penduduk(dm.getPenduduk());
                    hh.jml_kk(dm.getKk());
                }
            }
        });
        vm.getEco2().observe(this, new Observer<dataModel2>() {
            @Override
            public void onChanged(dataModel2 dm2) {
                if(dm2 != null){
                    hh.lahan_padi(dm2.getLahan_padi());
                    hh.ton_padi(dm2.getTon_padi());
                    hh.lahan_jagung(dm2.getLahan_jagung());
                    hh.ton_jagung(dm2.getTon_jagung());
                    hh.lahan_kacangkedelai(dm2.getLahan_kacangkedelai());
                    hh.ton_kacangkedelai(dm2.getTon_kacangkedelai());
                    hh.lahan_kacangtanah(dm2.getLahan_kacangtanah());
                    hh.ton_kacangtanah(dm2.getTon_kacangtanah());
                    hh.lahan_kacanghijau(dm2.getLahan_kacanghijau());
                    hh.ton_kacanghijau(dm2.getTon_kacanghijau());
                    hh.lahan_ubikayu(dm2.getLahan_ubikayu());
                    hh.ton_ubikayu(dm2.getTon_ubikayu());
                    hh.lahan_ubijalar(dm2.getLahan_ubijalar());
                    hh.ton_ubijalar(dm2.getTon_ubijalar());
                    hh.lahan_gula(dm2.getLahan_gula());
                    hh.ton_gula(dm2.getTon_gula());
                }
            }
        });
        vm.getEco3().observe(this, new Observer<dataModel3>() {
            @Override
            public void onChanged(dataModel3 dm3) {
                if(dm3 != null){
                    hh.lahan_rumput(dm3.getRumput());
                    hh.semak_belukar(dm3.getSemak());
                    hh.lahan_kering(dm3.getKering());
                    hh.kebun(dm3.getKebun());
                    hh.ton_daging(dm3.getTon_daging());
                    hh.ton_telur(dm3.getTon_telur());
                    hh.ton_susu(dm3.getTon_susu());
                }
            }
        });
        vm.getEco4().observe(this, new Observer<dataModel4>() {
            @Override
            public void onChanged(dataModel4 dm4) {
                if(dm4 != null){
                    hh.luas_sungai(dm4.getSungai());
                    hh.luas_waduk(dm4.getWaduk());
                    hh.luas_laut(dm4.getLaut());
                    hh.luas_kolam(dm4.getKolam_budidaya());
                    hh.ton_ikantawar(dm4.getTon_ikantawar());
                    hh.ton_ikanlaut(dm4.getTon_ikanlaut());
                }
            }
        });
        vm.getEco5().observe(this, new Observer<dataModel5>() {
            @Override
            public void onChanged(dataModel5 dm5) {
                if(dm5 != null){
                    hh.luas_hutanProduk(dm5.getHutan_produksi());
                    hh.luas_hutanRaky(dm5.getHutan_rakyat());
                    hh.luas_hutanLindu(dm5.getHutan_lindung());
                    hh.ton_kayu(dm5.getTon_kayu());
                }
            }
        });
        vm.getEco6().observe(this, new Observer<dataModel6>() {
            @Override
            public void onChanged(dataModel6 dm6) {
                if(dm6 != null){
                    hh.jml_kendKecil(dm6.getKend_kecil());
                    hh.jml_kendBesar(dm6.getKend_besar());
                    hh.jml_rmhtgg_kk(dm6.getJml_rmhtgg());
                    hh.jml_listrik_rmhtgg(dm6.getListrik_rmhtgg());
                    hh.jml_listrik_industri(dm6.getListrik_industri());
                    hh.jml_listrik_sosial(dm6.getListrik_sosial());
                    hh.jml_listrik_komersial(dm6.getListrik_komersil());
                }
            }
        });
    }

    public void insertData(){
        String[] aa = getMyData();
        boolean isInserted = myDB.insertData(aa[0], aa[1], aa[2], aa[3], aa[4], aa[5], aa[6],
                aa[7], aa[8], aa[9], aa[10], aa[11], aa[12], aa[13], aa[14], aa[15], aa[16],
                aa[17], aa[18], aa[19], aa[20], aa[21], aa[22], aa[23], aa[24], aa[25], aa[26],
                aa[27], aa[28], aa[29], aa[30], aa[31], aa[32], aa[33], aa[34], aa[35], aa[36],
                aa[37], aa[38], aa[39], aa[40], aa[41], aa[42], aa[43]);
        if (isInserted == true){
            finish();
            Toast.makeText(EditorActivity.this, "Data berhasil disimpan",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(EditorActivity.this, "Gagal disimpan",
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void nama_kab(String  nama) {
        this.text= String.valueOf(nama);
        Log.d("JALAN", "JALAN" + text);
    }

    @Override
    public void luas_wil(String wilayah) {
        String zz = String.valueOf(wilayah);
        this.luas_wil = zz;
        Log.d("JALAN", "JALAN" + luas_wil);
    }

    @Override
    public void jml_penduduk(String penduduk) {
        String x = String.valueOf(penduduk);
        this.jml_penduduk = x;
        Log.d("JALAN", "JALAN" + jml_penduduk);
    }

    @Override
    public void jml_kk(String kk) {
        String z = String.valueOf(kk);
        this.jml_kk = z;
        Log.d("JALAN", "JALAN" + jml_kk);
    }

    @Override
    public void lahan_padi(String lPadi) {
        String aa = String.valueOf(lPadi);
        this.padi = aa;
        Log.d("JALAN", "lpadi" + padi);
    }

    @Override
    public void ton_padi(String tpadi) {
        this.padi2 = String.valueOf(tpadi);
    }

    @Override
    public void lahan_jagung(String lJagung) {
        this.jagung = String.valueOf(lJagung);
    }

    @Override
    public void ton_jagung(String tjagung) {
        this.jagung2 = String.valueOf(tjagung);
    }

    @Override
    public void lahan_kacangkedelai(String lkacangkedelai) {
        this.kkedelai = String.valueOf(lkacangkedelai);
    }

    @Override
    public void ton_kacangkedelai(String tkacangkedelai) {
        this.kkedelai2 = String.valueOf(tkacangkedelai);
    }

    @Override
    public void lahan_kacangtanah(String lkacangtanah) {
        this.ktanah = String.valueOf(lkacangtanah);
    }

    @Override
    public void ton_kacangtanah(String tkacangtanah) {
        this.ktanah2 = String.valueOf(tkacangtanah);
    }

    @Override
    public void lahan_kacanghijau(String lkacanghijau) {
        this.khijau = String.valueOf(lkacanghijau);
    }

    @Override
    public void ton_kacanghijau(String tkacanghijau) {
        this.khijau2 = String.valueOf(tkacanghijau);
    }

    @Override
    public void lahan_ubikayu(String lubikayu) {
        this.ubikayu = String.valueOf(lubikayu);
    }

    @Override
    public void ton_ubikayu(String tubikayu) {
        this.ubikayu2 = String.valueOf(tubikayu);
    }

    @Override
    public void lahan_ubijalar(String lubijalar) {
        this.ubijalar = String.valueOf(lubijalar);
    }

    @Override
    public void ton_ubijalar(String tubijalar) {
        this.ubijalar2 = String.valueOf(tubijalar);
    }

    @Override
    public void lahan_gula(String lgula) {
        this.gula = String.valueOf(lgula);
    }

    @Override
    public void ton_gula(String tgula) {
        this.gula2 = String.valueOf(tgula);
    }

    @Override
    public void lahan_rumput(String lrumput) {
        this.rumput = String.valueOf(lrumput);
    }

    @Override
    public void semak_belukar(String sbelukar) {
        this.semak = String.valueOf(sbelukar);
    }

    @Override
    public void lahan_kering(String lkering) {
        this.kering = String.valueOf(lkering);
    }

    @Override
    public void kebun(String kebun) {
        this.kebun = String.valueOf(kebun);
    }

    @Override
    public void ton_daging(String tdaging) {
        this.ton_daging = String.valueOf(tdaging);
    }

    @Override
    public void ton_telur(String ttelur) {
        this.ton_telur = String.valueOf(ttelur);
    }

    @Override
    public void ton_susu(String tsusu) {
        this.ton_susu = String.valueOf(tsusu);
    }

    @Override
    public void luas_sungai(String sungai) {
        this.sungai = String.valueOf(sungai);
    }

    @Override
    public void luas_waduk(String waduk) {
        this.waduk = String.valueOf(waduk);
    }

    @Override
    public void luas_laut(String laut) {
        this.laut = String.valueOf(laut);
    }

    @Override
    public void luas_kolam(String kolam) {
        this.kolam = String.valueOf(kolam);
    }

    @Override
    public void ton_ikantawar(String tikanLaut) {
        this.ikan_tawar = String.valueOf(tikanLaut);
    }

    @Override
    public void ton_ikanlaut(String tikanLaut) {
        this.ikan_laut = String.valueOf(tikanLaut);
    }

    @Override
    public void luas_hutanProduk(String produksi) {
        this.produksi = String.valueOf(produksi);
    }

    @Override
    public void luas_hutanRaky(String rakyat) {
        this.rakyat = String.valueOf(rakyat);
    }

    @Override
    public void luas_hutanLindu(String lindung) {
        this.lindung = String.valueOf(lindung);
    }

    @Override
    public void ton_kayu(String tkayu) {
        this.ton_kayu = String.valueOf(tkayu);
    }

    @Override
    public void jml_kendKecil(String kecil) {
        this.kend_kecil = String.valueOf(kecil);
    }

    @Override
    public void jml_kendBesar(String besar) {
        this.kend_besar = String.valueOf(besar);
    }

    @Override
    public void jml_rmhtgg_kk(String rmhkk) {
        this.jml_rmhtgg = String.valueOf(rmhkk);
    }

    @Override
    public void jml_listrik_rmhtgg(String rmhtgg) {
        this.listrik_rmhtgg = String.valueOf(rmhtgg);
    }

    @Override
    public void jml_listrik_industri(String indus) {
        this.listrik_industri = String.valueOf(indus);
    }

    @Override
    public void jml_listrik_sosial(String sos) {
        this.listrik_sosial = String.valueOf(sos);
    }

    @Override
    public void jml_listrik_komersial(String komer) {
        this.listrik_komersil = String.valueOf(komer);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 8;

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return FirstFragment.newInstance("0", "Page # 1");
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return editor_2.newInstance("1", "Page # 2");
                case 2: // Fragment # 1 - This will show SecondFragment
                    return editor_3.newInstance("2", "Page # 3");
                case 3:
                    return editor_4.newInstance("3","");
                case 4:
                    return editor_5.newInstance("4","");
                case 5:
                    return editor_6.newInstance("5", "Page REVIEW");
                case 6:
                    return editor_7.newInstance("6","");
                case 7:
                    return SecondFragment.newInstance("","");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
    }

/*    void onTextChanged(CharSequence text){
        this.text=text;
        //Receive new text here
    }*/

    public String[] getMyData() {
        String ar[] = new String[44];
        ar[0] = text;
        ar[1] = luas_wil;
        ar[2] = jml_penduduk;
        ar[3] = jml_kk;
        ar[4] = padi;
        ar[5] = padi2;
        ar[6] = jagung;
        ar[7] = jagung2;
        ar[8] = kkedelai;
        ar[9] = kkedelai2;
        ar[10]= ktanah;
        ar[11]= ktanah2;
        ar[12]= khijau;
        ar[13]= khijau2;
        ar[14]= ubikayu;
        ar[15]= ubikayu2;
        ar[16]= ubijalar;
        ar[17]= ubijalar2;
        ar[18]= gula;
        ar[19]= gula2;
        ar[20]= rumput;
        ar[21]= semak;
        ar[22]= kering;
        ar[23]= kebun;
        ar[24]= ton_daging;
        ar[25]= ton_telur;
        ar[26]= ton_susu;
        ar[27]= sungai;
        ar[28]= waduk;
        ar[29]= laut;
        ar[30]= kolam;
        ar[31]= ikan_tawar;
        ar[32]= ikan_laut;
        ar[33]= produksi;
        ar[34]= rakyat;
        ar[35]= lindung;
        ar[36]= ton_kayu;
        ar[37] = kend_kecil;
        ar[38] = kend_besar;
        ar[39] = jml_rmhtgg;
        ar[40] = listrik_rmhtgg;
        ar[41] = listrik_industri;
        ar[42] = listrik_sosial;
        ar[43] = listrik_komersil;
        return ar;
    }

}
