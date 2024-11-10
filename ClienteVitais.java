public class ClienteVitais extends Cliente {
    private int tempoMaximoSemEnergia;
    private int codigoPrioridade;

    public ClienteVitais(String cpf, String nome, String endereco, int tempoMaximoSemEnergia, int codigoPrioridade) {
        super(cpf, nome, endereco);
        this.tempoMaximoSemEnergia = tempoMaximoSemEnergia;
        this.codigoPrioridade = codigoPrioridade;
    }

    public int getTempoMaximoSemEnergia() {
        return tempoMaximoSemEnergia;
    }

    public void setTempoMaximoSemEnergia(int tempoMaximoSemEnergia) {
        this.tempoMaximoSemEnergia = tempoMaximoSemEnergia;
    }

    public int getCodigoPrioridade() {
        return codigoPrioridade;
    }

    public void setCodigoPrioridade(int codigoPrioridade) {
        this.codigoPrioridade = codigoPrioridade;
    }
}