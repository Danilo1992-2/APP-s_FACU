package com.example.produtosnet.model;

public class Produtos {

    public Produtos(int numImagem, String nomeproduto, String vvalor,String infp) {
        NumImagem = numImagem;
        Nomeproduto = nomeproduto;
        Vvalor = vvalor;
        this.infP = infp;
    }

    public void setNumImagem(int numImagem) {
        NumImagem = numImagem;
    }

    public void setNomeproduto(String nomeproduto) {
        Nomeproduto = nomeproduto;
    }

    public void setVvalor(String vvalor) {
        Vvalor = vvalor;
    }

    public int getNumImagem() {
        return NumImagem;
    }

    public String getNomeproduto() {
        return Nomeproduto;
    }

    public String getVvalor() {
        return Vvalor;
    }

    private int NumImagem;
    private String Nomeproduto;
    private String Vvalor;

    public String getInfP() {
        return infP;
    }

    public void setInfP(String infP) {
        this.infP = infP;
    }

    private String infP;
}
