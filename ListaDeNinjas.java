import java.io.OutputStream;
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
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
    }

    public void adicionaNinja(Ninja ninja, Scanner entrada) {
        System.out.println("--------------------|ADIÇÃO DE NINJA|--------------------");
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
}
