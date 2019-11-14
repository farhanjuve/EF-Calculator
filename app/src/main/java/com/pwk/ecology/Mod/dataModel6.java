package com.pwk.ecology.Mod;

public class dataModel6 {
    private String kend_kecil;
    private String kend_besar;
    private String jml_rmhtgg;
    private String listrik_rmhtgg;
    private String listrik_industri;
    private String listrik_sosial;
    private String listrik_komersil;

    public dataModel6(String kend_kecil, String kend_besar, String jml_rmhtgg, String listrik_rmhtgg, String listrik_industri, String listrik_sosial, String listrik_komersil) {
        this.kend_kecil = kend_kecil;
        this.kend_besar = kend_besar;
        this.jml_rmhtgg = jml_rmhtgg;
        this.listrik_rmhtgg = listrik_rmhtgg;
        this.listrik_industri = listrik_industri;
        this.listrik_sosial = listrik_sosial;
        this.listrik_komersil = listrik_komersil;
    }

    public String getKend_kecil() {
        return kend_kecil;
    }

    public String getKend_besar() {
        return kend_besar;
    }

    public String getJml_rmhtgg() {
        return jml_rmhtgg;
    }

    public String getListrik_rmhtgg() {
        return listrik_rmhtgg;
    }

    public String getListrik_industri() {
        return listrik_industri;
    }

    public String getListrik_sosial() {
        return listrik_sosial;
    }

    public String getListrik_komersil() {
        return listrik_komersil;
    }
}
