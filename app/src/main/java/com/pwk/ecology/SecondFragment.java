package com.pwk.ecology;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.pwk.ecology.Mod.dataModel;
import com.pwk.ecology.Mod.dataModel2;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SecondFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    private SharedViewModel vm;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private static final String TAG = "SecondFragment";

    private OnFragmentInteractionListener mListener;

    TextInputEditText tv1, tv2, tv3, tv4;
    static Button btnRefresh;
    View rootView;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
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
        rootView = inflater.inflate(R.layout.fragment_second, container, false);
/*        btnRefresh = rootView.findViewById(R.id.refresh);
        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                refresh();
            }
        });*/

        return rootView;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: ");
        tv1 = getView().findViewById(R.id.hasilnama);
        tv2 = getView().findViewById(R.id.hasilluas);
        tv3 = getView().findViewById(R.id.hasil_review3);
        tv4 = getView().findViewById(R.id.hasil_review4);
        EditorActivity.page=7;
/*        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                EditorActivity.mFinishBtn.performClick();
            }
        }, 3000);*/

//        btnRefresh = (Button) getView().findViewById(R.id.refresh);
//        btnRefresh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditorActivity ea = (EditorActivity)getActivity();
//                String[] myData = ea.getMyData();
//                tv1.setText(myData[0]);
//                tv2.setText(myData[1]);
//            }
//        });

//        EditorActivity ea = (EditorActivity)getActivity();
//        String[] myData = ea.getMyData();
//        tv1.setText(myData[0]);
//        tv2.setText(myData[1]);


        vm = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        vm.getEcology().observe(getViewLifecycleOwner(), new Observer<dataModel>() {
            @Override
            public void onChanged(dataModel dm) {
                if (dm != null) {
                    tv1.setText(dm.getNama());
                    tv2.setText(dm.getLuas());
                    tv3.setText(dm.getPenduduk());
                    tv4.setText(dm.getKk());
                }
            }
        });
/*        vm.getEco2().observe(getViewLifecycleOwner(), new Observer<dataModel2>() {
            @Override
            public void onChanged(dataModel2 dm2) {
                if(dm2 != null){
                    tv4.setText(dm2.getLahan_padi());
                }
            }
        });*/
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void refresh(){
        EditorActivity ea = (EditorActivity)getActivity();
        String[] myData = ea.getMyData();

        tv1.setText(myData[0]);
        tv2.setText(myData[1]);
        tv3.setText(myData[2]);
    }

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
