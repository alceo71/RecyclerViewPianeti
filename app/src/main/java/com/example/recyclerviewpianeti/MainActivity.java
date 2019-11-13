package com.example.recyclerviewpianeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;

import com.example.recyclerviewpianeti.model.Pianeta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Pianeta> pianeti(){
        List<Pianeta> pianeti = new ArrayList<Pianeta>();
        pianeti.add(new Pianeta("Mercurio",0.38709893,0.0056,0,"\u263f"));
        pianeti.add(new Pianeta("Venere",0.72333199,0.857,0,"\u2640"));
        pianeti.add(new Pianeta("Terra",1,1,1,"\u2295"));
        pianeti.add(new Pianeta("Marte",1.52366231,0.149,2,"\u2642"));
        pianeti.add(new Pianeta("Giove",5.20336301,1316,67,"\u2643"));
        pianeti.add(new Pianeta("Saturno",9.53707032,755,62,"\u2644"));
        pianeti.add(new Pianeta("Urano",19.19126393,52,27,"\u2645"));
        pianeti.add(new Pianeta("Nettuno",30.06896348,44,14,"\u2646"));
        return pianeti;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pianeti_list);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //RecyclerView.LayoutManager layoutManager = manager;
        recyclerView.setLayoutManager(manager);

        // Aggiungiamo il nostro separatore
        recyclerView.addItemDecoration(new MarginItemDecoration(dpToPx(10)));

        RecyclerView.Adapter adapter = new PianetiAdapter(pianeti(), this);
        recyclerView.setAdapter(adapter);

        // SnapHelper snapHelper = new LinearSnapHelper();
        // snapHelper.attachToRecyclerView(recyclerView);

    }

    public int dpToPx(float dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }

}
