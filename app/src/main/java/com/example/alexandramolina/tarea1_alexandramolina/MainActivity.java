package com.example.alexandramolina.tarea1_alexandramolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    public void onButtonClicked(View view) {
        double venta = 572.43;
        RadioButton button_dac;
        TextView resultado;
        EditText cantidad;
        button_dac = findViewById(R.id.button_dac);
        resultado = findViewById(R.id.textView2);
        cantidad = findViewById(R.id.editText);
        boolean checked = button_dac.isChecked();

        if (checked) {
            //dólar a colón
            double c = Double.parseDouble(cantidad.getText().toString());
            double r = (double)Math.round((c*venta)*100)/100;
            resultado.setText(Double.toString(r));
        }
        else{
            //colón a dólar
            double c = Double.parseDouble(cantidad.getText().toString());
            double r = (double)Math.round((c/venta)*100)/100;
            resultado.setText(Double.toString(r));

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
