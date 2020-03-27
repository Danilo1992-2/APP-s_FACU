package com.example.reverso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText entrada =  findViewById(R.id.EntradaID);
        final TextView saida =  findViewById(R.id.SaídaID);
        Button Revert =  findViewById(R.id.RevertID);


        entrada.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    entrada.setText("");
                }
                return false;

            }
        });

        Revert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entrada2 = entrada.getText().toString();
                 StringBuffer retrn = new StringBuffer(entrada2);
              String troca = retrn.reverse().toString();
                saida.setText(troca);
            }
        });


    }
}
