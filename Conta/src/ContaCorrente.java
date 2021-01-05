
public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double valorRetirada, double valorDeposito, double chequeEspecial) {
        super(numero, agencia, banco, saldo, valorRetirada, valorDeposito);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public Double getSaldo() {
        return this.getChequeEspecial() + this.saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public Boolean sacar(Double valorRetirada) {
         valorRetirada = super.getValorRetirada();
        Double totalSaque = getSaldo() + getChequeEspecial();
        if(valorRetirada <=  totalSaque) {
            this.saldo -= valorRetirada;
            return true;
        } else{
            System.out.println("Você não pode realizar essa ação, valor maior do que limite disponível");
            return false;
        }
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo()*0.05;
    }
}
