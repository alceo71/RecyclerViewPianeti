package com.example.recyclerviewpianeti;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpianeti.model.Pianeta;

import java.util.List;

public class PianetiAdapter extends RecyclerView.Adapter<PianetaViewHolder>{

    public List<Pianeta> pianeti;
    public Context context;

    public PianetiAdapter(List<Pianeta> pianeti, Context context){
        this.pianeti = pianeti;
        this.context = context;
    }


    @NonNull
    @Override
    public PianetaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View convertView = LayoutInflater.from(context).inflate(R.layout.pianeta, parent, false);


        PianetaViewHolder pianetaViewHolder = new PianetaViewHolder(convertView);


        pianetaViewHolder.simbolo = (TextView) convertView.findViewById(R.id.simbolo);
        pianetaViewHolder.nome = (TextView) convertView.findViewById(R.id.nome_pianeta);
        pianetaViewHolder.distanza = (TextView) convertView.findViewById(R.id.distanza);
        pianetaViewHolder.volume = (TextView) convertView.findViewById(R.id.volume);
        pianetaViewHolder.satelliti = (TextView) convertView.findViewById(R.id.satelliti);

        return pianetaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PianetaViewHolder holder, int position) {
        Pianeta pianeta = pianeti.get(position);

        holder.simbolo.setText(pianeta.simbolo);
        holder.nome.setText(pianeta.nome);

        // Distanza dal sole
        String distanza = context.getString(R.string.ua, pianeta.distanzaSole);
        holder.distanza.setText(distanza);

        // Volume
        String volume = context.getString(R.string.volume, pianeta.volumeTerra);
        holder.volume.setText(volume);

        // Il numero di satelliti
        String satelliti = context.getResources().getQuantityString(R.plurals.satelliti,pianeta.numeroSatelliti,pianeta.numeroSatelliti);
        holder.satelliti.setText(satelliti);
    }

    @Override
    public int getItemCount() {
        if(pianeti == null)
            return 0;
        else
            return pianeti.size();
    }



}
