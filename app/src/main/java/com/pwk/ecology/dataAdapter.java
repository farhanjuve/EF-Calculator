package com.pwk.ecology;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.pwk.ecology.Mod.dataModel;
import com.pwk.ecology.Mod.dataModelAdapter;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class dataAdapter extends RecyclerView.Adapter<dataAdapter.dataHolder> implements RecyclerView.OnItemTouchListener {
    private final Context context;
    private ArrayList<dataModelAdapter> getAllData;

    private onNoteListener monNoteListener;

    private DBHelper mDatabase;

    public dataAdapter(Context context, ArrayList<dataModelAdapter> getAllData, onNoteListener onl) {
        this.context = context;
        this.getAllData = getAllData;
        this.mDatabase = new DBHelper(context);
        this.monNoteListener = onl;
    }

    @NonNull
    @Override
    public dataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent,
                false);
        return new dataHolder(itemView, monNoteListener);
    }
    @Override
    public void onBindViewHolder(@NonNull dataAdapter.dataHolder holder, int position) {
        final dataModelAdapter dm = getAllData.get(position);
        holder.tv_kota.setText(dm.getNama());
        holder.tv_luas.setText(dm.getSum_te());
        holder.tv_penduduk.setText(dm.getSum_de());
        holder.tv_kk.setText(dm.getProsentase());
        holder.tv_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog myQuittingDialogBox = new AlertDialog.Builder(context)
                        //set message, title, and icon
                        .setTitle("Hapus")
                        .setMessage("Yakin akan menghapus data ini?")
                        .setIcon(R.drawable.ic_delete_black_24dp)

                        .setPositiveButton("Delete", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int whichButton) {
                                //your deleting code
                                mDatabase.deleteData(dm.getId());
                                Toast.makeText(context, "Hapus",
                                        Toast.LENGTH_LONG).show();

                                //refresh the activity page.
                                ((Activity)context).finish();
                                context.startActivity(((Activity) context).getIntent());
                                dialog.dismiss();
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.dismiss();
                            }
                        })
                        .create();
                myQuittingDialogBox.show();
            }
        });
        holder.tv_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                viewItem()
            }
        });
    }

    @Override
    public int getItemCount() {
        return (getAllData != null) ? getAllData.size() : 0;
    }

    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }

    class dataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        onNoteListener onl;

        private TextView tv_kota;
        private TextView tv_luas;
        private TextView tv_penduduk;
        private TextView tv_kk;
        private TextView tv_hapus;
        private TextView tv_detail;

        public dataHolder(View itemView, onNoteListener onl) {
            super(itemView);
            tv_kota = itemView.findViewById(R.id.tv_kota);
            tv_luas = itemView.findViewById(R.id.tv_info1);
            tv_penduduk = itemView.findViewById(R.id.tv_info2);
            tv_kk = itemView.findViewById(R.id.tv_info3);
            tv_hapus = itemView.findViewById(R.id.tv_hapus);
            tv_detail = itemView.findViewById(R.id.tv_detail);
            this.onl = onl;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onl.onNoteClick(getAdapterPosition());

        }
    }

    public interface onNoteListener{
        void onNoteClick(int position);
    }
}
