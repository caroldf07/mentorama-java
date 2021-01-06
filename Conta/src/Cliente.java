public class Cliente {
    private String nome;
    private boolean status;
    private String senha;
    private Integer compras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getCompras() {
        return compras;
    }

    public void setCompras(Integer compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                ", compras=" + compras +
                '}';
    }

    public Cliente(String nome, boolean status, String senha, Integer compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }
}
