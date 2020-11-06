package com.example.demo.Fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.C0080R;
import java.util.ArrayList;
import java.util.List;

public class recyclerxD extends Fragment {
    private AdapterunionRecycler adaptadorDatos;
    private RecyclerView recyclerViewDatos;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(C0080R.layout.recycler_frame, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0080R.C0083id.reciclercontenedor);
        this.recyclerViewDatos = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        AdapterunionRecycler adapterunionRecycler = new AdapterunionRecycler(obtenerDatos());
        this.adaptadorDatos = adapterunionRecycler;
        this.recyclerViewDatos.setAdapter(adapterunionRecycler);
        return view;
    }

    public List<presetData> obtenerDatos() {
        List<presetData> data = new ArrayList<>();
        data.add(new presetData("Item 1", C0080R.C0082drawable.home_ico, "Esta es una descripcion del primer elemento, que lo describe"));
        data.add(new presetData("Item 2", C0080R.C0082drawable.home_ico, "Esta es una descripcion del segundo elemento, que lo describe"));
        data.add(new presetData("Item 3", C0080R.C0082drawable.home_ico, "Esta es una descripcion del Tercero elemento, que lo describe"));
        return data;
    }
}
