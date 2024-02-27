package unitarias;

import entities.Cliente;
import entities.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private final List<Produto> produtos;

    public CarrinhoCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void finalizarVenda(Cliente cliente) {
        BigDecimal totalVenda = calcularTotalVenda();

        if (cliente.getSaldo().compareTo(totalVenda) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar a compra.");
        }

        for (Produto produto : produtos) {
            produto.removerEstoque(1);
        }

        cliente.setSaldo(cliente.getSaldo().subtract(totalVenda));
        produtos.clear();
    }

    public BigDecimal calcularTotalVenda() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            BigDecimal preco = produto.getPreco();
            total = total.add(preco);
        }
        return total;
    }
}
