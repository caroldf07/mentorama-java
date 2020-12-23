public class ContaSalario extends Conta{
    public ContaSalario(int numero, int agencia, String banco, double saldo, double valorRetirada, double valorDeposito) {
        super(numero, agencia, banco, saldo, valorRetirada, valorDeposito);
    }

    @Override
    public Double sacar(Double valorRetirada) {
        if(getSaldo() > 0) {
            return super.sacar(valorRetirada);
        } else{
            System.out.println("Você não pode realizar essa ação");
        }
        return null;
    }

    @Override
    public Double depositar(Double valorDeposito) {
        return super.depositar(valorDeposito);
    }



}
