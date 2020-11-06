package com.example.demo.Fragmentos;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.R;

import java.util.List;

public class AdapterunionRecycler extends RecyclerView.Adapter<AdapterunionRecycler.ViewHolder> {
    public List<presetData> listado;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */
        public TextView description;
        /* access modifiers changed from: private */
        public ImageView foto;
        /* access modifiers changed from: private */
        public TextView titulo;

        public ViewHolder(View itemView) {
            super(itemView);
            this.titulo = (TextView) itemView.findViewById(R.id.title_car);
            this.description = (TextView) itemView.findViewById(R.id.desc_car);
            this.foto = (ImageView) itemView.findViewById(R.id.foto_card);
        }
    }
    public AdapterunionRecycler(List<presetData> listado2) {
        this.listado = listado2;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
       ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titulo.setText(this.listado.get(position).getTitle());
        holder.description.setText(this.listado.get(position).getDescription());
        holder.foto.setImageResource(this.listado.get(position).getFoto());
    }



    public int getItemCount() {
        return this.listado.size();
    }
}
