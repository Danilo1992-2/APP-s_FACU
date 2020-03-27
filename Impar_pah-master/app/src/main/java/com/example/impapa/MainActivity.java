package com.example.impapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = findViewById(R.id.NumID);
        final TextView tx = findViewById(R.id.txID);
        Button botao = findViewById(R.id.buttonID);


        num1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    num1.setText("");
                }
                return false;
            }
        });


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    try {


                        int nx = Integer.parseInt(num1.getText().toString());

                        if (nx % 2 == 0) {
                            tx.setText("O número é par !");
                        } else {
                            tx.setText("O número é impar !");
                        }

                    }catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Preciso que você digite um número", Toast.LENGTH_LONG).show();
                    }

            }

        });



    }
}
