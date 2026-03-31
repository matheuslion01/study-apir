package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@RequiredArgsConstructor
public class Produto {
    private final Long id;
    private final String nome;
    private final BigDecimal valor;
    
    
}
