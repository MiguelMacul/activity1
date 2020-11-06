package com.example.demo.Fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.example.demo.R;

public class restaOperacion extends Fragment implements View.OnClickListener {
    /* access modifiers changed from: private */
    public EditText var;
    /* access modifiers changed from: private */
    public EditText var2;
    /* access modifiers changed from: private */
    public EditText var3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.resta_fragmentos, container, false);
        Button boton = view.findViewById(R.id.botonSuma);
        this.var = (EditText) view.findViewById(R.id.Text1_Suma);
        this.var2 = (EditText) view.findViewById(R.id.Text2_Suma);
        this.var3 =  view.findViewById(R.id.Text3_Suma);
        view.findViewById(R.id.botonSuma).setOnClickListener(this);

        return view;
    }
    public void onClick(View view) {
        if (view.getId() == R.id.botonSuma) {
            int numero1 = Integer.parseInt(""+var.getText());
            int numero2 = Integer.parseInt(""+var2.getText());
            var3.setText(""+(numero1 - numero2));
        }
    }
}
