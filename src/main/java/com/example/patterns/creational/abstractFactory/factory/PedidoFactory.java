package com.example.patterns.creational.abstractFactory.factory;

import com.example.patterns.creational.abstractFactory.domain.Doce;
import com.example.patterns.creational.abstractFactory.domain.Lanche;

public abstract class PedidoFactory {

    public abstract Lanche montarPedidoLanche();

    public abstract Doce montarPedidoDoce();
}
