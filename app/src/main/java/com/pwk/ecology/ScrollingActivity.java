package com.pwk.ecology;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pwk.ecology.Mod.dataModel;
import com.pwk.ecology.Mod.dataModelAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity implements dataAdapter.onNoteListener {

    private static final String TAG = "ScrollingActivity";

    private ArrayList<dataModelAdapter> modelList;
    private RecyclerView rc;
    private dataAdapter adapter;
    private DBHelper mDatabase;
    private TextView tanda, tanda2;
    static Button btnRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.content_scrolling, null);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Intent aa = new Intent(this, EditorActivity.class);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(aa);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rc = findViewById(R.id.recycleer_view);
        rc.setLayoutManager(layoutManager);
        rc.setHasFixedSize(true);
        rc.setNestedScrollingEnabled(false);
        mDatabase = new DBHelper(this);
        modelList = mDatabase.getAllData();
        tanda = findViewById(R.id.tandaa);
        tanda2 = findViewById(R.id.tanda1);
        if(modelList.size() > 0){
            rc.setVisibility(View.VISIBLE);
            tanda.setVisibility(View.GONE);
            tanda2.setVisibility(View.GONE);
            adapter = new dataAdapter(this, modelList, this);
            Toast.makeText(this, "Ada data", Toast.LENGTH_SHORT).show();
            rc.setAdapter(adapter);
        } else{
            rc.setVisibility(View.GONE);
            tanda.setVisibility(View.VISIBLE);
            tanda2.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Tidak ada data", Toast.LENGTH_SHORT).show();
        }
        btnRefresh = findViewById(R.id.refresh1);
        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRestart();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Contact developer : farhanjuve@gmail.com", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent i = new Intent(this, ScrollingActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onNoteClick(int position) {
        Log.d(TAG, "onNoteClick: " + position);
        final dataModelAdapter dm = modelList.get(position);
        Intent ii = new Intent(this, DetailActivity.class);
        ii.putExtra("Data Utama", dm);
        startActivity(ii);
    }
}
