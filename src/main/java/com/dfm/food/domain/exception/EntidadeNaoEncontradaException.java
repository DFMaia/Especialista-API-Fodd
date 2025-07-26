package com.dfm.food.domain.exception;

public class EntidadeNaoEncontradaException extends RuntimeException{

    private final static long serialVersionUID = 1L;

    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }

}
