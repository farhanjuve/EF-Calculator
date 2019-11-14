package com.pwk.ecology;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link editor_6.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link editor_6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class editor_6 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button btn1;
    EditText et1, et2, et3, et4, et5, et6, et7;
    private SharedViewModel vm;

    private OnFragmentInteractionListener mListener;

    public editor_6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment editor_6.
     */
    // TODO: Rename and change types and number of parameters
    public static editor_6 newInstance(String param1, String param2) {
        editor_6 fragment = new editor_6();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        assert view != null;

        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        et1 = (EditText) view.findViewById(R.id.jml_kendaraankecil);
        et1.setText("0");
        et2 = (EditText) getView().findViewById(R.id.jml_kendaraanbesar);
        et2.setText("0");
        et3 = (EditText) getView().findViewById(R.id.jml_rumah_tangga);
        et3.setText("0");
        et4 = (EditText) getView().findViewById(R.id.ed_listrik_rm);
        et4.setText("0");
        et5 = (EditText) getView().findViewById(R.id.ed_listrik_industri);
        et5.setText("0");
        et6 = (EditText) getView().findViewById(R.id.ed_listrik_bangunanSos);
        et6.setText("0");
        et7 = (EditText) getView().findViewById(R.id.ed_listrik_bangunanKom);
        et7.setText("0");
    }

    @Override
    public void onStop() {
        super.onStop();
        String aa = et1.getText().toString();
        String bb = et2.getText().toString();
        String cc = et3.getText().toString();
        String dd = et4.getText().toString();
        String ee = et5.getText().toString();
        String ff = et6.getText().toString();
        String gg = et7.getText().toString();
        Log.d("editor_6Fragment", "onStop " + aa);
        passData6(aa, bb, cc, dd, ee, ff, gg);
    }

    public void passData6(String aa, String bb, String cc, String dd, String ee, String ff, String gg) {
        vm.setEco6(aa, bb, cc, dd, ee, ff, gg);
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("editor_6", "onStart");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
