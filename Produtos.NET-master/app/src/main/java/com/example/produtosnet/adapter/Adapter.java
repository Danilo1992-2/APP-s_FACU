package com.example.produtosnet.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.produtosnet.R;
import com.example.produtosnet.model.Produtos;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewholder>{


    private List<Produtos>listaProdutos;


    public Adapter(List<Produtos> lista)
    {
        this.listaProdutos = lista;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista,parent,false);
        return new MyViewholder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {

        Produtos p = listaProdutos.get(position);
        holder.imagem.setImageResource(p.getNumImagem());
        holder.produto.setText(p.getNomeproduto());
        holder.valor.setText(p.getVvalor());



    }

    @Override
    public int getItemCount() {
        return listaProdutos.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder {

        ImageView imagem;
        TextView produto;
        TextView valor;


        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            imagem = itemView.findViewById(R.id.img);
            produto = itemView.findViewById(R.id.produtoid);
            valor = itemView.findViewById(R.id.precoid);


        }


        }
    }

