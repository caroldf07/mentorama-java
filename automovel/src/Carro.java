public class Carro {
    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusoPneu;
    private Integer quantidadePortas;
    private Double motor;

    public Carro (Integer quantidadePneus, Integer quantidadePortas, Double motor){
        setQuantidadePneus(quantidadePneus);
        setQuantidadePortas(quantidadePortas);
        setMotor(motor);
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        quantidadeCalotas = quantidadePneus;
        quantidadeParafusoPneu = quantidadePneus;
        this.quantidadePneus = quantidadePneus;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas + 1;
    }

    public Integer getQuantidadeParafusoPneu(){
        return quantidadeParafusoPneu * 4;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public Double getMotor() {
        return motor;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de pneus é: "+ getQuantidadePneus());
        System.out.println("Quantidade de calotas é: "+ getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos é: "+ getQuantidadeParafusoPneu());
        System.out.println("Quantidade de portas é: "+ getQuantidadePortas());
        System.out.println("O motor é: "+ getMotor());
    }

    public void setCor(String cor){
        System.out.println(cor);
    }
}
