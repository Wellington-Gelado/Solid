package br.com.alura.services.reajuste;

import br.com.alura.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
     void validar(Funcionario funcionario, BigDecimal aumento);
}
