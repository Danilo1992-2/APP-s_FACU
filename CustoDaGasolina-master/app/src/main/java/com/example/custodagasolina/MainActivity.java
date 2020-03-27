package com.example.custodagasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.Format;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Gavalor = findViewById(R.id.valorID);
        final EditText dist = findViewById(R.id.DistanciaID);
        final EditText con = findViewById(R.id.ConsumoID);
        Button calc = findViewById(R.id.CID);


        Gavalor.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    Gavalor.setText("");
                }


                return false;
            }
        });

        dist.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    dist.setText("");
                }


                return false;
            }
        });

        con.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    con.setText("");
                }
                return false;
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double gasV = Double.parseDouble(Gavalor.getText().toString());
                double Consumo = Double.parseDouble(con.getText().toString());
                double distancia = Double.parseDouble(dist.getText().toString());
                double valortotal = (distancia/Consumo)*gasV;
                Intent intent = new Intent(MainActivity.this,retgas.class);
                DecimalFormat x = new DecimalFormat("0.00");
                intent.putExtra("Valor","O Valor total do consumo é \n R$"+x.format(valortotal));
                startActivity(intent);

            }
        });




    }
}
