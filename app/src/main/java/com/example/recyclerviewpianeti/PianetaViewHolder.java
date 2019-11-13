package com.example.recyclerviewpianeti;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PianetaViewHolder extends RecyclerView.ViewHolder {

    public TextView simbolo;
    public TextView nome;
    public TextView distanza;
    public TextView volume;
    public TextView satelliti;

    public PianetaViewHolder(@NonNull View itemView) {
        super(itemView);
    }

}
