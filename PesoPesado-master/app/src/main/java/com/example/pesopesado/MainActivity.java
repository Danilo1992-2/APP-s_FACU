package com.example.pesopesado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText peso = findViewById(R.id.pesoID);
        final EditText altura = findViewById(R.id.alturaID);
        Button calc = findViewById(R.id.calcId);


        peso.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    peso.setText("");
                }
                return false;
            }
        });

        altura.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    altura.setText("");
                }
                return false;
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    DecimalFormat formatar = new DecimalFormat(("0.0"));


                    double peso1 = Double.parseDouble(peso.getText().toString());
                    double altura1 = Double.parseDouble(altura.getText().toString());

                    double imc = altura1 * altura1;

                    double imcRsultado = (peso1 / imc) * 10000;

                    Intent intent = new Intent(MainActivity.this, TelaResultado.class);

                    if (imcRsultado <= 18.5) {
                        intent.putExtra("resultadoIMC", "resultado IMC: " + formatar.format(imcRsultado));
                        intent.putExtra("imagem", R.drawable.magro);
                        intent.putExtra("texto", "Cara, só come! come muito!");
                        startActivity(intent);

                    }
                    if (imcRsultado > 18.5 && imcRsultado < 24.9) {
                        intent.putExtra("resultadoIMC", "resultado IMC: " + formatar.format(imcRsultado));
                        intent.putExtra("imagem", R.drawable.normal);

                        intent.putExtra("texto", "Boa 0.6!");


                        startActivity(intent);

                    }
                    if (imcRsultado > 25.0 && imcRsultado < 29.9) {
                        intent.putExtra("resultadoIMC", "resultado IMC: " + formatar.format(imcRsultado));
                        intent.putExtra("imagem", R.drawable.sobrepeso);
                        intent.putExtra("texto", "Cara, vamos malhar?");
                        startActivity(intent);

                    }
                    if (imcRsultado > 30.0 && imcRsultado < 34.9) {
                        intent.putExtra("resultadoIMC", "resultado IMC: " + formatar.format(imcRsultado));
                        intent.putExtra("imagem", R.drawable.obesidade1);
                        intent.putExtra("texto", "Cara, ainda há esperança!");
                        startActivity(intent);

                    }
                    if (imcRsultado > 35.0 && imcRsultado < 39.9) {
                        intent.putExtra("resultadoIMC", "resultado IMC: " + formatar.format(imcRsultado));
                        intent.putExtra("imagem", R.drawable.obesidade2);
                        intent.putExtra("texto", "Cara, ou perde a barriga ou a vida!");
                        startActivity(intent);

                    }
                    if (imcRsultado >= 40.0) {
                        intent.putExtra("resultadoIMC", "resultado IMC: " + formatar.format(imcRsultado));
                        intent.putExtra("imagem", R.drawable.beso3);
                        intent.putExtra("texto", "Cara, tua cova tá pronta!");
                        startActivity(intent);

                    }


                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Sem vergonha, digita ai!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
