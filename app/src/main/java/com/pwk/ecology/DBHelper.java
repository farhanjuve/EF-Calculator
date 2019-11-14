package com.pwk.ecology;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.pwk.ecology.Mod.dataModelAdapter;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "ecology2.db";
    public static final String TABLE_NAME = "ecology_table";
    public static final String COL_1 = "id";
    public static final String COL_2 = "nama";
    public static final String COL_3 = "luas";
    public static final String COL_4 = "jml_penduduk";
    public static final String COL_5 = "jml_kk";
    public static final String COL_6 = "padi";
    private static final String COL_7 = "ton_padi";
    private static final String COL_8 = "jagung";
    private static final String COL_9 = "ton_jagung";
    private static final String COL_10 = "kkedelai";
    private static final String COL_11 = "ton_kkedelai";
    private static final String COL_12 = "ktanah";
    private static final String COL_13 = "ton_ktanah";
    private static final String COL_14 = "khijau";
    private static final String COL_15 = "ton_khijau";
    private static final String COL_16 = "ubikayu";
    private static final String COL_17 = "ton_ubikayu";
    private static final String COL_18 = "ubijalar";
    private static final String COL_19 = "ton_ubijalar";
    private static final String COL_20 = "gula";
    private static final String COL_21 = "ton_gula";
    private static final String COL_22 = "padang_rumput";
    private static final String COL_23 = "semak_belukar";
    private static final String COL_24 = "lahan_kering";
    private static final String COL_25 = "kebun";
    private static final String COL_26 = "ton_daging";
    private static final String COL_27 = "ton_telur";
    private static final String COL_28 = "ton_susu";
    private static final String COL_29 = "luas_sungai";
    private static final String COL_30 = "luas_waduk";
    private static final String COL_31 = "luas_laut";
    private static final String COL_32 = "luas_kolam";
    private static final String COL_33 = "ton_ikanTawar";
    private static final String COL_34 = "ton_ikanLaut";
    private static final String COL_35 = "luas_hutanProduk";
    private static final String COL_36 = "luas_hutanRaky";
    private static final String COL_37 = "luas_hutanLind";
    private static final String COL_38 = "ton_kayu";
    private static final String COL_39 = "Jumlah_Kendaraan_Kecil";
    private static final String COL_40 = "Jumlah_Kendaraan_Besar";
    private static final String COL_41 = "Jumlah_Rumah_Tangga_KK";
    private static final String COL_42 = "Listrik_Rumah_Tangga";
    private static final String COL_43 = "Listrik_Industri";
    private static final String COL_44 = "Listrik_Banguan_Sosial";
    private static final String COL_45 = "Listrik_Bangunan_Komersial";

    private static final String TAG = "DBHelper";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nama TEXT, luas INTEGER, jml_penduduk INTEGER, jml_kk INTEGER, padi INTEGER, " +
                "ton_padi INTEGER, jagung INTEGER, ton_jagung INTEGER, kkedelai INTEGER, " +
                "ton_kkedelai INTEGER, ktanah INTEGER, ton_ktanah INTEGER, khijau INTEGER, " +
                "ton_khijau INTEGER, ubikayu INTEGER, ton_ubikayu INTEGER, ubijalar INTEGER, " +
                "ton_ubijalar INTEGER, gula INTEGER, ton_gula INTEGER, " +
                "padang_rumput INTEGER, semak_belukar INTEGER, lahan_kering INTEGER, kebun INTEGER, " +
                "ton_daging INTEGER, ton_telur INTEGER, ton_susu INTEGER, luas_sungai INTEGER, " +
                "luas_waduk INTEGER, luas_laut INTEGER, luas_kolam INTEGER, ton_ikanTawar INTEGER, " +
                "ton_ikanLaut INTEGER, luas_hutanProduk INTEGER, luas_hutanRaky INTEGER, " +
                "luas_hutanLind INTEGER, ton_kayu INTEGER, Jumlah_Kendaraan_Kecil INTEGER, " +
                "Jumlah_Kendaraan_Besar INTEGER, Jumlah_Rumah_Tangga_KK INTEGER, Listrik_Rumah_Tangga INTEGER, " +
                "Listrik_Industri INTEGER, Listrik_Banguan_Sosial INTEGER, Listrik_Bangunan_Komersial INTEGER)"
        );
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String nama, String luas, String penduduk, String kk, String padi,
                              String padi2, String jagung, String jagung2, String kkedelai, String
                              kkedelai2, String ktanah, String ktanah2, String khijau, String khijau2,
                              String ubikayu, String ubikayu2, String ubijalar, String ubijalar2,
                              String gula, String gula2, String rumput, String semak, String kering,
                              String kebun, String ton_daging, String ton_telur, String ton_susu,
                              String aaa, String bbb, String ccc, String ddd, String eee, String fff,
                              String ggg, String hhh, String iii, String jjj, String kkk, String lll,
                              String mmm, String nnn, String ooo, String ppp, String qqq){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2, nama);
        int luass = Integer.parseInt(luas);
        cv.put(COL_3, luass);
        int pendudukk = Integer.parseInt(penduduk);
        cv.put(COL_4, pendudukk);
        cv.put(COL_5, Integer.parseInt(kk));
        cv.put(COL_6, Integer.parseInt(padi));
        cv.put(COL_7, Integer.parseInt(padi2));
        cv.put(COL_8, Integer.parseInt(jagung));
        cv.put(COL_9, Integer.parseInt(jagung2));
        cv.put(COL_10, Integer.parseInt(kkedelai));
        cv.put(COL_11, Integer.parseInt(kkedelai2));
        cv.put(COL_12, Integer.parseInt(ktanah));
        cv.put(COL_13, Integer.parseInt(ktanah2));
        cv.put(COL_14, Integer.parseInt(khijau));
        cv.put(COL_15, Integer.parseInt(khijau2));
        cv.put(COL_16, Integer.parseInt(ubikayu));
        cv.put(COL_17, Integer.parseInt(ubikayu2));
        cv.put(COL_18, Integer.parseInt(ubijalar));
        cv.put(COL_19, Integer.parseInt(ubijalar2));
        cv.put(COL_20, Integer.parseInt(gula));
        cv.put(COL_21, Integer.parseInt(gula2));
        cv.put(COL_22, Integer.parseInt(rumput));
        cv.put(COL_23, Integer.parseInt(semak));
        cv.put(COL_24, Integer.parseInt(kering));
        cv.put(COL_25, Integer.parseInt(kebun));
        cv.put(COL_26, Integer.parseInt(ton_daging));
        cv.put(COL_27, Integer.parseInt(ton_telur));
        cv.put(COL_28, Integer.parseInt(ton_susu));
        cv.put(COL_29, Integer.parseInt(aaa));
        cv.put(COL_30, Integer.parseInt(bbb));
        cv.put(COL_31, Integer.parseInt(ccc));
        cv.put(COL_32, Integer.parseInt(ddd));
        cv.put(COL_33, Integer.parseInt(eee));
        cv.put(COL_34, Integer.parseInt(fff));
        cv.put(COL_35, Integer.parseInt(ggg));
        cv.put(COL_36, Integer.parseInt(hhh));
        cv.put(COL_37, Integer.parseInt(iii));
        cv.put(COL_38, Integer.parseInt(jjj));
        cv.put(COL_39, Integer.parseInt(kkk));
        cv.put(COL_40, Integer.parseInt(lll));
        cv.put(COL_41, Integer.parseInt(mmm));
        cv.put(COL_42, Integer.parseInt(nnn));
        cv.put(COL_43, Integer.parseInt(ooo));
        cv.put(COL_44, Integer.parseInt(ppp));
        cv.put(COL_45, Integer.parseInt(qqq));

        long result = db.insert(TABLE_NAME, null, cv);
        if(result == -1){
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<dataModelAdapter> getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        ArrayList<dataModelAdapter> storeData = new ArrayList<>();
        if(res.moveToFirst()){
            do {
                int id = Integer.parseInt(res.getString(0));
                String nama = res.getString(1);
                String luas = res.getString(2);
                String penduduk = res.getString(3);
                String kk = res.getString(4);

                /*Pertanian*/
                double sum_lahan_pertanian = res.getDouble(5) + res.getDouble(7)
                        + res.getDouble(9) + res.getDouble(11) + res.getDouble(13)
                        + res.getDouble(15) + res.getDouble(17) + res.getDouble(19);
                double sum_produk_pertanian = res.getDouble(6) + res.getDouble(8)
                        + res.getDouble(10) + res.getDouble(12) + res.getDouble(14)
                        + res.getDouble(16) + res.getDouble(18) + res.getDouble(20);
                    // Penyediaan
                double pny_tani1 = res.getDouble(6) * (100-7.3) / 100*62.7 / 100 * (100-3.33) / 100;
                double pny_tani2 = res.getDouble(8) * 0.89;
                double pny_tani3 = res.getDouble(10) * 94.66/100;
                double pny_tani4 = res.getDouble(12) * 86.49/100;
                double pny_tani5 = res.getDouble(14) * 0.2;
                double pny_tani6 = res.getDouble(16) * 95.87/100;
                double pny_tani7 = res.getDouble(18) * 0.88;
                double pny_tani8 = res.getDouble(20) * 9.02/100;
                double sum_pny_tani = pny_tani1 + pny_tani2 + pny_tani3 + pny_tani4 + pny_tani5 +
                        pny_tani6 + pny_tani7 + pny_tani8;
                    // Konsumsi
                double kons_tani_1 = res.getDouble(3) * 0.097;
                double kons_tani_2 = res.getDouble(3) * 1.5/1000;
                double kons_tani_3 = res.getDouble(3) * 10.2/1000;
                double kons_tani_4 = res.getDouble(3) * 0.1/1000;
                double kons_tani_5 = res.getDouble(3) * 0.2/1000;
                double kons_tani_6 = res.getDouble(3) * 6.3/1000;
                double kons_tani_7 = res.getDouble(3) * 0.001;
                double kons_tani_8 = res.getDouble(3) * 0.011;
                double sum_kons_tani = kons_tani_1 + kons_tani_2 + kons_tani_3 + kons_tani_4 +
                        kons_tani_5 + kons_tani_6 + kons_tani_7 + kons_tani_8;

                /*Peternakan*/
                double sum_lahan_peternakan = res.getDouble(21) + res.getDouble(22)
                        + res.getDouble(23) + res.getDouble(24);
                double sum_produk_peternakan = res.getDouble(25) + res.getDouble(26)
                        + res.getDouble(27);
                    // Penyediaan
                double pny_ternak1 = res.getDouble(25) * 0.95;
                double pny_ternak2 = res.getDouble(26) * 97.5/100;
                double pny_ternak3 = res.getDouble(27) * 84.3/100;
                double sum_pny_ternak = pny_ternak1 + pny_ternak2 + pny_ternak3;
                    // Konsumsi
                double kons_ternak1 = res.getDouble(3) * 5.6/1000;
                double kons_ternak2 = res.getDouble(3) * 0.006;
                double kons_ternak3 = res.getDouble(3) * 2.1/1000;
                double sum_kons_ternak = kons_ternak1 + kons_ternak2 + kons_ternak3;

                /*Perikanan*/
                double sum_lahan_perikanan = res.getDouble(28) + res.getDouble(29)
                        + res.getDouble(30) + res.getDouble(31);
                double sum_produk_perikanan = res.getDouble(32) + res.getDouble(33);
                    // Penyediaan
                double pny_ikan1 = res.getDouble(32) * 0.97;
                double pny_ikan2 = res.getDouble(33) * 0.97;
                double sum_pny_ikan = pny_ikan1 + pny_ikan2;
                    // Konsumsi
                double kons_ikan1 = res.getDouble(3) * 9.3/1000;
                double kons_ikan2 = res.getDouble(3) * 9.3/1000;
                double sum_kons_ikan = kons_ikan1 + kons_ikan2;

                /*Perhutanan*/
                double sum_lahan_kehutanan = res.getDouble(34) + res.getDouble(35)
                        + res.getDouble(36);
                double hutan_produksi_m3 = (res.getDouble(34) + res.getDouble(35)) * 450;
                double tegakan_m3 = hutan_produksi_m3 - res.getDouble(37);

                /*Emisi*/
                    // Kendaraan
                double emisi_kend_kecil_tahun = res.getDouble(38) * 150.42;
                double kend_kecil_co2 = emisi_kend_kecil_tahun * 82.97/1000;
                double emisi_kend_besar_tahun = res.getDouble(39) * 2930.3;
                double kend_besar_co2 = emisi_kend_besar_tahun * 74.1/1000;
                double sum_co2_kend = kend_kecil_co2 + kend_besar_co2;
                    // Gas Rumah Tangga
                double emisi_rt = res.getDouble(40) * 36;
                double emisi_co2_rt = emisi_rt * 63.1;
                    // Gas Listrik
                double sum_penggunaan_listrik = res.getDouble(41) + res.getDouble(42)
                        + res.getDouble(43) + res.getDouble(44);
                double emisi_listrik_rt = res.getDouble(41) * 0.725/1000;
                double emisi_listrik_industri = res.getDouble(42) * 0.725/1000;
                double emisi_listrik_sosial = res.getDouble(43) * 0.725/1000;
                double emisi_listrik_komersial = res.getDouble(44) * 0.725/1000;
                double sum_co2_listrik = emisi_listrik_rt + emisi_listrik_industri +
                        emisi_listrik_sosial + emisi_listrik_komersial;
                double sum_co2 = sum_co2_kend + emisi_co2_rt + sum_co2_listrik;
                double daya_rosot = sum_co2 / 4.241;

                /*Kesimpulan*/
                double luas_lahan_terbangun = res.getDouble(2) - sum_lahan_pertanian - sum_lahan_peternakan - sum_lahan_perikanan - sum_lahan_kehutanan;
                    // Yield Region
                double yr_tani = sum_pny_tani/sum_lahan_pertanian;
                double yr_ternak = sum_pny_ternak/sum_lahan_peternakan;
                double yr_ikan = sum_pny_ikan/sum_lahan_perikanan;
                double yr_hutan = tegakan_m3/(res.getDouble(34) + res.getDouble(35));
                double yr_karbon = tegakan_m3 / sum_lahan_kehutanan;
                double yr_terbangun = sum_pny_tani/sum_lahan_pertanian;
                    // Yield Factor
                double yf_tani = yr_tani/7.3043;
                double yf_ternak = yr_ternak/6.19;
                double yf_ikan = yr_ikan/503.836;
                double yf_hutan = yr_hutan/1.8188;
                double yf_karbon = yr_karbon/1.8188;
                double yf_terbangun = yr_terbangun/7.3043; /*?*/
                    // Biokapasitas
                double bioA = sum_lahan_pertanian * yf_tani * 2.52;
                double bioB = sum_lahan_peternakan * yf_ternak * 0.46;
                double bioC = sum_lahan_perikanan * yf_ikan * 0.37;
                double bioD = sum_lahan_kehutanan * yf_hutan * 1.29;
                double bioE = sum_lahan_pertanian + sum_lahan_peternakan * yf_karbon * 1.29;
                double bioF = luas_lahan_terbangun * yf_terbangun * 2.52;
                    // Telapak Ekologis
                double teA = sum_kons_tani/yr_tani * yf_tani * 2.52;
                double teB = sum_kons_ternak/yr_ternak * yf_ternak * 0.46;
                double teC = sum_kons_ikan/yr_ikan * yf_ikan * 0.37;
                double teD = res.getDouble(37)/yr_hutan * yf_hutan * 1.29;
                double teE = daya_rosot * 1.29;
                double teF = bioF;
                double sum_te = teA + teB + teC +teD +teE + teF;
                    // Defisit Ekologis
                double deA = bioA - teA;
                double deB = bioB - teB;
                double deC = bioC - teC;
                double deD = bioD - teD;
                double deE = bioE - teE;
                double deF = bioF - teF;
                double sum_de = deA + deB + deC + deD + deE + deF;
                double prosentase_de = sum_de/sum_te + 100;

                DecimalFormat df = new DecimalFormat("#.##");

                Log.d(TAG, "getAllData: " + sum_pny_ikan + " dibagi : " + sum_kons_ternak + " " +
                        kons_tani_8 + " HABIS " + pny_tani4 + " " + pny_tani5 + " " + pny_tani6 +
                        " " + pny_tani7 + " " + pny_tani8);
                storeData.add(new dataModelAdapter(id, nama, luas, penduduk, kk,
                        String.valueOf(df.format(sum_lahan_pertanian)),
                        String.valueOf(df.format(sum_produk_pertanian)),
                        String.valueOf(df.format(sum_lahan_peternakan)),
                        String.valueOf(df.format(sum_produk_peternakan)),
                        String.valueOf(df.format(sum_lahan_perikanan)),
                        String.valueOf(df.format(sum_produk_perikanan)),
                        String.valueOf(df.format(sum_lahan_kehutanan)),
                        String.valueOf(df.format(sum_co2)),
                        String.valueOf(df.format(daya_rosot)),
                        String.valueOf(df.format(sum_te)),
                        String.valueOf(df.format(sum_de)),
                        String.valueOf(df.format(prosentase_de)),
                        String.valueOf(df.format(bioA)),
                        String.valueOf(df.format(bioB)),
                        String.valueOf(df.format(bioC)),
                        String.valueOf(df.format(bioD)),
                        String.valueOf(df.format(bioE)),
                        String.valueOf(df.format(bioF)),
                        String.valueOf(df.format(teA)),
                        String.valueOf(df.format(teB)),
                        String.valueOf(df.format(teC)),
                        String.valueOf(df.format(teD)),
                        String.valueOf(df.format(teE)),
                        String.valueOf(df.format(teF)),
                        String.valueOf(df.format(deA)),
                        String.valueOf(df.format(deB)),
                        String.valueOf(df.format(deC)),
                        String.valueOf(df.format(deD)),
                        String.valueOf(df.format(deE)),
                        String.valueOf(df.format(deF))));
            } while (res.moveToNext());
        }
        res.close();
        return storeData;
    }

    public void deleteData(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COL_1	+ "	= ?", new String[] { String.valueOf(id)});
    }
}
