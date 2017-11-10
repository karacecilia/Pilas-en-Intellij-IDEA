package com.company;

public class nodo {
    private int valor;
    private nodo prox;

    public nodo(){
        this.valor = 0;
        this.prox = null;
    }

    public nodo(int v){
        this.valor = v;
        this.prox = null;
    }

    public void setValor (int v){
        valor = v;

    }

    public void setProx (nodo p){
        prox = p;

    }

    public int getValor (){
        return valor;

    }

    public nodo getProx () {
        return prox;
    }
}
