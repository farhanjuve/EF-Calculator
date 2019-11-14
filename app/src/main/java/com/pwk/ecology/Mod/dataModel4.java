package com.pwk.ecology.Mod;

public class dataModel4 {
    private String sungai;
    private String waduk;
    private String laut;
    private String kolam_budidaya;
    private String ton_ikantawar;
    private String ton_ikanlaut;

    public dataModel4(String sungai, String waduk, String laut, String kolam_budidaya, String ton_ikantawar, String ton_ikanlaut) {
        this.sungai = sungai;
        this.waduk = waduk;
        this.laut = laut;
        this.kolam_budidaya = kolam_budidaya;
        this.ton_ikantawar = ton_ikantawar;
        this.ton_ikanlaut = ton_ikanlaut;
    }

    public String getSungai() {
        return sungai;
    }

    public String getWaduk() {
        return waduk;
    }

    public String getLaut() {
        return laut;
    }

    public String getKolam_budidaya() {
        return kolam_budidaya;
    }

    public String getTon_ikantawar() {
        return ton_ikantawar;
    }

    public String getTon_ikanlaut() {
        return ton_ikanlaut;
    }
}
