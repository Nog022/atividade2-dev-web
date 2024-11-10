public class Equipe {
    private String codigo;
    private Terceirizada terceirizadaResponsavel;
    private int quantidadeFuncionarios;

    public Equipe(String codigo, Terceirizada terceirizadaResponsavel, int quantidadeFuncionarios) {
        this.codigo = codigo;
        this.terceirizadaResponsavel = terceirizadaResponsavel;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Terceirizada getTerceirizadaResponsavel() {
        return terceirizadaResponsavel;
    }

    public void setTerceirizadaResponsavel(Terceirizada terceirizadaResponsavel) {
        this.terceirizadaResponsavel = terceirizadaResponsavel;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
}
