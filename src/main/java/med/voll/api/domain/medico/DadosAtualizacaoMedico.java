package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;
import med.voll.api.domain.historico.DadosHistorico;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,

        DadosHistorico historico,

        DadosEndereco endereco) {

}
