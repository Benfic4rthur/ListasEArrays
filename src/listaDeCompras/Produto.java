package listaDeCompras;

public class Produto {
    private String nome; // Define o atributo nome como uma String privada
    private double preco; // Define o atributo preco como um double privado

    // Cria um construtor da classe Produto que recebe como parâmetros um nome e um preço
    public Produto(String nome, double preco) {
        this.nome = nome; // Atribui o nome recebido ao atributo nome da classe
        this.preco = preco; // Atribui o preço recebido ao atributo preco da classe
    }

    // Cria um método getNome que retorna o nome do produto
    public String getNome() {
        return nome;
    }

    // Cria um método getPreco que retorna o preço do produto
    public double getPreco() {
        return preco;
    }

    // Sobrescreve o método toString da classe Object para retornar uma String que representa o Produto
    @Override
    public String toString() {
        return nome + " - R$ " + preco; // Retorna o nome e o preço do produto em uma única String
    }
}
