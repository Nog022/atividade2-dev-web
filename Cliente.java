import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cliente")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "is_vital", discriminatorType = DiscriminatorType.BOOLEAN)
@DiscriminatorValue("false")
@NamedQuery(name = "Cliente.findByPriority", query = "SELECT c FROM ClienteVital c WHERE c.codigoPrioridade = :codigoPrioridade")
})
public class Cliente {
    @Id
    @Column(length = 11)
    private String cpf;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 200)
    private String endereco;

    @ManyToOne
    @JoinColumn(name = "cidade_id", nullable = false)
    private Cidade cidade;

    @ManyToMany
    @JoinTable(name = "ClienteOrdemServico",
            joinColumns = @JoinColumn(name = "cliente_cpf"),
            inverseJoinColumns = @JoinColumn(name = "ordem_servico_id"))
    private List<OrdemServico> ordensServico;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.ordensDeServico = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<OrdemDeServico> getOrdensDeServico() {
        return ordensDeServico;
    }

    public void adicionarOrdemDeServico(OrdemDeServico ordemDeServico) {
        this.ordensDeServico.add(ordemDeServico);
    }
}