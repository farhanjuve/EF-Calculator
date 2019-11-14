package com.pwk.ecology.Mod;

import android.os.Parcel;
import android.os.Parcelable;

public class dataModelAdapter implements Parcelable {

    public dataModelAdapter(Integer id, String nama, String luas, String penduduk, String kk, String lahanPertanian, String produkPertanian, String lahanPeternakan, String produkPeternakan, String lahanPerikanan, String produkPerikanan, String lahanKehutanan, String totalEmisiKeseluruhan, String dayaRosot, String sum_te, String sum_de, String prosentase, String bioA, String bioB, String bioC, String bioD, String bioE, String bioF, String teA, String teB, String teC, String teD, String teE, String teF, String deA, String deB, String deC, String deD, String deE, String deF) {
        this.id = id;
        this.nama = nama;
        this.luas = luas;
        this.penduduk = penduduk;
        this.kk = kk;
        this.lahanPertanian = lahanPertanian;
        this.produkPertanian = produkPertanian;
        this.lahanPeternakan = lahanPeternakan;
        this.produkPeternakan = produkPeternakan;
        this.lahanPerikanan = lahanPerikanan;
        this.produkPerikanan = produkPerikanan;
        this.lahanKehutanan = lahanKehutanan;
        this.totalEmisiKeseluruhan = totalEmisiKeseluruhan;
        this.dayaRosot = dayaRosot;
        this.sum_te = sum_te;
        this.sum_de = sum_de;
        this.prosentase = prosentase;
        this.bioA = bioA;
        this.bioB = bioB;
        this.bioC = bioC;
        this.bioD = bioD;
        this.bioE = bioE;
        this.bioF = bioF;
        this.teA = teA;
        this.teB = teB;
        this.teC = teC;
        this.teD = teD;
        this.teE = teE;
        this.teF = teF;
        this.deA = deA;
        this.deB = deB;
        this.deC = deC;
        this.deD = deD;
        this.deE = deE;
        this.deF = deF;
    }

    private Integer id;
    private String nama;
    private String luas;
    private String penduduk;
    private String kk;
    private String lahanPertanian;
    private String produkPertanian;
    private String lahanPeternakan;
    private String produkPeternakan;
    private String lahanPerikanan;
    private String produkPerikanan;
    private String lahanKehutanan;
    private String totalEmisiKeseluruhan;
    private String dayaRosot;
    private String sum_te;
    private String sum_de;
    private String prosentase;
    private String bioA;
    private String bioB;
    private String bioC;
    private String bioD;
    private String bioE;
    private String bioF;
    private String teA;
    private String teB;
    private String teC;
    private String teD;
    private String teE;
    private String teF;
    private String deA;
    private String deB;
    private String deC;
    private String deD;
    private String deE;
    private String deF;

    protected dataModelAdapter(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        nama = in.readString();
        luas = in.readString();
        penduduk = in.readString();
        kk = in.readString();
        lahanPertanian = in.readString();
        produkPertanian = in.readString();
        lahanPeternakan = in.readString();
        produkPeternakan = in.readString();
        lahanPerikanan = in.readString();
        produkPerikanan = in.readString();
        lahanKehutanan = in.readString();
        totalEmisiKeseluruhan = in.readString();
        dayaRosot = in.readString();
        sum_te = in.readString();
        sum_de = in.readString();
        prosentase = in.readString();
        bioA = in.readString();
        bioB = in.readString();
        bioC = in.readString();
        bioD = in.readString();
        bioE = in.readString();
        bioF = in.readString();
        teA = in.readString();
        teB = in.readString();
        teC = in.readString();
        teD = in.readString();
        teE = in.readString();
        teF = in.readString();
        deA = in.readString();
        deB = in.readString();
        deC = in.readString();
        deD = in.readString();
        deE = in.readString();
        deF = in.readString();
    }

    public static final Creator<dataModelAdapter> CREATOR = new Creator<dataModelAdapter>() {
        @Override
        public dataModelAdapter createFromParcel(Parcel in) {
            return new dataModelAdapter(in);
        }

        @Override
        public dataModelAdapter[] newArray(int size) {
            return new dataModelAdapter[size];
        }
    };

    public Integer getId() {
        return id;
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

    public String getLahanPertanian() {
        return lahanPertanian;
    }

    public String getProdukPertanian() {
        return produkPertanian;
    }

    public String getLahanPeternakan() {
        return lahanPeternakan;
    }

    public String getProdukPeternakan() {
        return produkPeternakan;
    }

    public String getLahanPerikanan() {
        return lahanPerikanan;
    }

    public String getProdukPerikanan() {
        return produkPerikanan;
    }

    public String getLahanKehutanan() {
        return lahanKehutanan;
    }

    public String getTotalEmisiKeseluruhan() {
        return totalEmisiKeseluruhan;
    }

    public String getDayaRosot() {
        return dayaRosot;
    }

    public String getSum_te() {
        return sum_te;
    }

    public String getSum_de() {
        return sum_de;
    }

    public String getProsentase() {
        return prosentase;
    }

    public String getBioA() {
        return bioA;
    }

    public String getBioB() {
        return bioB;
    }

    public String getBioC() {
        return bioC;
    }

    public String getBioD() {
        return bioD;
    }

    public String getBioE() {
        return bioE;
    }

    public String getBioF() {
        return bioF;
    }

    public String getTeA() {
        return teA;
    }

    public String getTeB() {
        return teB;
    }

    public String getTeC() {
        return teC;
    }

    public String getTeD() {
        return teD;
    }

    public String getTeE() {
        return teE;
    }

    public String getTeF() {
        return teF;
    }

    public String getDeA() {
        return deA;
    }

    public String getDeB() {
        return deB;
    }

    public String getDeC() {
        return deC;
    }

    public String getDeD() {
        return deD;
    }

    public String getDeE() {
        return deE;
    }

    public String getDeF() {
        return deF;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeString(nama);
        dest.writeString(luas);
        dest.writeString(penduduk);
        dest.writeString(kk);
        dest.writeString(lahanPertanian);
        dest.writeString(produkPertanian);
        dest.writeString(lahanPeternakan);
        dest.writeString(produkPeternakan);
        dest.writeString(lahanPerikanan);
        dest.writeString(produkPerikanan);
        dest.writeString(lahanKehutanan);
        dest.writeString(totalEmisiKeseluruhan);
        dest.writeString(dayaRosot);
        dest.writeString(sum_te);
        dest.writeString(sum_de);
        dest.writeString(prosentase);
        dest.writeString(bioA);
        dest.writeString(bioB);
        dest.writeString(bioC);
        dest.writeString(bioD);
        dest.writeString(bioE);
        dest.writeString(bioF);
        dest.writeString(teA);
        dest.writeString(teB);
        dest.writeString(teC);
        dest.writeString(teD);
        dest.writeString(teE);
        dest.writeString(teF);
        dest.writeString(deA);
        dest.writeString(deB);
        dest.writeString(deC);
        dest.writeString(deD);
        dest.writeString(deE);
        dest.writeString(deF);
    }
}
