public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    private double saldo;
    private double valorRetirada;
    private double valorDeposito;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public double getValorRetirada() {
        return valorRetirada;
    }

    public void setValorRetirada(double valorRetirada) {
        this.valorRetirada = valorRetirada;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                ", valorRetirada=" + valorRetirada +
                ", valorDeposito=" + valorDeposito +
                '}';
    }

    public Conta(int numero, int agencia, String banco, double saldo, double valorRetirada, double valorDeposito) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
        this.valorRetirada = valorRetirada;
        this.valorDeposito = valorDeposito;
    }

    public Double sacar(Double valorRetirada){
        this.valorRetirada = getValorRetirada();
        return getSaldo() - getValorRetirada();
    }

    public Double depositar(Double valorDeposito){
        this.valorDeposito = getValorDeposito();
        return getSaldo() + getValorDeposito();
    }
}
