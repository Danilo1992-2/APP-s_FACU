package com.example.qualamdia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText n1 =  findViewById(R.id.AviID);
        final EditText n2 =  findViewById(R.id.Av2ID);
        final EditText n3 =  findViewById(R.id.Av3ID);
        Button botaoResult =  findViewById(R.id.BotaoResultID);

        n1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    n1.setText("");
                }

                return false;
            }
        });


        n2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    n2.setText("");
                }
                return false;
            }
        });



        n3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    n3.setText("");
                }
                return false;
            }
        });






        botaoResult.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                try {

                    int c1 = Integer.parseInt(n1.getText().toString());
                    int c2 = Integer.parseInt(n2.getText().toString());
                    int c3 = Integer.parseInt(n3.getText().toString());
                    if (((c1 + c2 + c3) / 3) < 7) {

                        Intent intent = new Intent(MainActivity.this, TelaRestornNotas.class);
                        intent.putExtra("resultado", "Você precisa estudar mais, sua nota final foi:\n" + ((c1 + c2 + c3) / 3));
                        intent.putExtra("imagem", R.drawable.derrota);
                        startActivity((intent));
                    } else {
                        Intent intent = new Intent(MainActivity.this, TelaRestornNotas.class);
                        intent.putExtra("resultado", "Você estudou e conseguiu, sua nota final foi:\n" + ((c1 + c2 + c3) / 3));
                        intent.putExtra("imagem", R.drawable.vitoria);
                        startActivity((intent));
                    }

            }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Por favor, inferme as notas", Toast.LENGTH_LONG).show();
                }
                }
        });
        }
    }
