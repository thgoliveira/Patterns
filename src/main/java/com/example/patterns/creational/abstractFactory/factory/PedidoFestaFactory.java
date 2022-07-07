package com.example.patterns.creational.abstractFactory.factory;

import com.example.patterns.creational.abstractFactory.domain.Doce;
import com.example.patterns.creational.abstractFactory.domain.DoceParaFesta;
import com.example.patterns.creational.abstractFactory.domain.Lanche;
import com.example.patterns.creational.abstractFactory.domain.LancheParaFesta;

public class PedidoFestaFactory extends PedidoFactory{

    @Override
    public Lanche montarPedidoLanche() {
        return new LancheParaFesta();
    }

    @Override
    public Doce montarPedidoDoce() {
        return new DoceParaFesta();
    }
}
