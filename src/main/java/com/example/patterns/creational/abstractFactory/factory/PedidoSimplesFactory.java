package com.example.patterns.creational.abstractFactory.factory;

import com.example.patterns.creational.abstractFactory.domain.Doce;
import com.example.patterns.creational.abstractFactory.domain.DoceSimples;
import com.example.patterns.creational.abstractFactory.domain.Lanche;
import com.example.patterns.creational.abstractFactory.domain.LancheSimples;

public class PedidoSimplesFactory extends PedidoFactory{

    @Override
    public Lanche montarPedidoLanche() {
        return new LancheSimples();
    }

    @Override
    public Doce montarPedidoDoce() {
        return new DoceSimples();
    }
}
