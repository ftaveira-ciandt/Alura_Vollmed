package med.voll.api.endereco;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embedded
@Getter
@NoArgsConstructor
@AllArgsConstructor
public record DadosEnderecoPaciente(String logradouro, String bairro, String cep, String cidade, String uf, String complemento, String numero ) {

}
