package com.example.patterns.creational.abstractFactory;

import com.example.patterns.creational.abstractFactory.domain.Padaria;
import com.example.patterns.creational.abstractFactory.factory.PedidoFactory;
import com.example.patterns.creational.abstractFactory.factory.PedidoFestaFactory;
import com.example.patterns.creational.abstractFactory.factory.PedidoSimplesFactory;

public class AbstractFactoryTest {

    private static Padaria montarPedido(final String tipo) {
        PedidoFactory pf = null;
        switch (tipo) {
            case "simples":
                pf = new PedidoSimplesFactory();
                break;
            case "festa":
                pf = new PedidoFestaFactory();
                break;
            default:
                throw new RuntimeException("O tipo não corresponde!");
        }

        final var padaria = new Padaria();
        padaria.setLanche(pf.montarPedidoLanche());
        padaria.setDoce(pf.montarPedidoDoce());
        return padaria;
    }

    public static void main(String[] args) {
        final var pedidoSimples = montarPedido("simples");
        final var pedidoFesta = montarPedido("festa");
    }
}
