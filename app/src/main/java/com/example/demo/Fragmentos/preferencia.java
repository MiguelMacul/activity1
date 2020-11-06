package com.example.demo.Fragmentos;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.myapplication.C0080R;

public class preferencia extends Fragment {
    protected Activity actividad = null;
    protected TextView hola;
    protected SharedPreferences preferencias;

    public void inicializar() {
        this.actividad = getActivity();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(C0080R.layout.preferencias_frame, container, false);
        final TextView campo2 = (TextView) view.findViewById(C0080R.C0083id.editTextTextPersonName4);
        final TextView campo1 = (TextView) view.findViewById(C0080R.C0083id.editTextTextPersonName);
        inicializar();
        this.hola = (TextView) this.actividad.findViewById(C0080R.C0083id.cabeza);
        SharedPreferences sharedPreferences = this.actividad.getSharedPreferences("presetHeader", 0);
        this.preferencias = sharedPreferences;
        campo2.setText(sharedPreferences.getString("Titular", "No existe aun xD"));
        ((Button) view.findViewById(C0080R.C0083id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editar = preferencia.this.preferencias.edit();
                String var = !campo1.getText().toString().equals("") ? campo1.getText().toString() : "#FF8747";
                editar.putString("Titular", campo2.getText().toString());
                editar.putString("Color", var);
                editar.commit();
                preferencia.this.hola.setText(preferencia.this.preferencias.getString("Titular", "No hay nada"));
                preferencia.this.hola.setBackgroundColor(Color.parseColor(preferencia.this.preferencias.getString("Color", "#FF8747")));
            }
        });
        return view;
    }
}
