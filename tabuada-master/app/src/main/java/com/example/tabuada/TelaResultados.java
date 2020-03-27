package com.example.tabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class TelaResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultados);


        TextView retorno1 = (TextView)findViewById(R.id.id0);
        TextView retorno2 = (TextView)findViewById(R.id.id1);
        TextView retorno3 = (TextView)findViewById(R.id.id2);
        TextView retorno4 = (TextView)findViewById(R.id.id3);
        TextView retorno5 = (TextView)findViewById(R.id.id4);
        TextView retorno6 = (TextView)findViewById(R.id.id5);
        TextView retorno7 = (TextView)findViewById(R.id.id6);
        TextView retorno8 = (TextView)findViewById(R.id.id7);
        TextView retorno9 = (TextView)findViewById(R.id.id8);
        TextView retorno10 = (TextView)findViewById(R.id.id9);
        TextView retorno11 = (TextView)findViewById(R.id.id10);

        Bundle tranferencia = getIntent().getExtras();

        if (tranferencia != null)
        {

                    int r0 = tranferencia.getInt("a");
                    int r1 = tranferencia.getInt("b");
                    int r2 = tranferencia.getInt("c");
                    int r3 = tranferencia.getInt("d");
                    int r4 = tranferencia.getInt("e");
                    int r5 = tranferencia.getInt("f");
                    int r6 = tranferencia.getInt("g");
                    int r7 = tranferencia.getInt("h");
                    int r8 = tranferencia.getInt("i");
                    int r9 = tranferencia.getInt("j");
                    int r10 = tranferencia.getInt("l");





            String ss = tranferencia.getString("sc");
                    retorno1.setText(ss + " X " + "0 = " + r0);
                    retorno2.setText(ss + " X " + "1 = " + r1);
                    retorno3.setText(ss + " X " + "2 = " + r2);
                    retorno4.setText(ss + " X " + "3 = " + r3);
                    retorno5.setText(ss + " X " + "4 = " + r4);
                    retorno6.setText(ss + " X " + "5 = " + r5);
                    retorno7.setText(ss + " X " + "6 = " + r6);
                    retorno8.setText(ss + " X " + "7 = " + r7);
                    retorno9.setText(ss + " X " + "8 = " + r8);
                    retorno10.setText(ss + " X " + "9 = " + r9);
                    retorno11.setText(ss + " X " + "10 = " + r10);

                }
            }

        }




