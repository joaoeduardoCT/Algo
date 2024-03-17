package AtividadeAvaliativa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    Queue<String> listaTarefas;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Scanner teclado = new Scanner(System.in);

        listaTarefas = new LinkedList<>();

        int escolhaMenu = 0;

        while (escolhaMenu != 4) {

            System.out.println(menu());
            System.out.print("Digite sua escolha: ");
            escolhaMenu = teclado.nextInt();

            switch (escolhaMenu) {
                case 1:

                    System.out.print("Escreva qual será a tarefa adicionada: ");
                    String tarefa = teclado.next();

                    System.out.println(adicionarTarefas(tarefa));
                    break;
                case 2:

                    System.out.println(concluirTarefas());
                    break;
                case 3:

                    System.out.println(vizualizarProximaTarefa());
                    break;
                case 4:

                    System.out.println("Saindo...");
                    teclado.close();
                    break;
                default:

                    System.out.println("Opção inválida. Tente novamente");
            }
        }

    }

    private String menu() {
        return "==================" +
                "\nBem vindo(a) ao menu!" +
                "\nO que você deseja fazer? Escolha dentre uma das opções abaixo:\n" +
                "\n1. Adicionar tarefas" +
                "\n2. Concluir uma tarefa" +
                "\n3. Visualizar a próxima tarefa" +
                "\n4. Sair" +
                "\n==================\n";
    }

    private String adicionarTarefas(String tarefa) {

        listaTarefas.add(tarefa);
        return "Tarefa: " + tarefa +
                "\nAdicionada com sucesso!\n";
    }

    private String concluirTarefas() {

        String saida = "";

        if (!listaTarefas.isEmpty()) {
            saida = "Tarefa: " + listaTarefas.peek() +
                    "\nConcluída com sucesso!" +
                    "Parabéns!\n";

            listaTarefas.remove();
        } else {
            saida = "Não há tarefas registradas.\n";
        }

        return saida;
    }

    private String vizualizarProximaTarefa() {

        String saida = "";

        if (!listaTarefas.isEmpty()) {
            saida = "Sua próxima tarefa: " + listaTarefas.peek() + "\n";
        } else {
            saida = "Não há tarefas registradas.\n";
        }

        return saida;
    }

}
