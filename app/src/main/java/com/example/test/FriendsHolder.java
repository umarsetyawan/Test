package com.example.test;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsHolder extends RecyclerView.ViewHolder {
    TextView mNamaView, mAlamat, mNoHp;


    public FriendsHolder(@NonNull View itemView) {
        super(itemView);

        this.mNamaView = itemView.findViewById(R.id.txt_nama);
        this.mAlamat = itemView.findViewById(R.id.txt_alamat);
        this.mNoHp = itemView.findViewById(R.id.txt_noHp);
    }
}
