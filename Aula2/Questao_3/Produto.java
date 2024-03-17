package Aula2.Questao_3;

public class Produto {
    private String nome;
    private int segmento;

    public Produto(String nome, int segmento) {
        setNome(nome);
        setSegmento(segmento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().equalsIgnoreCase("")) {
            throw new IllegalArgumentException();
        } else {
            this.nome = nome;
        }
    }

    public int getSegmento() {
        return segmento;
    }

    public void setSegmento(int segmento) {
        if (segmento < 0) {
            throw new IllegalArgumentException();
        }
        this.segmento = segmento;
    }

    public String toString() {
        return "\nNome: " + getNome() + "\nSegmento: " + getSegmento() + "\n";
    }
}
