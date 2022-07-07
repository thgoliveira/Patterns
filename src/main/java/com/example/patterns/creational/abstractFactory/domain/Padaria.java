package com.example.patterns.creational.abstractFactory.domain;

public class Padaria {

    private Lanche lanche;
    private Doce doce;

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Doce getDoce() {
        return doce;
    }

    public void setDoce(Doce doce) {
        this.doce = doce;
    }
}
