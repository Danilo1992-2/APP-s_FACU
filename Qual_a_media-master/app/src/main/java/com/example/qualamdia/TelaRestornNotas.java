package com.example.qualamdia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaRestornNotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_restorn_notas);


        ImageView im = (ImageView)findViewById(R.id.ImagemID);
        TextView txt2 = (TextView) findViewById(R.id.Texto2ID);
        Button botaoVolar = (Button)findViewById(R.id.voltarID);
        Bundle transf = getIntent().getExtras();



        if (transf != null)
        {
            int img = transf.getInt("imagem");
            Bitmap btm = BitmapFactory.decodeResource(getResources(),img);
            im.setImageBitmap(btm);
            String retText = transf.getString("resultado");
            txt2.setText(retText);

        }

        botaoVolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(TelaRestornNotas.this,MainActivity.class));
            }
        });





            }

}



