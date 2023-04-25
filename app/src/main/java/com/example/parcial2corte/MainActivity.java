package com.example.parcial2corte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNumero;
    private Button btnCalcular;
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumero = findViewById(R.id.etNumero);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroString = etNumero.getText().toString();
                if (!numeroString.isEmpty()) {
                    int numero = Integer.parseInt(numeroString);
                    int resultado = calcularFibonacci(numero);
                    //tvResultado.setText(getString(R.string.resultado_fibonacci, numero, resultado));
                } else {
                    //tvResultado.setText(R.string.error_numero_vacio);
                }
            }
        });
    }
    private int calcularFibonacci(int numero) {
        if (numero <= 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
        }
    }
}