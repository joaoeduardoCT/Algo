package Aula1.Questao_3;

public class Vetor3 {

    private Produto[] produtos;

    public Vetor3() {
        this.produtos = new Produto[0];
    }

    public void cadastrar(Produto produto) {

        int tamanho = this.produtos.length;
        tamanho += 1;

        Produto[] vetorTemp = new Produto[tamanho];

        for (int i = 0; i < this.produtos.length; i++) {
            vetorTemp[i] = this.produtos[i];
        }

        vetorTemp[tamanho - 1] = produto;

        this.produtos = vetorTemp;

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public String listagem() {

        String saida = "";

        if (produtos.length != 0) {
            for (int i = 0; i < produtos.length; i++) {
                saida += produtos[i].toString() + "\n---------\n";
            }
        } else {
            saida += "Não há produtos cadastrados.";
        }

        return saida;
    }

    public String pesquisa(String termo) {

        String saida = "";
        int encontrados = 0;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getNome().toLowerCase().contains(termo.toLowerCase())) {

                saida += "Produto(s) encontrado(s)!" + "\nNome do produto: " + produtos[i].getNome()
                        + "\nPreço do Produto: " + produtos[i].getPreco() + "\n----------\n";

                encontrados++;
            }
        }

        if (encontrados == 0) {
            saida += "Produto não encontrado!";
        }

        return saida;

    }

    public String alterar(String alterar, String novoNome, double novoPreco) {

        String saida = "";

        int produtoEncontrado = 0;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getNome().trim().equalsIgnoreCase(alterar)) {

                produtos[i].setNome(novoNome);
                produtos[i].setPreco(novoPreco);

                produtoEncontrado++;

                saida += "\nProduto alterado com sucesso!";
            }
        }

        if (produtoEncontrado == 0) {
            System.out.println("\nProduto não encontrado.");
        }

        return saida;
    }

    public String remocao(String produtoRemovido) {

        String saida = "";
        int remocao = 0;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getNome().trim().equalsIgnoreCase(produtoRemovido)) {

                for (int j = i; j < produtos.length - 1; j++) {
                    produtos[j] = produtos[j + 1];
                    remocao++;
                }
            }
        }

        if (remocao == 0) {
            saida = "Produto não encontrado.";
        } else {

            saida = "Produto removido com sucesso.";

            Produto vetorTemporario[] = new Produto[produtos.length - 1];

            for (int i = 0; i < vetorTemporario.length; i++) {
                vetorTemporario[i] = produtos[i];
            }

            produtos = vetorTemporario;

        }

        return saida;
    }
}
