package Aula2.Questao_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        int escolha = 0;

        while (escolha != 6) {

            System.out.println("===================================");
            System.out.println("MENU:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Selecionar todos os registros");
            System.out.println("3. Quantidade de segmentos");
            System.out.println("4. Alterar dados");
            System.out.println("5. Remoção");
            System.out.println("6. Finalizar");

            System.out.print("Digite sua opção: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:

                    System.out.print("Digite o nome do produto: ");
                    String nome = teclado.next();

                    System.out.print("Digite o segmento de " + nome + ": ");
                    int segmento = teclado.nextInt();

                    for (Produto c : produtos) {
                        while (c.getNome().trim().equalsIgnoreCase(nome)) {
                            System.out.println("Produto já existente. Por favor digite novamemte! ");

                            System.out.print("Digite o nome do produto: ");
                            nome = teclado.next();

                            System.out.print("Digite o segmento de " + nome + ": ");
                            segmento = teclado.nextInt();
                        }
                    }
                    Produto p = new Produto(nome, segmento);
                    produtos.add(p);

                    System.out.println("Produto registrado com sucesso!");

                    break;
                case 2:

                    for (Produto prod : produtos) {
                        System.out.println(prod.toString());
                    }
                    break;
                case 3:

                    System.out.println(segmentos(produtos));
                    break;
                case 4:

                    System.out.print("Digite o nome do produto para alteração: ");
                    String alterado = teclado.next();

                    boolean achou = true;

                    for (Produto a : produtos) {
                        if (a.getNome().trim().equalsIgnoreCase(alterado)) {
                            System.out.print("Novo nome: ");
                            String novoNome = teclado.next();

                            System.out.print("Novo segmento: ");
                            int novoSegmento = teclado.nextInt();

                            boolean jaExiste = true;

                            for (Produto t : produtos) {
                                if (novoNome.trim().equalsIgnoreCase(t.getNome()) && novoSegmento == t.getSegmento()) {
                                    System.out.println("Outro produto com os mesmos dados já existente.");
                                    achou = false;
                                    jaExiste = false;
                                    break;
                                }
                            }

                            if (jaExiste) {
                                a.setNome(novoNome);
                                a.setSegmento(novoSegmento);

                                achou = false;

                                System.out.println("Produto alterado com sucesso.");
                            }
                        }
                    }

                    if (achou) {
                        System.out.println("Não foi encontrado.");
                    }
                    break;
                case 5:

                    System.out.print("Digite o nome do produto a ser removido: ");
                    String remocao = teclado.next();

                    boolean removeu = true;

                    for (int r = 0; r < produtos.size(); r++) {
                        if (produtos.get(r).getNome().trim().equalsIgnoreCase(remocao)) {

                            produtos.remove(r);

                            removeu = false;

                            System.out.println("Produto removido com sucesso!");
                        }
                    }

                    if (removeu) {
                        System.out.println("Produto não encontrado.");
                    }

                    break;
                case 6:
                    System.out.println("Finalizando...");
                    teclado.close();
                    break;
                default:
                    System.out.println("Opção inválida. Digite outra.");

            }

        }

    }

    private String segmentos(ArrayList<Produto> produtos) {

        String saida = "";

        ArrayList<Integer> segmentosExistentes = new ArrayList<>();

        for (Produto a : produtos) {
            int quantidade = 0;
            if (!segmentosExistentes.contains(a.getSegmento())) {

                for (Produto b : produtos) {
                    if (a.getSegmento() == b.getSegmento()) {
                        quantidade++;
                        saida += b.getNome() + "\n";
                    }
                }

                saida += "TOTAL: " + quantidade + " produtos do segmento " + a.getSegmento() + "\n----------\n";

                segmentosExistentes.add(a.getSegmento());
            }
        }

        if (segmentosExistentes.isEmpty()) {
            saida += "Não há cadastros.";
        }

        return saida;

    }
}
