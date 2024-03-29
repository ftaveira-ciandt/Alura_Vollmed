package med.voll.api.domain.paciente;


import med.voll.api.domain.endereco.Endereco;
import med.voll.api.domain.historico.Historico;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf, Historico historico, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getHistorico(), paciente.getEndereco());
    }

}
