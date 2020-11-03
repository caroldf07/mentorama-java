import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class listaDeChamada {
    public static void main(String[] args) {
        Map<String,Integer> listaDeAlunos = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos alunos vocês deseja somar a presença? ");
        int presenca = scan.nextInt();

        while (presenca > 0){
            int total = 0;
            System.out.print("Insira o nome da(o) aluna(o): ");
            String nome = scan.next();
            System.out.print("Essa pessoa compareceu na SEGUNDA? Digite S para sim e N para não: ");
            String dia = scan.next();
            if(dia.equalsIgnoreCase("s")){
                total += 1;
            }

            System.out.print("Essa pessoa compareceu na TERÇA? Digite S para sim e N para não: ");
            dia = scan.next();
            if(dia.equalsIgnoreCase("s")){
                total += 1;
            }

            System.out.print("Essa pessoa compareceu na QUARTA? Digite S para sim e N para não: ");
            dia = scan.next();
            if(dia.equalsIgnoreCase("s")){
                total += 1;
            }

            System.out.print("Essa pessoa compareceu na QUINTA? Digite S para sim e N para não: ");
            dia = scan.next();
            if(dia.equalsIgnoreCase("s")){
                total += 1;
            }

            System.out.print("Essa pessoa compareceu na SEXTA? Digite S para sim e N para não: ");
            dia = scan.next();
            if(dia.equalsIgnoreCase("s")){
                total += 1;
            }

            System.out.print("Essa pessoa compareceu na SÁBADO? Digite S para sim e N para não: ");
            dia = scan.next();
            if(dia.equalsIgnoreCase("s")){
                total += 1;
            }

            listaDeAlunos.put(nome,total);
            presenca--;
        }

        System.out.println(listaDeAlunos);

    }
}
