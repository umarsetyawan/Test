package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FriendsAdapter mfFriendsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(layoutManager);

        mfFriendsAdapter = new FriendsAdapter(this, getMyList());
        mRecyclerView.setAdapter(mfFriendsAdapter);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setNama("Bimo");
        m.setAlamat("Jl.Kudus");
        m.setNoHp("0877");
        models.add(m);

        m = new Model();
        m.setNama("Budi");
        m.setAlamat("Jl.Semarang");
        m.setNoHp("0877");

        m = new Model();
        m.setNama("Ahmad");
        m.setAlamat("Jl.Jepara");
        m.setNoHp("0877");

        m = new Model();
        m.setNama("Johan");
        m.setAlamat("Jl.Bojonegoro");
        m.setNoHp("0877");

        m = new Model();
        m.setNama("Abdi");
        m.setAlamat("Jl.Pattimura");
        m.setNoHp("0877");

        m = new Model();
        m.setNama("Roger");
        m.setAlamat("Jl.PadadKarya");
        m.setNoHp("0877");

        m = new Model();
        m.setNama("Sugi");
        m.setAlamat("Jl.Diponegoro");
        m.setNoHp("0877");

        m = new Model();
        m.setNama("Sukadi");
        m.setAlamat("Jl.Sultan Malik");
        m.setNoHp("0877");

        return models;
    }
}