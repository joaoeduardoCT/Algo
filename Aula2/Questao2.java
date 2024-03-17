package Aula2;

import java.util.Scanner;
import java.util.Vector;

public class Questao2 {
    public static void main(String[] args) {
        new Questao2();
    }

    private String menu() {
        return "\n---------------\nMENU\n1- Cadastro\n2- Listagem\n3- Pesquisa\n4- Alterar\n5- Remover\n6- Finalizar\n---------------\n";
    }

    public Questao2() {
        Scanner teclado = new Scanner(System.in);

        Vector<String> vetor = new Vector<>();

        int escolha = 0;

        while (escolha != 6) {

            System.out.println(menu());
            System.out.print("Selecione a opção desejada: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um nome: ");
                    String nome = teclado.next();

                    boolean nomeJaExiste = true;

                    for (String x : vetor) {
                        if (x.trim().equalsIgnoreCase(nome)) {
                            nomeJaExiste = false;
                            break;
                        }
                    }

                    if (!nomeJaExiste) {
                        System.out.println("Nome já existe. Tente novamente.");
                    } else {
                        vetor.add(nome);
                        System.out.println("Nome adicionado com sucesso!");
                    }

                    break;
                case 2:

                    for (String nomes : vetor) {
                        System.out.println(nomes);
                    }

                    break;
                case 3:

                    System.out.print("Digite um termo para procurar um nome: ");
                    String termo = teclado.next();

                    boolean achou = true;

                    for (String t : vetor) {
                        if (t.contains(termo)) {
                            System.out.println(t);
                            achou = false;
                        }
                    }

                    if (achou) {
                        System.out.println("Nada foi encontrado.");
                    }

                    break;
                case 4:

                    System.out.print("Digite o nome que será alterado: ");
                    String nomeAlerado = teclado.next();

                    boolean achado = true;
                    boolean existe = true;

                    for (int i = 0; i < vetor.size(); i++) {
                        if (vetor.get(i).trim().equalsIgnoreCase(nomeAlerado)) {

                            System.out.print("Digite novo nome: ");
                            String novoNome = teclado.next();

                            for (String nomeIgual : vetor) {
                                if (nomeIgual.trim().equalsIgnoreCase(novoNome)) {
                                    System.out.println("Nome já existente.");
                                    achado = false;
                                    existe = false;
                                }
                            }

                            if (achado) {
                                System.out.println("Nome alterado com sucesso!");
                                vetor.set(i, novoNome);
                                existe = false;
                            }
                        }
                    }

                    if (existe) {
                        System.out.println("Esse nome não existe.");
                    }

                    break;
                case 5:

                    System.out.print("Digite o nome do produto que será excluído: ");
                    String nomeRemovido = teclado.next();

                    boolean pertenceAoVector = true;

                    for (int i = 0; i < vetor.size(); i++) {
                        if (vetor.get(i).trim().equalsIgnoreCase(nomeRemovido)) {
                            vetor.remove(i);
                            System.out.println("Nome removido com sucesso.");
                            pertenceAoVector = false;
                        }
                    }

                    if (pertenceAoVector) {
                        System.out.println("Esse nome não existe.");
                    }

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
