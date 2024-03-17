package Aula2.Questao_5;

public class Aluno {
    private int aprovacao;
    private String nome;

    public Aluno(String nome, int aprovacao) {
        setNome(nome);
        setAprovacao(aprovacao);
    }

    public int getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(int aprovacao) {
        this.aprovacao = aprovacao;
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

    public String toString() {
        String saida = "\nNome: " + getNome() + "\nStatus: ";

        if (getAprovacao() == 1) {
            saida += "Aprovado(a)";
        } else {
            saida += "Reprovado(a)";
        }

        return saida;
    }
}
