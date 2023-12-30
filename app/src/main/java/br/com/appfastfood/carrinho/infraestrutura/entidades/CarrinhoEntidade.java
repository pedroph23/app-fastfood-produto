


package br.com.appfastfood.carrinho.infraestrutura.entidades;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "carrinho")
public class CarrinhoEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected CarrinhoEntidade() {}
    @ElementCollection
    List<ProdEnt> produtos;
    private String clienteId;
    private Double valorTotal;

    public CarrinhoEntidade(List<ProdEnt> produtos, String clienteId, Double valorTotal) {
        this.produtos = produtos;
        this.clienteId = clienteId;
        this.valorTotal = valorTotal;
    }

    public CarrinhoEntidade(Long id, List<ProdEnt> produtos, String clienteId, Double valorTotal) {
        this.id = id;
        this.produtos = produtos;
        this.clienteId = clienteId;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ProdEnt> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdEnt> produtos) {
        this.produtos = produtos;
    }
}

