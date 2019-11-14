package com.pwk.ecology.Mod;

public class dataModel {
    public dataModel(String nama, String luas, String penduduk, String kk) {
        this.nama = nama;
        this.luas = luas;
        this.penduduk = penduduk;
        this.kk = kk;
    }

    public String getNama() {
        return nama;
    }

    public String getLuas() {
        return luas;
    }

    public String getPenduduk() {
        return penduduk;
    }

    public String getKk() {
        return kk;
    }
    private String nama;
    private String luas;
    private String penduduk;
    private String kk;

}
