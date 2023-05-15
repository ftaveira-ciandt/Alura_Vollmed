package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.historico.DadosHistorico;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,

        DadosHistorico historico,

        DadosEndereco endereco) {

}
