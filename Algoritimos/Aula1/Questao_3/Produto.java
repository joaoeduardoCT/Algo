package Aula1.Questao_3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().equalsIgnoreCase("") || nome == null) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException();
        }
        this.preco = preco;
    }

    public String toString() {
        return "Nome do produto: " + getNome() + "\nPreço: R$ " + getPreco();
    }
}
