package entities;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int quantidadeEstoque;

    public Produto(){}

    public Produto(String nome, String descricao, BigDecimal preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidadeEstoque < quantidade) {
            throw new IllegalArgumentException("Quantidade a ser removida é maior do que a quantidade em estoque.");
        }
        quantidadeEstoque -= quantidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}

