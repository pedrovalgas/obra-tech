package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String rua;

    private String bairro;

    private String numero;

    private String complemento;

    private String cidade;

    private String cep;

}
