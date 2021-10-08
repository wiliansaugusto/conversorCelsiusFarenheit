package br.com.willians.conversorcelsiusfarenheit.exceptions;

import br.com.willians.conversorcelsiusfarenheit.config.MessageUtils;

public class NullPointerException extends RuntimeException{
    public NullPointerException(){
        super(MessageUtils.DADOS_INCONSISTENTES);
    }
}
