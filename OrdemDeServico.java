@Entity
@Table(name = "OrdemServico")
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora_abertura", nullable = false)
    private Date dataHoraAbertura;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora_encerramento")
    private Date dataHoraEncerramento;

    @ManyToOne
    @JoinColumn(name = "equipe_id", nullable = false)
    private Equipe equipe;

    @Column(name = "codigo_prioridade")
    private Integer codigoPrioridade;

    @ManyToMany(mappedBy = "ordensServico")
    private List<Cliente> clientes;
}
