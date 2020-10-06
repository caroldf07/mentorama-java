package TodoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List <String> categorias = new ArrayList<>();

        boolean continua = true;
        while (continua){
            Menu menu = new Menu();
            menu.imprimeMenu();

            String valorDecisao = menu.decisaoUsuario();

            switch (valorDecisao){
                case "1":{
                    System.out.println("Digite o nome da categoria sem espaços: ");
                    Scanner scanNomeCategoria = new Scanner(System.in);
                    String nomeCategoria = scanNomeCategoria.next();

                    categorias.add(nomeCategoria);
                    break;
                }

                case "2":{
                    for (String categoria: categorias) {
                        System.out.println(categoria);
                    };
                    break;
                }

                case "3":{
                    System.out.println("Digite o nome da categoria que deseja excluir");
                    Scanner categoriaExcluir = new Scanner(System.in);
                    String categoriaExcluida = categoriaExcluir.next();
                    categorias.remove(categoriaExcluida);

                    for (String categoria: categorias) {
                        System.out.println(categoria);
                    };
                    break;
                }

                case "0":{
                    System.exit(0);
                }

                default:{
                    System.out.println("Opção inválida");
                    break;
                }
            }
        }
    }
}
