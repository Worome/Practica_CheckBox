package com.trianacodes.script.practica_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1, et_valor2;
    private CheckBox ch_suma, ch_resta;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = findViewById(R.id.et_numero1);
        et_valor2 = findViewById(R.id.et_numero2);
        ch_suma = findViewById(R.id.chSuma);
        ch_resta = findViewById(R.id.chResta);
        tv_resultado = findViewById(R.id.tv_Resultado);

    }

    public void Calcular(View view){

        int val1 = Integer.parseInt(et_valor1.getText().toString());
        int val2 = Integer.parseInt(et_valor2.getText().toString());

        if (ch_suma.isChecked() && ch_resta.isChecked()){
            tv_resultado.setText("El resultado de la suma es: " + Suma(val1,val2)
                    + " y el de la resta es: " + Resta(val1, val2));
        } else if(ch_suma.isChecked() && !ch_resta.isChecked()){
            tv_resultado.setText(tv_resultado.getText().toString() + " " + Suma(val1, val2));
        } else if(!ch_suma.isChecked() && ch_resta.isChecked()){
            tv_resultado.setText(tv_resultado.getText().toString() + " " + Resta(val1, val2));
        }

    }

    private int Suma(int v1, int v2){
        return v1 + v2;
    }

    private int Resta (int v1, int v2){
        return v1 - v2;
    }
}
