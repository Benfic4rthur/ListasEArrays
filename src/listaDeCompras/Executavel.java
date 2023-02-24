package listaDeCompras;

import javax.swing.JOptionPane; // Importa a classe JOptionPane
import java.util.ArrayList;

public class Executavel {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>(); // Inicializa um ArrayList vazio para armazenar os produtos

        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do produto (ou 'fim' para sair):"); // Exibe uma caixa de diálogo para o usuário digitar o nome do produto
            if (nome.equalsIgnoreCase("fim")) { // Se o usuário digitar "fim", interrompe o loop
                break;
            }

            String precoStr = JOptionPane.showInputDialog("Digite o preço do produto:"); // Exibe uma caixa de diálogo para o usuário digitar o preço do produto
            double preco = Double.parseDouble(precoStr); // Converte a string do preço para double

            Produto produto = new Produto(nome, preco); // Cria um novo produto com o nome e preço informados
            produtos.add(produto); // Adiciona o produto ao ArrayList
        }

        String listaDeCompras = "Lista de compras:\n"; // Inicializa a variável que irá armazenar a lista de compras
        double precoTotal = 0; // Inicializa a variável que irá armazenar o preço total da compra
        for (Produto produto : produtos) { // Percorre a lista de produtos
            listaDeCompras += "- " + produto + "\n"; // Adiciona o nome e preço do produto à lista de compras
            precoTotal += produto.getPreco(); // Soma o preço do produto ao preço total da compra
        }

        JOptionPane.showMessageDialog(null, listaDeCompras); // Exibe uma caixa de diálogo com a lista de compras
        JOptionPane.showMessageDialog(null, "Preço total da compra: R$ " + precoTotal); // Exibe uma caixa de diálogo com o preço total da compra
    }
}