package br.com.willians.conversorcelsiusfarenheit.DTO;

import br.com.willians.conversorcelsiusfarenheit.enums.ConversorType;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConversorDTO {

    private Long id;

    @NotNull
    private double valorInformado;

    @NotNull
    private double valorConvertido;

    @Enumerated(EnumType.STRING)
    @NotNull
    private ConversorType type;
}
