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
        for (int i = 0; i < listaDeNinjas.size(); i++) {
            System.out.println(listaDeNinjas.get(i));
            System.out.println("Posição: " + i);
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
    }

    public void adicionaNinja(Scanner entrada) {
        System.out.println("--------------------|ADIÇÃO DE NINJA|--------------------");
        Ninja ninja = new Ninja();
        entrada.nextLine();

        System.out.print("Digite o nome do ninja: ");
        ninja.setNome(entrada.nextLine());

        System.out.print("Digite a idade do ninja: ");
        ninja.setIdade(entrada.nextInt());

        entrada.nextLine();

        System.out.print("Digite a vila do ninja: ");
        ninja.setVila(entrada.nextLine());

        listaDeNinjas.addFirst(ninja);

        System.out.println("O ninja " + ninja.getNome() + " foi adicionado com sucesso.");
        System.out.println("---------------------------------------------------------");
    }

    public void removerNinja() {
        System.out.println("--------------------|REMOÇÃO DE NINJA|--------------------");
        String nome = listaDeNinjas.getFirst().getNome();
        listaDeNinjas.removeFirst();
        System.out.println("O ninja " + nome + " foi removido com sucesso.");
        System.out.println("----------------------------------------------------------");
    }

    public void exibirNinja(Scanner entrada) {
        System.out.println("--------------------|EXIBIÇÃO DE NINJA|--------------------");
        System.out.print("Digite a posição do ninja que deseja remover: ");
        int posicao = entrada.nextInt();

        Ninja ninja = listaDeNinjas.get(posicao);
        System.out.println(ninja);
        System.out.println("----------------------------------------------------------");
    }

    public void exibirNinja(String nomeDoNinja) {
        System.out.println("--------------------|BUSCA DE NINJA|--------------------");
        for (Ninja ninjaBuscado : listaDeNinjas) {
            if (ninjaBuscado.getNome().contains(nomeDoNinja)) {
                System.out.println(ninjaBuscado);
            }
        }
        System.out.println("----------------------------------------------------------");
    }

    public void ordenacaoDeNinjas(Scanner entrada) {
        System.out.println("1 - Ordenação por idade.");
        System.out.println("2 - Ordenação por nome.");
        System.out.println("3 - Ordenação por vila.");
        System.out.println("4 - Buscar ninja por nome.");
        System.out.print("Digite a ordenação desejada: ");
        int ordenacao = entrada.nextInt();

        switch (ordenacao) {
            case 1 :
                LinkedList<Ninja> ordenacaoPorIdade = (LinkedList<Ninja>) listaDeNinjas.clone();

                ordenacaoPorIdade.sort(Comparator.comparingInt(ninja -> ninja.getIdade()));
                System.out.println("--------------------|ORDENAÇÃO POR IDADE|--------------------");
                for (int i = ordenacaoPorIdade.size()-1; i > 0; i--) {
                    System.out.println(ordenacaoPorIdade.get(i));
                    System.out.println("Posição: " + i);
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------");
                break;
            case 2:
                LinkedList<Ninja> ordenacaoPorNome = (LinkedList<Ninja>) listaDeNinjas.clone();

                Collections.sort(ordenacaoPorNome, Comparator.comparing(ninja -> ninja.getNome()));
                System.out.println("--------------------|ORDENAÇÃO POR IDADE|--------------------");
                for (int i = 0; i < ordenacaoPorNome.size(); i++) {
                    System.out.println(ordenacaoPorNome.get(i));
                    System.out.println("Posição: " + i);
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------");
                break;
            case 3:
                LinkedList<Ninja> ordenacaoPorVila = (LinkedList<Ninja>) listaDeNinjas.clone();

                Collections.sort(ordenacaoPorVila, Comparator.comparing(ninja -> ninja.getNome()));
                System.out.println("--------------------|ORDENAÇÃO POR IDADE|--------------------");
                for (int i = 0; i < ordenacaoPorVila.size(); i++) {
                    System.out.println(ordenacaoPorVila.get(i));
                    System.out.println("Posição: " + i);
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------");
                break;
            case 4:
                entrada.nextLine();

                System.out.print("Digite o nome do ninja: ");
                String nome = entrada.nextLine();

                exibirNinja(nome);
                break;
        }
    }
}
