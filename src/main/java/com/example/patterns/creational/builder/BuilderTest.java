package com.example.patterns.creational.builder;

import com.example.patterns.creational.builder.builder.PedidoBuilder;

public class BuilderTest {

    public static void main(String[] args) {
        var builder = new PedidoBuilder()
                .setPedido(1)
                .setClient("Thiago Oliveira", "(XX)XXXXX-XXXX)", "123.123.123-12")
                .setProduto("Lanche", 2, 12.90)
                .setProduto("Refrigerante", 1, 10.00)
                .setProduto("Batata frita", 1, 6.00)
                .builder();
        System.out.println(builder);
    }
}
