package Aula2.Questao_5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Scanner teclado = new Scanner(System.in);

        HashMap<Integer, Aluno> alunos = new HashMap<>();

        int escolha = 0;

        while (escolha != 6) {
            System.out.println("===================================");
            System.out.println("MENU:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Selecionar todos os registros");
            System.out.println("3. Alterar dados");
            System.out.println("4. Remoção");
            System.out.println("5. Quantidade de aprovados e reprovados");
            System.out.println("6. Finalizar");

            System.out.print("Digite sua opção: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:

                    System.out.print("Digite o nome do(a) aluno(a): ");
                    String nome = teclado.next();

                    System.out.print("Digite o código do(a) aluno(a): ");
                    int codigo = teclado.nextInt();

                    int aprovacao = 0;

                    while (aprovacao != 1 && aprovacao != 2) {

                        System.out.println("Escolha uma das duas opções: \n1) Aprovado(a)\n2) Reprovado(a)");
                        System.out.print("Digite sua escolha: ");
                        aprovacao = teclado.nextInt();

                        if (aprovacao != 1 && aprovacao != 2) {
                            System.out.println("Opção inválida. Digite novamente.");
                        }
                    }

                    if (!alunos.containsKey(codigo)) {

                        Aluno a = new Aluno(nome, aprovacao);

                        alunos.put(codigo, a);
                        System.out.println("Aluno(a) castrado(a) com sucesso!");
                    } else {
                        System.out.println("Aluno(a) já existe.");
                    }

                    break;
                case 2:

                    String saida = "";

                    for (Integer c : alunos.keySet()) {

                        Aluno e = alunos.get(c);

                        saida += "\nCódigo: " + c + e.toString() + "\n----------\n";
                    }

                    System.out.println(saida);
                    break;
                case 3:

                    System.out.print("Digite o código de quem será alterado: ");
                    int alteracao = teclado.nextInt();

                    boolean achou = true;
                    boolean naoTem = true;

                    if (alunos.containsKey(alteracao)) {
                        System.out.print("Digite o novo código: ");
                        int novoCodigo = teclado.nextInt();

                        System.out.print("Digite o novo nome: ");
                        String novoNome = teclado.next();

                        int aprovacaoNova = 0;

                        while (aprovacaoNova != 1 && aprovacaoNova != 2) {

                            System.out.println("Escolha uma das duas opções: \n1) Aprovado(a)\n2) Reprovado(a)");
                            System.out.print("Digite sua escolha: ");
                            aprovacaoNova = teclado.nextInt();

                            if (aprovacaoNova != 1 && aprovacaoNova != 2) {
                                System.out.println("Opção inválida. Digite novamente.");
                            }
                        }

                        if (alunos.containsKey(novoCodigo)) {
                            achou = false;
                            naoTem = false;
                        }

                        if (naoTem) {
                            alunos.remove(alteracao);

                            Aluno alterado = new Aluno(novoNome, aprovacaoNova);
                            alunos.put(novoCodigo, alterado);

                            achou = false;

                            System.out.println("Aluno alterado com suecesso!");
                        } else {
                            System.out.println("Aluno(a) já existente. Tente novamente");
                        }
                    }

                    if (achou) {
                        System.out.println("Nada foi encontrado.");
                    }

                    break;
                case 4:

                    System.out.print("Digite o código de qual aluno(a) será removido(a): ");
                    int remocao = teclado.nextInt();

                    if (alunos.containsKey(remocao)) {

                        alunos.remove(remocao);

                        System.out.println("Aluno(a) removido(a) com sucesso!");
                    } else {
                        System.out.println("Aluno(a) não encontrado(a).");
                    }

                    break;
                case 5:

                    int quantidadeArpovados = 0;
                    int quantidadeRerpovados = 0;

                    for (Aluno ar : alunos.values()) {
                        if (ar.getAprovacao() == 1) {
                            quantidadeArpovados++;
                        } else {
                            quantidadeRerpovados++;
                        }
                    }

                    System.out.println("\nTOTAL DE ALUNOS: " + alunos.size() + "\nTotal aprovados: "
                            + quantidadeArpovados + "\nTotal reprovados: " + quantidadeRerpovados + "\n");
                    break;
                case 6:

                    System.out.println("Finalizando...");
                    teclado.close();
                    break;
                default:

                    System.out.println("Opção Inválida. Digite outra opção.");
            }
        }
    }
}
