package med.voll.api.historico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Historico {

    private Long idMEdico;

    private Long carteirinhaPaciente;

    private Date horario;

    private String observacoes;

    public Historico(DadosHistorico dados) {
        this.idMEdico = dados.idMEdico();
        this.carteirinhaPaciente = dados.carteirinhaPaciente();
        this.horario = dados.horario();
        this.observacoes = dados.observacoes();

    }

    public void atualizarInformacoes(DadosHistorico dados) {
        if (dados.idMEdico() == null) {
            System.out.println("ID medico não pode estar vazio");;
        }
        if (dados.carteirinhaPaciente() != null) {
            this.carteirinhaPaciente = dados.carteirinhaPaciente();
        }
        if (dados.horario() != null) {
            this.horario = dados.horario();
        }
        if (dados.observacoes() != null) {
            this.observacoes = dados.observacoes();
        }

    }

}
