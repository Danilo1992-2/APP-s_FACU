package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText inputID = findViewById(R.id.InputID);
        Button calc = findViewById(R.id.CalcID);


        inputID.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    inputID.setText("");
                }
                return false;
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {


                    int c = Integer.parseInt(inputID.getText().toString());
                    int fin = (int) (Math.PI * Math.pow(c, 2));
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("resultado", "O Resultado é " + fin);
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Por favor, informe o número", Toast.LENGTH_LONG).show();
                }
            }
                });


    }
}
