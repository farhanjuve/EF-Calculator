package com.pwk.ecology;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class editor_4 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    View rootView;
    private SharedViewModel vm;

    EditText et1, et2, et3, et4, et5, et6;

    public editor_4() {
    }

    public static editor_4 newInstance(String param1, String param2) {
        editor_4 fragment = new editor_4();
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_editor_4, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        assert view != null;

        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        et1 = (EditText) view.findViewById(R.id.luas_sungai);
        et1.setText("0");
        et2 = (EditText) getView().findViewById(R.id.luas_waduk);
        et2.setText("0");
        et3 = (EditText) getView().findViewById(R.id.luas_laut);
        et3.setText("0");
        et4 = (EditText) getView().findViewById(R.id.luas_kolam);
        et4.setText("0");
        et5 = (EditText) getView().findViewById(R.id.ton_ikantawar);
        et5.setText("0");
        et6 = (EditText) getView().findViewById(R.id.ton_ikanlaut);
        et6.setText("0");
    }

    @Override
    public void onStop() {
        Log.d("editor_4Fragment", "onStop");
        super.onStop();
        String aa = et1.getText().toString();
        String bb = et2.getText().toString();
        String cc = et3.getText().toString();
        String dd = et4.getText().toString();
        String ee = et5.getText().toString();
        String ff = et6.getText().toString();
        passData4(aa, bb, cc, dd, ee, ff);
    }

    public void passData4(String aa, String bb, String cc, String dd, String ee, String
            ff) {
        vm.setEco4(aa, bb, cc, dd, ee, ff);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
