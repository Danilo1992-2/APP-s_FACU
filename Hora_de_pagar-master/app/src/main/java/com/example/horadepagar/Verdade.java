package com.example.horadepagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verdade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdade);

        TextView tx1 = findViewById(R.id.valorcontaID);
        TextView tx2 = findViewById(R.id.TotalID);
        TextView tx3 = findViewById(R.id.DzID);
        Button botaoVoltar = findViewById(R.id.VoltarID);

        Bundle Tranf = getIntent().getExtras();
        if (Tranf != null)
        {
        String v1 = Tranf.getString("10");
        String v2 = Tranf.getString("conta");
        String v3 = Tranf.getString("total");

        tx1.setText(v2);
        tx2.setText(v3);
        tx3.setText(v1);
        }
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Verdade.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
