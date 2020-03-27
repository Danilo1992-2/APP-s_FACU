package com.example.frutinha.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.frutinha.R;

public class Sinopse extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(saveInstancesState);
        setContentView(R.layout.sinopse);
        ImageView img  = findViewById(R.id.imv2);
        TextView tx = findViewById(R.id.tx1);

        Bundle transf = getIntent().getExtras();

        if (transf != null)
        {

            String txx = transf.getString("nomeFilme");
            tx.setText(txx);
            int img2 = transf.getInt("imagem");
            img.setImageResource(img2);
        }


    }
}
