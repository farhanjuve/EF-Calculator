package com.pwk.ecology.Mod;

public class dataModel3 {
    private String rumput;
    private String semak;
    private String kering;
    private String kebun;
    private String ton_daging;
    private String ton_telur;
    private String ton_susu;

    public dataModel3(String rumput, String semak, String kering, String kebun, String ton_daging, String ton_telur, String ton_susu) {
        this.rumput = rumput;
        this.semak = semak;
        this.kering = kering;
        this.kebun = kebun;
        this.ton_daging = ton_daging;
        this.ton_telur = ton_telur;
        this.ton_susu = ton_susu;
    }

    public String getRumput() {
        return rumput;
    }

    public String getSemak() {
        return semak;
    }

    public String getKering() {
        return kering;
    }

    public String getKebun() {
        return kebun;
    }

    public String getTon_daging() {
        return ton_daging;
    }

    public String getTon_telur() {
        return ton_telur;
    }

    public String getTon_susu() {
        return ton_susu;
    }
}
