public class Terceirizada {
    private String codigo;
    private String nome;
    private String cidade;
    private int numeroAtendimentosRealizados;

    public Terceirizada(String codigo, String nome, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.numeroAtendimentosRealizados = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroAtendimentosRealizados() {
        return numeroAtendimentosRealizados;
    }

    public void incrementarAtendimentos() {
        this.numeroAtendimentosRealizados++;
    }
}
