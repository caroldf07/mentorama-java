public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(10,023, "123", 100.00,50,0,0);
        System.out.println(c1.sacar(10.00));
    }
}
