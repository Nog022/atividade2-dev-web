import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_cliente", discriminatorType = DiscriminatorType.STRING)
@NamedQueries({
    @NamedQuery(name = "Cliente.findByCPF", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByOS", query = "SELECT c FROM Cliente c JOIN c.ordensDeServico o WHERE o.codigo = :codigoOS")
})
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String cpf;
    private String nome;
    private String endereco;
    @ManyToMany(mappedBy = "clientesAtendidos")
    private List<OrdemDeServico> ordensDeServico;

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