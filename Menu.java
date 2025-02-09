import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    ListaDeNinjas listaDeNinjas = new ListaDeNinjas();
    Ninja ninja = new Ninja();
    public void exibeMenuPrincipal() {
        int opcao;
        do {
            System.out.println("--------------------|MENU PRINCIPAL|--------------------");
            System.out.println("1 - Exibir lista de ninjas.");
            System.out.println("2 - Adicionar ninja a lista.");
            System.out.println("3 - Remover ninja da lista.");
            System.out.println("4 - Exibir um ninja.");
            System.out.println("5 - Ordenação de ninjas.");
            System.out.println("6 - Sair.");
            System.out.print("Digite a sua opção desejada: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    listaDeNinjas.exibirListaDeNinjas();
                    break;
                case 2:
                    listaDeNinjas.adicionaNinja(entrada);
                    break;
                case 3:
                    listaDeNinjas.removerNinja();
                    break;
                case 4:
                    listaDeNinjas.exibirNinja(entrada);
                    break;
                case 5:
                    listaDeNinjas.ordenacaoDeNinjas(entrada);
                    break;
                case 6:
                    System.out.println("Obrigado e tchau!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 6);
    }
}
