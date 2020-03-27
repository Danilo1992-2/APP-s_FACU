package com.example.xtristeza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView Imagem = (ImageView) findViewById(R.id.ImagemRostoID);
        final TextView ZerarBotao = (TextView) findViewById(R.id.TextZerarID);
        final Button Botao = (Button) findViewById(R.id.BotaoClickID);
        final TextView num = (TextView) findViewById(R.id.numID);
        
        Botao.setOnClickListener(new View.OnClickListener() {
             int i =0;
             int[] imagens =
                     {
                             R.drawable.smile01,
                             R.drawable.smile02,
                             R.drawable.smile03,
                             R.drawable.smile04,
                             R.drawable.smile05,
                             R.drawable.smile06,
                             R.drawable.smile07,
                             R.drawable.smile08,
                             R.drawable.smile09,
                             R.drawable.smile10,
                             R.drawable.smile11,
                     };
             @Override
             public void onClick(View v) {
                 if (i <= 11) {
                     try {
                         Bitmap btm = BitmapFactory.decodeResource(getResources(), imagens[i]);
                         Imagem.setImageBitmap(btm);
                         String returNum = Integer.toString(i);
                         num.setText(returNum);
                         i++;
                     }
                     catch (Exception e)
                     {

                         Toast.makeText(MainActivity.this,"Esse é o fim da felicidade, click em zerar!",Toast.LENGTH_SHORT).show();
                     }

                 }

             }
         }

        );
        ZerarBotao.setOnClickListener (new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent restart = new Intent(MainActivity.this,MainActivity.class);
                                               startActivity(restart);

                                           }

                                       }
        );
    }
}