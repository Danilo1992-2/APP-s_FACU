package com.example.tabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoCalculo = (Button)findViewById(R.id.calcularID);
        final EditText num = (EditText)findViewById(R.id.NumID);


        botaoCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int inf = Integer.parseInt(num.getText().toString());
                    int[] acum = new int[50];
                    int i = 0;
                    while (i  <= 10) {
                        int result = inf * i;
                        Intent intent = new Intent(MainActivity.this, TelaResultados.class);
                        acum[i] = result;
                        i++;
                    }
                    Intent intent = new Intent(MainActivity.this, TelaResultados.class);
                    String rnum = num.getText().toString();
                    intent.putExtra("sc", rnum);
                    intent.putExtra("a", acum[0]);
                    intent.putExtra("b", acum[1]);
                    intent.putExtra("c", acum[2]);
                    intent.putExtra("d", acum[3]);
                    intent.putExtra("e", acum[4]);
                    intent.putExtra("f", acum[5]);
                    intent.putExtra("g", acum[6]);
                    intent.putExtra("h", acum[7]);
                    intent.putExtra("i", acum[8]);
                    intent.putExtra("j", acum[9]);
                    intent.putExtra("l", acum[10]);
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Por favor, informe o número", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
