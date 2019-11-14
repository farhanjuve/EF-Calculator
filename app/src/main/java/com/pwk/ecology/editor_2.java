package com.pwk.ecology;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class editor_2 extends Fragment{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    View rootView;
    private SharedViewModel vm;

    dataDiri hh;
    EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16;

    public editor_2() {
    }

    public static editor_2 newInstance(String param1, String param2) {
        editor_2 fragment2 = new editor_2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment2.setArguments(args);
        return fragment2;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
/*        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_editor_2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        assert view != null;
        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        et1 = (EditText) view.findViewById(R.id.luas_padii);
        et1.setText("0");
        et2 = (EditText) getView().findViewById(R.id.ton_padi);
        et2.setText("0");
        et3 = (EditText) getView().findViewById(R.id.luas_jagung);
        et3.setText("0");
        et4 = (EditText) getView().findViewById(R.id.ton_jagung);
        et4.setText("0");
        et5 = (EditText) getView().findViewById(R.id.luas_kedelai);
        et5.setText("0");
        et6 = (EditText) getView().findViewById(R.id.ton_kedelai);
        et6.setText("0");
        et7 = (EditText) getView().findViewById(R.id.luas_kacangtanah);
        et7.setText("0");
        et8 = (EditText) getView().findViewById(R.id.ton_kacangtanah);
        et8.setText("0");
        et9 = (EditText) getView().findViewById(R.id.luas_kacanghijau);
        et9.setText("0");
        et10 = (EditText) getView().findViewById(R.id.ton_kacanghijau);
        et10.setText("0");
        et11 = (EditText) getView().findViewById(R.id.luas_ubi);
        et11.setText("0");
        et12 = (EditText) getView().findViewById(R.id.ton_ubi);
        et12.setText("0");
        et13 = (EditText) getView().findViewById(R.id.luas_jalar);
        et13.setText("0");
        et14 = (EditText) getView().findViewById(R.id.ton_jalar);
        et14.setText("0");
        et15 = (EditText) getView().findViewById(R.id.luas_gula);
        et15.setText("0");
        et16 = (EditText) getView().findViewById(R.id.ton_gula);
        et16.setText("0");
    }

    @Override
    public void onStop() {
        Log.d("editor_2","onStop2 Called");
        super.onStop();
        String aa = et1.getText().toString();
        String bb = et2.getText().toString();
        String cc = et3.getText().toString();
        String dd = et4.getText().toString();
        String ee = et5.getText().toString();
        String ff = et6.getText().toString();
        String gg = et7.getText().toString();
        String ha = et8.getText().toString();
        String ii = et9.getText().toString();
        String jj = et10.getText().toString();
        String kk = et11.getText().toString();
        String ll = et12.getText().toString();
        String mm = et13.getText().toString();
        String nn = et14.getText().toString();
        String oo = et15.getText().toString();
        String pp = et16.getText().toString();
        passData2(aa, bb, cc, dd, ee, ff, gg, ha, ii, jj, kk, ll, mm, nn, oo, pp);
    }
    public void passData2(String aa, String bb, String cc, String dd, String ee, String
            ff, String gg, String ha, String ii, String jj, String kk, String ll,
                          String mm, String nn, String oo, String pp) {
        vm.setEco2(aa, bb, cc, dd, ee, ff, gg, ha, ii, jj, kk, ll, mm, nn, oo, pp);
    }
/*    public void passData2(Editable aa, Editable bb, Editable cc, Editable dd, Editable ee, Editable
            ff, Editable gg, Editable ha, Editable ii, Editable jj, Editable kk, Editable ll,
                         Editable mm, Editable nn, Editable oo, Editable pp) {
        hh.lahan_padi(aa);
        hh.ton_padi(bb);
        hh.lahan_jagung(cc);
        hh.ton_jagung(dd);
        hh.lahan_kacangkedelai(ee);
        hh.ton_kacangkedelai(ff);
        hh.lahan_kacangtanah(gg);
        hh.ton_kacangtanah(ha);
        hh.lahan_kacanghijau(ii);
        hh.ton_kacanghijau(jj);
        hh.lahan_ubikayu(kk);
        hh.ton_ubikayu(ll);
        hh.lahan_ubijalar(mm);
        hh.ton_ubijalar(nn);
        hh.lahan_gula(oo);
        hh.ton_gula(pp);
    }*/

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
