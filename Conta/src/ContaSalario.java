public class ContaSalario extends Conta{
    @Override
    public Double getSaldo() {
        return this.saldo;
    }

    public ContaSalario(int numero, int agencia, String banco, double saldo, double valorRetirada, double valorDeposito) {
        super(numero, agencia, banco, saldo, valorRetirada, valorDeposito);
    }

    @Override
    public Boolean sacar(Double valorRetirada) {
        if(getSaldo() > 0) {
            this.saldo -= valorRetirada;
            return true;
        } else{
            System.out.println("Você não pode realizar essa ação");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}
