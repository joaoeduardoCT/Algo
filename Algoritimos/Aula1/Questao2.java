package Aula1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        new Questao2();
    }

    private String menu() {
        return "1- Cadastrar\n2- Listar todos os nomes\n3- Alterar\n4- Remover\n5- Finalizar";
    }

    public Questao2() {
        Scanner teclado = new Scanner(System.in);

        String[] vetor = new String[10];

        int lugar = 0;
        int escolha = 0;

        while (escolha != 5) {
            System.out.println(menu());
            System.out.print("Escolha uma das opções entre 1 e 5: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    if (lugar == 10) {
                        System.out.println("Vetor cheio.");
                    } else {
                        System.out.print("Digite o nome da pessoa: ");
                        String nome = teclado.next();
                        vetor[lugar] = nome;
                        lugar++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.println(vetor[i]);
                    }
                    break;
                case 3:
                    System.out.print("Qual posição será alterada? Entre 1 e 10: "); // ao invés da pessoa escolher entre
                                                                                    // as posições 0 e 9 poderá escolher
                                                                                    // entre 1 e 10
                    int posicao = teclado.nextInt();

                    boolean trocou = false;

                    if (posicao >= 1 && posicao <= 10 && vetor[posicao - 1] != null) {
                        for (int i = 0; i < vetor.length; i++) {
                            if (i == posicao - 1) {
                                System.out.print("Qual será o novo nome?: ");
                                String novoNome = teclado.next();
                                vetor[i] = novoNome;
                                trocou = true;
                            }
                        }
                    } else {
                        System.out.println("Escolha inválida.");
                    }

                    if (trocou) {
                        System.out.println("Alteração realizada com sucesso.");
                    } else {
                        System.out.println("Alteração não realizada.");
                    }

                    break;
                case 4:
                    System.out.print("Qual posição será excluída? Entre 1 e 10: ");
                    int excluir = teclado.nextInt();

                    if (excluir >= 1 && excluir <= 10 && vetor[excluir - 1] != null) {
                        for (int i = excluir - 1; i < vetor.length - 1; i++) {
                            vetor[i] = vetor[i + 1];
                        }

                        vetor[9] = null; // a última posição semrpre receberá null quando algo for excluído, assim não correndo risco da ultíma posição não ser excluída de acrodo com a lógica acima do for

                        System.out.println("Remoção concluída.");
                        lugar--;

                    } else {
                        System.out.println("Escolha inválida.");
                    }

                    break;
                case 5:
                    System.out.println("Finalizando...");
                    teclado.close();
                    break;
                default:
                    System.out.println("Opcão inválida.");
                    break;
            }
        }
    }
}
