import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Equipe")
@NamedQuery(name = "Equipe.findByEmpresa", query = "SELECT e FROM Equipe e WHERE e.empresaTerceirizada.id = :empresaId")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "empresa_terceirizada_id", nullable = false)
    private EmpresaTerceirizada empresaTerceirizada;

    @Column(name = "quantidade_funcionarios", nullable = false)
    private int quantidadeFuncionarios;


    public Equipe(Long id, EmpresaTerceirizada empresaTerceirizada, int quantidadeFuncionarios) {
        this.id = id;
        this.empresaTerceirizada = empresaTerceirizada;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Equipe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmpresaTerceirizada getEmpresaTerceirizada() {
        return empresaTerceirizada;
    }

    public void setEmpresaTerceirizada(EmpresaTerceirizada empresaTerceirizada) {
        this.empresaTerceirizada = empresaTerceirizada;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
}