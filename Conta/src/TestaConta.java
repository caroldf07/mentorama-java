import java.util.Arrays;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(10,23, "123", 100.00,50,0,200);
        ContaSalario c2 = new ContaSalario(11,23, "123", 100.00,0,10);
        ContaPoupanca c3 = new ContaPoupanca(12,23, "123", 1000.00,0,100,0.05);

        List<Conta> conta = Arrays.asList(c1,c2,c3);
        Double saldo = 0.0;
        for (Conta cc:
             conta) {
            saldo += cc.getSaldo();
        }
        System.out.println(saldo);
    }
}
