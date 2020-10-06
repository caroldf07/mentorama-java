package TodoList;

import java.util.Scanner;

public class Menu {
    public void imprimeMenu(){
        System.out.println("Bem vindo ao sistema de TodoList");

        System.out.println("Digite o número do que deseja fazer");

        System.out.println("1. Adicionar categorias");
        System.out.println("2. Listar todas as categorias");
        System.out.println("3. Excluir categoria");
        System.out.println("0. Sair do programa");
    }

    public String decisaoUsuario(){
        Scanner decisaoUsuario = new Scanner(System.in);
        String valorDecisao = decisaoUsuario.next();
        return valorDecisao;
    }
}
