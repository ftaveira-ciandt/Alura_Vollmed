package med.voll.api.domain.historico;


import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DadosHistorico(
        @NotNull
        Long idMEdico,

        @NotNull
        Long carteirinhaPaciente,


        Date horario,

        @Lob
        String observacoes) {



}
