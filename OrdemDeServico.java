import java.time.LocalDateTime;
import java.util.List;

public class OrdemDeServico {
    private String codigo;
    private List<Cliente> clientesAtendidos;
    private LocalDateTime dataHoraAbertura;
    private LocalDateTime dataHoraEncerramento;
    private Integer codigoPrioridade;

    public OrdemDeServico(String codigo, List<Cliente> clientesAtendidos, LocalDateTime dataHoraAbertura) {
        this.codigo = codigo;
        this.clientesAtendidos = clientesAtendidos;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraEncerramento = null;
        this.codigoPrioridade = calcularPrioridade();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Cliente> getClientesAtendidos() {
        return clientesAtendidos;
    }

    public LocalDateTime getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public LocalDateTime getDataHoraEncerramento() {
        return dataHoraEncerramento;
    }

    public void encerrarOrdem(LocalDateTime dataHoraEncerramento) {
        this.dataHoraEncerramento = dataHoraEncerramento;
    }

    public Integer getCodigoPrioridade() {
        return codigoPrioridade;
    }

    private Integer calcularPrioridade() {
        for (Cliente cliente : clientesAtendidos) {
            if (cliente instanceof ClienteVitais) {
                return ((ClienteVitais) cliente).getCodigoPrioridade();
            }
        }
        return null;  // Sem prioridade específica
    }
}
