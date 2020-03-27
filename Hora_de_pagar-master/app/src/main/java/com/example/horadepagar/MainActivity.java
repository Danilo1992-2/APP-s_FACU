package com.example.horadepagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText ValorPagar =  findViewById(R.id.ValorPrapagar);
        Button botao =  findViewById(R.id.CalcularID);
        ValorPagar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    ValorPagar.setText("");
                }

                return false;
            }
        });
        botao.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick (View v) {
                    try {
                        DecimalFormat form = new DecimalFormat("0.00");

                        double valoReal = Integer.parseInt(ValorPagar.getText().toString());
                        double valoReal2 = ((valoReal / 100) * 10);
                        double total = (valoReal + valoReal2);

                        Intent intent = new Intent(MainActivity.this, Verdade.class);
                        intent.putExtra("conta", "RS  "+form.format(valoReal));
                        intent.putExtra("total", "RS " + form.format(total));
                        intent.putExtra("10", "RS " + form.format(valoReal2));
                        startActivity(intent);

                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Você não informou o valor da conta!", Toast.LENGTH_LONG).show();
                    }
                }

        }
    );
    }
}
