package Aula2;

import java.util.LinkedList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        new Questao4();
    }

    public Questao4() {

        Scanner teclado = new Scanner(System.in);

        LinkedList<String> fila = new LinkedList<>();

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("_____-----_____");
            System.out.println("MENU:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar cadastros");
            System.out.println("3. Finalizar");

            System.out.print("Escolha uma opção: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:

                    System.out.print("Digite um nome para castrar: ");
                    String nome = teclado.next();

                    fila.add(nome);
                    System.out.println("Nome adicionado com sucesso.");

                    break;
                case 2:

                    for (String n : fila) {
                        System.out.println(n);
                    }

                    break;
                case 3:

                    System.out.println("Finalizando...");
                    teclado.close();
                    break;
                default:

                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }
    }
}
