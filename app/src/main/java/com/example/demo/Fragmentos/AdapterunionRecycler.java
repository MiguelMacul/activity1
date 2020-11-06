package com.example.demo.Fragmentos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.C0080R;
import java.util.List;

public class AdapterunionRecycler extends RecyclerView.Adapter<ViewHolder> {
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
            this.titulo = (TextView) itemView.findViewById(C0080R.C0083id.idtitular);
            this.description = (TextView) itemView.findViewById(C0080R.C0083id.idDescription);
            this.foto = (ImageView) itemView.findViewById(C0080R.C0083id.idImagen);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(C0080R.layout.item_recycler, parent, false));
    }

    public AdapterunionRecycler(List<presetData> listado2) {
        this.listado = listado2;
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titulo.setText(this.listado.get(position).getTitle());
        holder.description.setText(this.listado.get(position).getDescription());
        holder.foto.setImageResource(this.listado.get(position).getFoto());
    }

    public int getItemCount() {
        return this.listado.size();
    }
}
