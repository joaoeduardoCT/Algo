package Aula1.Questao_3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        new Questao3();
    }

    private String menu() {
        return "\n---------------\nMENU\n1- Cadastro\n2- Listagem\n3- Pesquisa\n4- Alterar\n5- Remover\n6- Finalizar\n---------------\n";
    }

    public Questao3() {
        Scanner teclado = new Scanner(System.in);

        Vetor3 produtos = new Vetor3();

        int escolha = 0;

        while (escolha != 6) {

            System.out.println(menu());
            System.out.print("Selecione a opção desejada: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = teclado.next();
                    System.out.print("Digite o preço do produto " + nomeProduto + ": ");
                    double precoProduto = teclado.nextDouble();

                    Produto p = new Produto(nomeProduto, precoProduto);

                    produtos.cadastrar(p);

                    break;
                case 2:

                    System.out.print(produtos.listagem());

                    break;
                case 3:

                    System.out.print("Digite um termo para procurar um produto: ");
                    String termo = teclado.next();

                    System.out.print(produtos.pesquisa(termo));

                    break;
                case 4:

                    System.out.print("Digite o nome do produto que será alterado: ");
                    String produtoAlerado = teclado.next();

                    System.out.print("Qual será o novo nome do produto?: ");
                    String novoNome = teclado.next();

                    System.out.print("Qual será o novo preço do produto: ");
                    double novoPreco = teclado.nextDouble();

                    System.out.print(produtos.alterar(produtoAlerado, novoNome, novoPreco));
                    break;
                case 5:

                    System.out.print("Digite o nome do produto que será excluído: ");
                    String produtoRemovido = teclado.next();

                    System.out.print(produtos.remocao(produtoRemovido));

                    break;
                case 6:

                    System.out.println("Finalizando...");
                    teclado.close();

                    break;
                default:
                    System.out.println("Opção inválida!\nDigite outra opção.");
            }
        }
    }
}
