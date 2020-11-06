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

public class restaOperacion extends Fragment {
    /* access modifiers changed from: private */
    public EditText var;
    /* access modifiers changed from: private */
    public EditText var2;
    /* access modifiers changed from: private */
    public EditText var3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.id. .resta_fragmentos, container, false);
        this.var = (EditText) view.findViewById(C0080R.C0083id.editTextTextPersonName2);
        this.var2 = (EditText) view.findViewById(C0080R.C0083id.Snumero1);
        this.var3 = (EditText) view.findViewById(C0080R.C0083id.Snumero2);
        ((Button) view.findViewById(C0080R.C0083id.botonRestar)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (view.getId() == C0080R.C0083id.botonRestar) {
                    int parseInt = Integer.parseInt("" + restaOperacion.this.var2.getText());
                    restaOperacion.this.var.setText(parseInt - Integer.parseInt("" + restaOperacion.this.var3.getText()));
                    PrintStream printStream = System.out;
                    printStream.println("dsadassad" + restaOperacion.this.var.getText());
                }
            }
        });
        return view;
    }
}
