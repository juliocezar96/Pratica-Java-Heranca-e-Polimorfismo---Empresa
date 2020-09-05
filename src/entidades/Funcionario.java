package entidades;

public class Funcionario {

    private String nome;
    private Integer hora;
    private Double valorHora;

    public Funcionario(){
    }

    public Funcionario(String nome, Integer hora, Double valorHora) {
        this.nome = nome;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double pagamento(){
        return valorHora * hora;
    }
}
