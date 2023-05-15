package med.voll.api.medico;

import med.voll.api.endereco.Endereco;
import med.voll.api.historico.Historico;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco, Historico historico) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco(),
             medico.getHistorico());
    }


}
