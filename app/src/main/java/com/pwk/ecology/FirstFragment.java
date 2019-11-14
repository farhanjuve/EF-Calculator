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

import com.google.android.material.textfield.TextInputEditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FirstFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    private SharedViewModel vm;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

//    EditText et1, et2, et3, et4;
    TextInputEditText tie1, tie2, tie3, tie4;
    View rootView;

    dataDiri hh;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
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
        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        rootView = inflater.inflate(R.layout.item, container, false);
/*        et1 = rootView.findViewById(R.id.nama_kabupaten);
        et2 = rootView.findViewById(R.id.luas_wilayah);
        et2.setText("0");
        et3 = rootView.findViewById(R.id.jml_penduduk);
        et3.setText("0");
        et4 = rootView.findViewById(R.id.jml_kk);
        et4.setText("0");*/

        tie1 = rootView.findViewById(R.id.kota);
        tie2 = rootView.findViewById(R.id.luas_wilayah);
        tie3 = rootView.findViewById(R.id.jml_penduduk);
        tie4 = rootView.findViewById(R.id.jml_kk);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
    }

/*    public void passData(Editable aa, Editable bb, Editable cc, Editable dd) {
        hh.nama_kab(aa);
        hh.luas_wil(bb);
        hh.jml_penduduk(cc);
        hh.jml_kk(dd);
    }*/

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FirstFragment", "onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FirstFragment", "onPause");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        hh = (dataDiri) context;
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onStop() {
        super.onStop();
        String aa = tie1.getText().toString();
        String bb = tie2.getText().toString();
        String cc = tie3.getText().toString();
        String dd = tie4.getText().toString();
        Log.d("firstfrag","onStop1 Called " + aa + " " + bb);
        passData(aa, bb, cc, dd);

    }

    public void passData(String aa, String bb, String cc, String dd) {
        Log.d("passData","passData Called " + aa + " " + bb);
        vm.setEcology(aa, bb, cc, dd);
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
