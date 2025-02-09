import java.util.LinkedList;

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

    public LinkedList<Ninja> getListaDeNinjas() {
        return listaDeNinjas;
    }

    public void exibirListaDeNinjas() {
        new ListaDeNinjas();
        System.out.println("--------------------|LISTA DE NINJAS|--------------------");
        for (int i = 0; i < listaDeNinjas.size(); i++) {
            System.out.println(listaDeNinjas.get(i));
            System.out.println();
        }
        System.out.print("---------------------------------------------------------");
    }

    public void adicionaNinja(Ninja ninja) {
        listaDeNinjas.add(ninja);
        System.out.println("O ninja " + ninja + " foi adicionado com sucesso.");
    }
}
