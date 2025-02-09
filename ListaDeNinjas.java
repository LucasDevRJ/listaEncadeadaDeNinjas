import java.util.LinkedList;

public class ListaDeNinjas {
    private LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

    public ListaDeNinjas() {

    }


    public void adicionaNinja(Ninja ninja) {
        listaDeNinjas.add(ninja);
        System.out.println("O ninja " + ninja + " foi adicionado com sucesso.");
    }
}
