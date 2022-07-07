package com.example.patterns.creational.builder.domain;

import java.util.List;

public class Pedido {

    private int numeroPedido;
    private List<Produto> produtoList;
    private Cliente cliente;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", produtoList=" + produtoList +
                ", cliente=" + cliente +
                '}';
    }
}
