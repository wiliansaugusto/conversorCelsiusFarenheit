package br.com.willians.conversorcelsiusfarenheit.controller;


import br.com.willians.conversorcelsiusfarenheit.DTO.ConversorDTO;
import br.com.willians.conversorcelsiusfarenheit.enums.ConversorType;
import br.com.willians.conversorcelsiusfarenheit.exceptions.NotFoundException;
import br.com.willians.conversorcelsiusfarenheit.exceptions.NullPointerException;
import br.com.willians.conversorcelsiusfarenheit.service.ConversorService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/conversor")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ConversorController {


    private ConversorService conversorService;


    @GetMapping(value = "/listall", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ConversorDTO> listConvertidos() {
        return conversorService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConversorDTO saveConversoes(@RequestBody @Valid ConversorDTO conversorDTO) throws Exception {
        if (conversorDTO.getType().equals(ConversorType.CELSIUS)){
            conversorDTO.setValorConvertido((conversorDTO.getValorInformado()-32)/1.8);
        }{
            conversorDTO.setValorConvertido((conversorDTO.getValorInformado()*1.8)+32);

        }
        return conversorService.createConversor(conversorDTO);

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<ConversorDTO> findById(@PathVariable long id) {
        return ResponseEntity.ok(conversorService.findById(id));
    }
}