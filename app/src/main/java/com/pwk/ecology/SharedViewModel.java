package com.pwk.ecology;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pwk.ecology.Mod.dataModel;
import com.pwk.ecology.Mod.dataModel2;
import com.pwk.ecology.Mod.dataModel3;
import com.pwk.ecology.Mod.dataModel4;
import com.pwk.ecology.Mod.dataModel5;
import com.pwk.ecology.Mod.dataModel6;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<dataModel> ecology = new MutableLiveData<>();
    private MutableLiveData<dataModel2> eco2 = new MutableLiveData();
    private MutableLiveData<dataModel3> eco3 = new MutableLiveData();
    private MutableLiveData<dataModel4> eco4 = new MutableLiveData();
    private MutableLiveData<dataModel5> eco5 = new MutableLiveData();
    private MutableLiveData<dataModel6> eco6 = new MutableLiveData();


    public void setEcology(String input, String bb, String cc, String dd) {
        ecology.setValue(new dataModel(input, bb, cc, dd));
    }

    public void setEco2(String aa, String bb, String cc, String dd, String ee, String
            ff, String gg, String ha, String ii, String jj, String kk, String ll,
                        String mm, String nn, String oo, String pp) {
        eco2.setValue(new dataModel2(aa, bb, cc, dd, ee, ff, gg, ha, ii, jj, kk, ll, mm, nn, oo, pp));
    }

    public void setEco3(String aa, String bb, String cc, String dd, String ee, String
            ff, String gg) {
        eco3.setValue(new dataModel3(aa, bb, cc, dd, ee, ff, gg));
    }

    public void setEco4(String aa, String bb, String cc, String dd, String ee, String
            ff) {
        eco4.setValue(new dataModel4(aa, bb, cc, dd, ee, ff));
    }

    public void setEco5(String aa, String bb, String cc, String dd) {
        eco5.setValue(new dataModel5(aa, bb, cc, dd));
    }

    public void setEco6(String aa, String bb, String cc, String dd, String ee, String
            ff, String gg) {
        eco6.setValue(new dataModel6(aa, bb, cc, dd, ee, ff, gg));
    }

    public LiveData<dataModel> getEcology(){
        return ecology;
    }

    public LiveData<dataModel2> getEco2(){
        return eco2;
    }

    public LiveData<dataModel3> getEco3() {
        return eco3;
    }

    public LiveData<dataModel4> getEco4() {
        return eco4;
    }

    public LiveData<dataModel5> getEco5() {
        return eco5;
    }

    public LiveData<dataModel6> getEco6() {
        return eco6;
    }
}
