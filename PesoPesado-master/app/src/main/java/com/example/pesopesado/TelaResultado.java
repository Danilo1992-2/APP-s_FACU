package com.example.pesopesado;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado);
        TextView text1 = findViewById(R.id.txID);
        TextView text2 = findViewById(R.id.TxIDD);
        ImageView imagem = findViewById(R.id.ImgIDD);


        Bundle Rt = getIntent().getExtras();

            if (Rt != null)
            {
                int img = Rt.getInt("imagem");
                Bitmap imgg = BitmapFactory.decodeResource(getResources(),img);
                imagem.setImageBitmap(imgg);
                String n1 = Rt.getString("resultadoIMC");
                text2.setText(n1);
                text1.setText(Rt.getString("texto"));

            }



    }
}
