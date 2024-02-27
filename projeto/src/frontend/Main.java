package frontend;

import unitarias.CarrinhoCompras;
import entities.Cliente;
import entities.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João Silva", "Rua das Flores, 123", "123456789", "joao@gmail.com", LocalDate.of(1990, 5, 15), "senha123");

        // Exibindo informações do cliente
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Senha: " + cliente.getSenha());
        System.out.println("Saldo: " + cliente.getSaldo());


        Produto produto1 = new Produto("Camiseta", "Camiseta de algodão", BigDecimal.valueOf(29.99));
        System.out.println("Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Descrição: " + produto1.getDescricao());
        System.out.println("Preço: " + produto1.getPreco());

        produto1.adicionarEstoque(20);
        System.out.println("quantidade: " + produto1.getQuantidadeEstoque());


        Produto produto2 = new Produto("Calça Jeans", "Calça jeans slim fit", BigDecimal.valueOf(59.99));

        System.out.println("\nProduto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Descrição: " + produto2.getDescricao());
        System.out.println("Preço: " + produto2.getPreco());

        produto2.adicionarEstoque(30);
        System.out.println("quantidade: " + produto2.getQuantidadeEstoque());

        System.out.println("------------------------------------------------");

        CarrinhoCompras compras = new CarrinhoCompras();
        compras.adicionarProduto(produto1);
        compras.adicionarProduto(produto2);

        BigDecimal totalVenda = compras.calcularTotalVenda();
        System.out.println("Total da compra =  " + totalVenda);

        compras.finalizarVenda(cliente);

        System.out.println("Ficou essa quantidade do produto1 : " + produto1.getQuantidadeEstoque());
        System.out.println("Ficou essa quantidade do produto1 : "  + produto2.getQuantidadeEstoque());

        System.out.println("Saldo Do Cliente =  " + cliente.getSaldo());












    }

}
