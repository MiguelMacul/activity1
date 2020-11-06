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

import com.example.demo.R;

public class preferencia extends Fragment implements View.OnClickListener {
    protected Activity actividad = null;
    protected TextView hola;
    protected SharedPreferences preferencias;
    protected TextView campo2;
    protected TextView campo1;
    public void inicializar() {
        this.actividad = getActivity();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.preferencias_fragmentos, container, false);
        inicializar();
        campo1 = (TextView) view.findViewById(R.id.colorPreferencias);
        campo2 = (TextView) view.findViewById(R.id.TextoPreferencias);
        this.hola = this.actividad.findViewById(R.id.title_head);
        this.preferencias  = this.actividad.getSharedPreferences("presetHeader", 0);
        campo2.setText(this.preferencias .getString("Titular", "No existe aun xD"));
        view.findViewById(R.id.ActualizarPrefencias).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ActualizarPrefencias) {

            SharedPreferences.Editor editar = preferencia.this.preferencias.edit();
            String var = !(campo1.getText().toString().equals(""))? campo1.getText().toString() : "#FF8747";
            editar.putString("Titular", campo2.getText().toString());
            editar.putString("Color", var);
            editar.commit();
            System.out.println(this.hola.getText());
            System.out.println(this.preferencias.getString("Titular", "No hay nada"));
            this.hola.setText(this.preferencias.getString("Titular", "No hay nada"));
            this.hola.setBackgroundColor(Color.parseColor(this.preferencias.getString("Color", "#FF8747")));
        }

    }
}
