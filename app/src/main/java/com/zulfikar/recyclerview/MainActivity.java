package com.zulfikar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Abdurahman Zain Hamim", "1731710011", "085123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Aditya Eka Pradana", "1731710110", "089987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ahmad Zulfikar Rizaldi", "1731710171", "085987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Ananda Nur Juliansyah", "1731710111", "081098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Bawazir Fadhil Muhammad", "1731710311", "081097758124"));
        mahasiswaArrayList.add(new Mahasiswa("Choirul Adriansyah", "1731710198", "087098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Dhimas Bayu Ramadhan", "1731730111", "085298758124"));
        mahasiswaArrayList.add(new Mahasiswa("Delly Agus Saputro", "1731710110", "081098758111"));
        mahasiswaArrayList.add(new Mahasiswa("Lukman Hakim Saputra", "1731710123", "081098758554"));
    }
}
