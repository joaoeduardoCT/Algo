package Aula1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* Escolhi utlizar o LinkedList pois ele segue o padrão "Queue" que utiliza do princípio "FIFO" 
(First-in-First-out), proporcionando uma fácil manupilação de dados, fazendo com que a resolução 
de problemas que envolvem filas seja facilitada.
 */

public class Questao4 {
    public static void main(String[] args) {
        new Questao4();
    }

    public Questao4() {

        Scanner teclado = new Scanner(System.in);

        Queue<String> nomes = new LinkedList<>();

        int escolha = 0;

        while (escolha != 3) {

            System.out.println("MENU");
            System.out.println("1. Cadastrar atendimento");
            System.out.println("2. Remover");
            System.out.println("3. Finalizar");

            System.out.print("Digite sua escolha: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:

                    System.out.print("\nDigite o nome do cliente: ");
                    String nome = teclado.next();

                    nomes.add(nome);

                    System.out.println(nome + " adicionado(a) com sucesso!\n");

                    break;
                case 2:

                    System.out.println("\nProcurando cliente da fila...");

                    nomes.remove();

                    break;
                case 3:

                    System.out.println("\nFinalizando...");
                    teclado.close();
                    break;

                default:

                    System.out.println("\nOpção inválida.\n");
            }
        }
    }
}
