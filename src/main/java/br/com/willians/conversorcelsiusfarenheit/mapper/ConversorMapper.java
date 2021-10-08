package br.com.willians.conversorcelsiusfarenheit.mapper;

import br.com.willians.conversorcelsiusfarenheit.DTO.ConversorDTO;
import br.com.willians.conversorcelsiusfarenheit.entity.Conversor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConversorMapper {


    public  Conversor toEntity(ConversorDTO dto) {
        Conversor conversor = new Conversor();
        conversor.setId(dto.getId());
        conversor.setValorConvertido(dto.getValorConvertido());
        conversor.setValorInformado(dto.getValorInformado());
        conversor.setType(dto.getType());
        return conversor;
    }

    public  ConversorDTO toDto(Conversor conversor) {
        ConversorDTO dto = new ConversorDTO();
        dto.setId(conversor.getId());
        dto.setValorConvertido(conversor.getValorConvertido());
        dto.setValorInformado(conversor.getValorInformado());
        dto.setType(conversor.getType());
        return dto;
    }

    public  List<ConversorDTO> toDto(List<Conversor> listStock){
        return listStock.stream().map(this::toDto).collect(Collectors.toList());
    }
}
