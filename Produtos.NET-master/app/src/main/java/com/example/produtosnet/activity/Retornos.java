package com.example.produtosnet.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.produtosnet.R;

public class Retornos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstancesState) {

        super.onCreate(saveInstancesState);
        setContentView(R.layout.retornos);

        ImageView img = findViewById(R.id.imgID);
        TextView tx1 = findViewById(R.id.textoid);
        TextView preco = findViewById(R.id.ValorResturnID);

        Bundle tranf = getIntent().getExtras();
        if (tranf != null)
        {
            String text1 =tranf.getString("infp");
            tx1.setText(text1);
            String text2 =tranf.getString("preco");
            preco.setText(text2);
            int img2  = tranf.getInt("img");

            img.setImageResource(img2);

        }



    }



}
