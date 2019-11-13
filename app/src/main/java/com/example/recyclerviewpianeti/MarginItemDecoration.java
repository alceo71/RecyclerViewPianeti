package com.example.recyclerviewpianeti;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MarginItemDecoration extends RecyclerView.ItemDecoration {

    int margine;

    public MarginItemDecoration(int margine){
        this.margine = margine;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if(parent.getChildAdapterPosition(view) == 0){
            outRect.top = margine;
        }
        outRect.left = margine;
        outRect.right = margine;
        outRect.bottom = margine;
    }
}


