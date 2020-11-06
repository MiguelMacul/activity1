package com.example.demo.Fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.example.myapplication.C0080R;
import java.io.PrintStream;

public class personasFrames extends Fragment implements View.OnClickListener {
    private EditText var;
    private EditText var2;
    private EditText var3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(C0080R.layout.suma_frame, container, false);
        this.var = (EditText) view.findViewById(C0080R.C0083id.editTextTextPersonName3);
        this.var2 = (EditText) view.findViewById(C0080R.C0083id.Snumero1);
        this.var3 = (EditText) view.findViewById(C0080R.C0083id.Snumero2);
        ((Button) view.findViewById(C0080R.C0083id.sumaBotton)).setOnClickListener(this);
        return view;
    }

    public void onClick(View view) {
        if (view.getId() == C0080R.C0083id.sumaBotton) {
            int parseInt = Integer.parseInt("" + this.var2.getText());
            int numero1 = parseInt + Integer.parseInt("" + this.var3.getText());
            EditText editText = this.var;
            editText.setText("" + numero1);
            PrintStream printStream = System.out;
            printStream.println("dsadassad" + this.var.getText());
        }
    }
}
