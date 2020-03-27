package com.example.escolhaumnmero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.EthiopicCalendar;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inicio = findViewById(R.id.intervalo1ID);
        final EditText fiNal = findViewById(R.id.Intervalo2ID);
        final EditText Adivinhar = findViewById(R.id.AdiviID);
        Button botaoStart = findViewById(R.id.StartID);



        inicio.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    inicio.setText("");
                }
                return false;
            }
        });

        fiNal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    fiNal.setText("");
                }
                return false;
            }
        });

        Adivinhar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    Adivinhar.setText("");
                }
                return false;
            }
        });

        final int [] imangens =
                {
                        R.drawable.achouerradootario,
                        R.drawable.tenor,
                };

        botaoStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            try {
                int num1 = Integer.parseInt(inicio.getText().toString());
                int num2 = Integer.parseInt(fiNal.getText().toString());
                int adivinhador = Integer.parseInt(Adivinhar.getText().toString());
                Random rand = new Random();
                int num = rand.nextInt(num2-num1)+num1;

                if(num != adivinhador)
                {
                    Intent intent = new Intent(MainActivity.this,Inicio.class);
                    intent.putExtra("Resultado","Errou otário!\n o número é :"+num);
                    intent.putExtra("AchouErrado",imangens[0]);
                    startActivity((intent));
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,Inicio.class);
                    intent.putExtra("Resultado","Acertou!\no número é :"+num);
                    intent.putExtra("AchouErrado",imangens[1]);
                    startActivity((intent));
                }

            } catch (Exception e) {
                Toast.makeText(MainActivity.this,"Por favor, digita alguma coisa!",Toast.LENGTH_LONG).show();
            }
            }
        });

    }
}
