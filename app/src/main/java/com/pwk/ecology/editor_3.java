package com.pwk.ecology;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class editor_3 extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    EditText et1, et2, et3, et4, et5, et6, et7;

    View rootView;
    private SharedViewModel vm;

    public editor_3() {
    }

    public static editor_3 newInstance(String param1, String param2) {
        editor_3 fragment = new editor_3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        assert view != null;

        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        et1 = (EditText) view.findViewById(R.id.luas_rumput);
        et1.setText("0");
        et2 = (EditText) getView().findViewById(R.id.luas_semak);
        et2.setText("0");
        et3 = (EditText) getView().findViewById(R.id.luas_kering);
        et3.setText("0");
        et4 = (EditText) getView().findViewById(R.id.luas_kebun);
        et4.setText("0");
        et5 = (EditText) getView().findViewById(R.id.ton_daging);
        et5.setText("0");
        et6 = (EditText) getView().findViewById(R.id.ton_telur);
        et6.setText("0");
        et7 = (EditText) getView().findViewById(R.id.ton_susu);
        et7.setText("0");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("editor_3Fragment", "onStop");
        String aa = et1.getText().toString();
        String bb = et2.getText().toString();
        String cc = et3.getText().toString();
        String dd = et4.getText().toString();
        String ee = et5.getText().toString();
        String ff = et6.getText().toString();
        String gg = et7.getText().toString();
        passData3(aa, bb, cc, dd, ee, ff, gg);
    }

    public void passData3(String aa, String bb, String cc, String dd, String ee, String
            ff, String gg) {
        vm.setEco3(aa, bb, cc, dd, ee, ff, gg);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_editor_3, container, false);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
