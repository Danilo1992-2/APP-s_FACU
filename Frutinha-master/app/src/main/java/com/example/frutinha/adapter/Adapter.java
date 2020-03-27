package com.example.frutinha.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frutinha.R;
import com.example.frutinha.model.Filmes;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter.MyViewHolder>{
    private List<Filmes> listaFilmes;

    public Adapter(List<Filmes> lista){
        this.listaFilmes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.tela,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filmes f = listaFilmes.get(position);
        holder.Img.setImageResource(f.getNumImagem());
        holder.NomeFilme.setText(f.getNomefilme());

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView Img;
        TextView NomeFilme;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Img = itemView.findViewById(R.id.imgid);
            NomeFilme = itemView.findViewById(R.id.NomeFilmeID);
        }
    }

}
