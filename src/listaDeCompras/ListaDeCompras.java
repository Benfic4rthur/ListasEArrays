package listaDeCompras;

import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<Produto> produtos; // Define um atributo privado do tipo ArrayList que irá armazenar uma lista de Produtos

    public ListaDeCompras() { // Cria um construtor padrão que inicializa o ArrayList
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) { // Cria um método público para adicionar um Produto à lista
        produtos.add(produto); // Adiciona o Produto recebido como parâmetro à lista de Produtos
    }

    public double calcularPrecoTotal() { // Cria um método público para calcular o preço total dos Produtos na lista
        double precoTotal = 0; // Inicializa uma variável local do tipo double com o valor 0 para armazenar o preço total dos Produtos
        for (Produto produto : produtos) { // Percorre a lista de Produtos
            precoTotal += produto.getPreco(); // Adiciona o preço de cada Produto à variável precoTotal
        }
        return precoTotal; // Retorna o preço total dos Produtos
    }

    public void imprimirLista() { // Cria um método público para imprimir a lista de Produtos
        System.out.println("Lista de compras:"); // Imprime um cabeçalho
        for (Produto produto : produtos) { // Percorre a lista de Produtos
            System.out.println("- " + produto); // Imprime o nome e o preço de cada Produto
        }
    }
}
