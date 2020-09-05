package entidades;

public class FuncionarioTerceirizado extends Funcionario {

    private Double despesaAdicional;

    public FuncionarioTerceirizado(){
    }

    public FuncionarioTerceirizado(String nome, Integer hora, Double valorHora, Double despesaAdicional) {
        super(nome, hora, valorHora);
        despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
