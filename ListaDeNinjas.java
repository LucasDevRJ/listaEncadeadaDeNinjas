import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaDeNinjas {
    private LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

    public ListaDeNinjas() {
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 12, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 13, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 13, "Konoha"));
        listaDeNinjas.add(new Ninja("kakashi Hatake", 22, "Konoha"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 12, "Konoha"));
        listaDeNinjas.add(new Ninja("Kiba Inuzuka", 13, "Konoha"));
        listaDeNinjas.add(new Ninja("Rock Lee", 14, "Konoha"));
    }

    public void exibirListaDeNinjas() {
        new ListaDeNinjas();
        System.out.println("--------------------|LISTA DE NINJAS|--------------------");
        if (!listaDeNinjas.isEmpty()) {
            for (int i = 0; i < listaDeNinjas.size(); i++) {
                System.out.println(listaDeNinjas.get(i));
                System.out.println("Posição: " + i);
                System.out.println();
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        System.out.println("---------------------------------------------------------");
    }

    public void adicionaNinja(Scanner entrada) {
        System.out.println("--------------------|ADIÇÃO DE NINJA|--------------------");
        Ninja ninja = new Ninja();
        entrada.nextLine();

        System.out.print("Digite o nome do ninja: ");
        String nome = entrada.nextLine();

        while (nome.isEmpty()) {
            System.out.println("Digite o nome do ninja!");
            System.out.print("Digite o nome do ninja: ");
            nome = entrada.nextLine();
        }
        ninja.setNome(nome);

        System.out.print("Digite a idade do ninja: ");
        int idade = entrada.nextInt();

        while (idade <= 0) {
            System.out.println("Digite a idade!");
            System.out.print("Digite a idade do ninja: ");
            idade = entrada.nextInt();
        }
        ninja.setIdade(idade);
        entrada.nextLine();

        System.out.print("Digite a vila do ninja: ");
        String vila = entrada.nextLine();

        while (vila.isEmpty()) {
            System.out.println("Digite a vila do ninja!");
            System.out.print("Digite a vila do ninja: ");
            vila = entrada.nextLine();
        }
        ninja.setVila(vila);

        listaDeNinjas.addFirst(ninja);

        System.out.println("O ninja " + ninja.getNome() + " foi adicionado com sucesso.");
        System.out.println("---------------------------------------------------------");
    }

    public void removerNinja() {
        System.out.println("--------------------|REMOÇÃO DE NINJA|--------------------");
        if (!listaDeNinjas.isEmpty()) {
            String nome = listaDeNinjas.getFirst().getNome();
            listaDeNinjas.removeFirst();
            System.out.println("O ninja " + nome + " foi removido com sucesso.");
        } else {
            System.out.println("A lista está vazia.");
        }
        System.out.println("----------------------------------------------------------");
    }

    public void exibirNinja(Scanner entrada) {
        System.out.println("--------------------|EXIBIÇÃO DE NINJA|--------------------");
        if (!listaDeNinjas.isEmpty()) {
            System.out.print("Digite a posição do ninja que deseja remover: ");
            int posicao = entrada.nextInt();

            boolean posicaoValida = false;

            for (int i = 0; i < listaDeNinjas.size(); i++) {
                if (posicao == i) {
                    Ninja ninja = listaDeNinjas.get(posicao);
                    System.out.println(ninja);
                    posicaoValida = true;
                }
            }

            if (!posicaoValida) {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        System.out.println("----------------------------------------------------------");
    }

    public void exibirNinja(String nomeDoNinja) {
        System.out.println("--------------------|BUSCA DE NINJA|--------------------");
        if (!listaDeNinjas.isEmpty()) {
            for (Ninja ninjaBuscado : listaDeNinjas) {
                if (ninjaBuscado.getNome().contains(nomeDoNinja)) {
                    System.out.println(ninjaBuscado);
                }
            }
        } else {
            System.out.println("A lista está vazia.");
        }
        System.out.println("----------------------------------------------------------");
    }

    public void ordenacaoDeNinjas(Scanner entrada) {
        if (!listaDeNinjas.isEmpty()) {
            System.out.println("1 - Ordenação por idade.");
            System.out.println("2 - Ordenação por nome.");
            System.out.println("3 - Ordenação por vila.");
            System.out.println("4 - Buscar ninja por nome.");
            System.out.print("Digite a ordenação desejada: ");
            int ordenacao = entrada.nextInt();

            System.out.println("1 - Ordenação Decrescente ou de A-Z.");
            System.out.println("2 - Ordenação Crescente ou de Z-A.");
            System.out.print("Digite o critério de ordenação: ");
            int criterioOrdenacao = entrada.nextInt();

            boolean ordenacaoDecrescenteEDeAZ = true;
            if (criterioOrdenacao == 2) {
                ordenacaoDecrescenteEDeAZ = false;
            }

            switch (ordenacao) {
                case 1 :
                    LinkedList<Ninja> ordenacaoPorIdade = (LinkedList<Ninja>) listaDeNinjas.clone();

                    ordenacaoPorIdade.sort(Comparator.comparingInt(ninja -> ninja.getIdade()));
                    System.out.println("--------------------|ORDENAÇÃO POR IDADE|--------------------");
                    if (ordenacaoDecrescenteEDeAZ) {
                        for (int i = ordenacaoPorIdade.size()-1; i >= 0; i--) {
                            System.out.println(ordenacaoPorIdade.get(i));
                            System.out.println("Posição: " + i);
                            System.out.println();
                        }
                    } else {
                        for (int i = 0; i < ordenacaoPorIdade.size(); i++) {
                            System.out.println(ordenacaoPorIdade.get(i));
                            System.out.println("Posição: " + i);
                            System.out.println();
                        }
                    }
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 2:
                    LinkedList<Ninja> ordenacaoPorNome = (LinkedList<Ninja>) listaDeNinjas.clone();
                    Collections.sort(ordenacaoPorNome, Comparator.comparing(ninja -> ninja.getNome()));
                    System.out.println("--------------------|ORDENAÇÃO POR IDADE|--------------------");
                    if (ordenacaoDecrescenteEDeAZ) {
                        for (int i = 0; i < ordenacaoPorNome.size(); i++) {
                            System.out.println(ordenacaoPorNome.get(i));
                            System.out.println("Posição: " + i);
                            System.out.println();
                        }
                    } else {
                        for (int i = ordenacaoPorNome.size()-1; i >= 0; i--) {
                            System.out.println(ordenacaoPorNome.get(i));
                            System.out.println("Posição: " + i);
                            System.out.println();
                        }
                    }

                    System.out.println("-------------------------------------------------------------");
                    break;
                case 3:
                    LinkedList<Ninja> ordenacaoPorVila = (LinkedList<Ninja>) listaDeNinjas.clone();
                    Collections.sort(ordenacaoPorVila, Comparator.comparing(ninja -> ninja.getVila()));
                    System.out.println("--------------------|ORDENAÇÃO POR IDADE|--------------------");
                    if (ordenacaoDecrescenteEDeAZ) {
                        for (int i = 0; i < ordenacaoPorVila.size(); i++) {
                            System.out.println(ordenacaoPorVila.get(i));
                            System.out.println("Posição: " + i);
                            System.out.println();
                        }
                    } else {
                        for (int i = ordenacaoPorVila.size()-1; i >= 0; i--) {
                            System.out.println(ordenacaoPorVila.get(i));
                            System.out.println("Posição: " + i);
                            System.out.println();
                        }
                    }

                    System.out.println("-------------------------------------------------------------");
                    break;
                case 4:
                    entrada.nextLine();

                    System.out.print("Digite o nome do ninja: ");
                    String nome = entrada.nextLine();

                    exibirNinja(nome);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
