public class ContaPoupanca extends Conta{

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

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double valorRetirada, double valorDeposito) {
        super(numero, agencia, banco, saldo, valorRetirada, valorDeposito);
    }

    @Override
    public Double sacar(Double valorRetirada) {
        if(getDiaNiver()%2 != 0){
            return super.sacar(valorRetirada);
        } else if(getTaxaJuros() < 0.1){
            return super.sacar(valorRetirada);
        }

        return null;
    }
}
