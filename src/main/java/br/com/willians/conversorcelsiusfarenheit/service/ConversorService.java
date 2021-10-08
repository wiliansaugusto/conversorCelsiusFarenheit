package br.com.willians.conversorcelsiusfarenheit.service;

import br.com.willians.conversorcelsiusfarenheit.DTO.ConversorDTO;
import br.com.willians.conversorcelsiusfarenheit.config.MessageUtils;
import br.com.willians.conversorcelsiusfarenheit.entity.Conversor;
import br.com.willians.conversorcelsiusfarenheit.exceptions.NotFoundException;
import br.com.willians.conversorcelsiusfarenheit.exceptions.NullPointerException;
import br.com.willians.conversorcelsiusfarenheit.mapper.ConversorMapper;
import br.com.willians.conversorcelsiusfarenheit.repository.ConversorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

@Service
public class ConversorService {

    @Autowired
    private  ConversorRepository conversorRepository;
    @Autowired
    private  ConversorMapper conversorMapper ;

/*
    Metodo para calcular e salvar as conversões solicitadas, o calculo é realizado a partir da informação
    do type.
    As Variaveis type e valorInformado não podem ser nulas.
 */
    @Transactional
    public ConversorDTO createConversor(ConversorDTO conversorDTO) throws NullPointerException {
        Conversor conversor = conversorMapper.toEntity(conversorDTO);
            conversorRepository.save(conversor);

        return conversorMapper.toDto(conversor);
    }

/*
    Realiza a busca de todas as conversões realizadas pelo sistema
 */
    @Transactional(readOnly = true)
    public List<ConversorDTO> listAll() {
        return conversorMapper.toDto(conversorRepository.findAll());

    }
    /*
     Busca as conversões informando uma id como paramentro
     */

    @Transactional(readOnly = true)
    public ConversorDTO findById(long id) {
        return conversorRepository.findById(id).map(conversorMapper::toDto).orElseThrow(NotFoundException::new);
    }
}
