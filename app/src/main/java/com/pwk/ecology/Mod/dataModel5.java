package com.pwk.ecology.Mod;

public class dataModel5 {
    private String hutan_produksi;
    private String hutan_rakyat;
    private String hutan_lindung;
    private String ton_kayu;

    public dataModel5(String hutan_produksi, String hutan_rakyat, String hutan_lindung, String ton_kayu) {
        this.hutan_produksi = hutan_produksi;
        this.hutan_rakyat = hutan_rakyat;
        this.hutan_lindung = hutan_lindung;
        this.ton_kayu = ton_kayu;
    }

    public String getHutan_produksi() {
        return hutan_produksi;
    }

    public String getHutan_rakyat() {
        return hutan_rakyat;
    }

    public String getHutan_lindung() {
        return hutan_lindung;
    }

    public String getTon_kayu() {
        return ton_kayu;
    }
}
