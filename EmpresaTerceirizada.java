import javax.persistence.*;

@Entity
@Table(name = "EmpresaTerceirizada")
@NamedQueries({
        @NamedQuery(name = "EmpresaTerceirizada.findByCity", query = "SELECT e FROM EmpresaTerceirizada e WHERE e.cidade.id = :cidadeId"),
        @NamedQuery(name = "EmpresaTerceirizada.findMostActive", query = "SELECT e FROM EmpresaTerceirizada e ORDER BY e.numeroAtendimentos DESC")
})
public class EmpresaTerceirizada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @OneToOne
    @JoinColumn(name = "cidade_id", unique = true, nullable = false)
    private Cidade cidade;

    @Column(name = "numero_atendimentos", nullable = false)
    private int numeroAtendimentos = 0;

    public EmpresaTerceirizada() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getNumeroAtendimentos() {
        return numeroAtendimentos;
    }

    public void setNumeroAtendimentos(int numeroAtendimentos) {
        this.numeroAtendimentos = numeroAtendimentos;
    }
}