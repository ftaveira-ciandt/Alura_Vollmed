package med.voll.api.domain.historico;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
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
