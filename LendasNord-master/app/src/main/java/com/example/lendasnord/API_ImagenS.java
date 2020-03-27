package com.example.lendasnord;

import androidx.appcompat.app.AppCompatActivity;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class API_ImagenS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api__imagen_s);

        ImageView imagem = findViewById(R.id.imageButton);
        Button BotalVoltar = findViewById(R.id.BotaoVoltar);
        TextView TextoDe = findViewById(R.id.TextoRetornID);



        Bundle extra = getIntent().getExtras();


        if (extra != null)
        {
            String textoGod = extra.getString("Texto");
            TextoDe.setText(textoGod);
            int imagGod = extra.getInt("imagem");
            Bitmap bitm = BitmapFactory.decodeResource(getResources(),imagGod);
            imagem.setImageBitmap(bitm);

        }
        BotalVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(API_ImagenS.this, MainActivity.class));


            }
        });


    }

                };

