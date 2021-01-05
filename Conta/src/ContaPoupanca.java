public class ContaPoupanca extends Conta {

    private Integer diaNiver;
    private Double taxaJuros;

    public Integer getDiaNiver() {
        return diaNiver;
    }

    public void setDiaNiver(Integer diaNiver) {
        this.diaNiver = diaNiver;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double valorRetirada, double valorDeposito, Double taxaJuros) {
        super(numero, agencia, banco, saldo, valorRetirada, valorDeposito);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public Double getSaldo() {
        return  this.saldo += this.saldo * this.taxaJuros;
    }

    @Override
    public Boolean sacar(Double valorRetirada) {
        if(getDiaNiver()%2 != 0){
            this.saldo -= valorRetirada;
            return true;
        } else if(getTaxaJuros() < 0.1){
            this.saldo -= valorRetirada;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + saldo +
                ", diaNiver=" + diaNiver +
                ", taxaJuros=" + taxaJuros +
                '}';
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo()*0.03;
    }
}
