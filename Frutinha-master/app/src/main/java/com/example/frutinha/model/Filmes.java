package com.example.frutinha.model;

public class Filmes{

    public Filmes(int numImagem, String nomeFilme, String sin)
    {
        NumImagem = numImagem;
        Nomefilme = nomeFilme;
        sinop = sin;
    }

    public int getNumImagem() {
        return NumImagem;
    }

    public String getNomefilme() {
        return Nomefilme;
    }

    public void setNumImagem(int numImagem) {
        NumImagem = numImagem;
    }

    public void setNomefilme(String nomefilme) {
        Nomefilme = nomefilme;
    }
    public void setSinop(String sinop) {
        this.sinop = sinop;
    }

    public String getSinop() {
        return sinop;
    }

    private int NumImagem;
    private String Nomefilme;
    private String sinop;
}
