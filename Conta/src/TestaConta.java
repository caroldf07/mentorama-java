import java.util.*;
import java.util.stream.Stream;

public class TestaConta {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carol", true, "123", 10);
        Cliente c2 = new Cliente("Carol", true, "123", 100);
        Cliente c3 = new Cliente("Carol", true, "123", 20);
        Cliente c4 = new Cliente("Carol", true, "123", 200);
        Cliente c5 = new Cliente("Carol", true, "123", 30);
        Cliente c6 = new Cliente("Carol", true, "123", 300);
        Cliente c7 = new Cliente("Carol", true, "123", 40);
        Cliente c8 = new Cliente("Carol", true, "123", 400);
        Cliente c9 = new Cliente("Carol", true, "123", 50);
        Cliente c10 = new Cliente("Carol", true, "123", 500);

        List<Cliente> clientes = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);

        Cliente maxCompras= clientes.stream()
                .max(Comparator.comparing(Cliente::getCompras))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxCompras);

        Cliente minCompras= clientes.stream()
                .min(Comparator.comparing(Cliente::getCompras))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(minCompras);

        OptionalDouble avgCompras = clientes.stream()
                .mapToInt(Cliente::getCompras)
                .average();
        System.out.println(avgCompras);
    }
}
