package com.example.escolhaumnmero;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Bundle ex = getIntent().getExtras();
        Button bvoltar = findViewById(R.id.VOLTARID);
        ImageView im = findViewById(R.id.imageButton);
        TextView tx = findViewById(R.id.ErrouAcertouID);

        if (ex != null)
        {
            int img = ex.getInt("AchouErrado");
            Bitmap btm = BitmapFactory.decodeResource(getResources(),img);
            im.setImageBitmap(btm);
            String retr = ex.getString("Resultado");
            tx.setText(retr);
        }

        bvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Inicio.this, MainActivity.class));
            }
        });
    }
}
