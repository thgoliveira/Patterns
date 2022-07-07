package com.example.patterns.creational.builder.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import com.example.patterns.creational.builder.domain.Cliente;
import com.example.patterns.creational.builder.domain.Pedido;
import com.example.patterns.creational.builder.domain.Produto;

public class PedidoBuilder {

    private Pedido pedido;

    public PedidoBuilder(){
        this.pedido = new Pedido();
    }

    public PedidoBuilder setPedido(int numeroPedido) {
        pedido.setNumeroPedido(numeroPedido);
        return this;
    }

    public PedidoBuilder setClient(String nome, String telefone, String cpf){
        var cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setCpf(cpf);
        pedido.setCliente(cliente);
        return this;
    }

    public PedidoBuilder setProduto(final String nome, final int quantidade, final Double valor){
        var produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setValor(valor);

        if(Objects.isNull(pedido.getProdutoList())){
            pedido.setProdutoList(new ArrayList<>());
        }
        pedido.getProdutoList().add(produto);
        return this;
    }

    public Pedido builder(){
        return pedido;
    }
}
