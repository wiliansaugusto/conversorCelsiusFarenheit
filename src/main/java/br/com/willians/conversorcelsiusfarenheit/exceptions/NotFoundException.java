package br.com.willians.conversorcelsiusfarenheit.exceptions;

import br.com.willians.conversorcelsiusfarenheit.config.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
