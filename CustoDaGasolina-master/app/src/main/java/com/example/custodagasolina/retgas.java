package com.example.custodagasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class retgas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retgas);

        TextView textoRetunr = findViewById(R.id.IdResult);
        Button buR = findViewById(R.id.button2);
        Bundle extra = getIntent().getExtras();


        String input = extra.getString("Valor");
        textoRetunr.setText(input);

        buR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(retgas.this,MainActivity.class);
                startActivity(i);
            }
        });




    }
}
