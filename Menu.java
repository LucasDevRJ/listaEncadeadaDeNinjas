import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    ListaDeNinjas listaDeNinjas = new ListaDeNinjas();
    public void exibeMenuPrincipal() {
        System.out.println("--------------------|MENU PRINCIPAL|--------------------");
        System.out.println("1 - Exibir lista de ninjas.");
        System.out.println("2 - Adicionar ninja a lista.");
        System.out.println("3 - Remover ninja da lista.");
        System.out.println("4 - Exibir um ninja.");
        System.out.print("Digite a sua opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                listaDeNinjas.exibirListaDeNinjas();
                break;
        }
    }
}
