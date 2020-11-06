package com.example.demo.Fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.example.demo.R;
import java.io.PrintStream;

public class restaOperacion extends Fragment implements View.OnClickListener {
    /* access modifiers changed from: private */
    public EditText var;
    /* access modifiers changed from: private */
    public EditText var2;
    /* access modifiers changed from: private */
    public EditText var3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.resta_fragmentos, container, false);
        Button boton = view.findViewById(R.id.botonResta);
        this.var = (EditText) view.findViewById(R.id.Text1_resta);
        this.var2 = (EditText) view.findViewById(R.id.Text2_resta);
        this.var3 = (EditText) view.findViewById(R.id.Text3_resta);
        view.findViewById(R.id.botonResta).setOnClickListener(this);

        return view;
    }
    public void onClick(View view) {
        if (view.getId() == R.id.botonResta) {
            int parseInt = Integer.parseInt("" + restaOperacion.this.var.getText());
            restaOperacion.this.var3.setText(parseInt - Integer.parseInt("" + restaOperacion.this.var2.getText()));
            PrintStream printStream = System.out;
            printStream.println("dsadassad" + restaOperacion.this.var.getText());
        }
    }
}
