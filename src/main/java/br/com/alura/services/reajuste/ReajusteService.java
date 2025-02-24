package br.com.alura.services.reajuste;

import br.com.alura.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;


public class ReajusteService {

    private final List<ValidacaoReajuste> validacoes;

    // RECEBE VALIDACOES NO CONSTRUTOR
    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustaSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        //Tell, don't ask
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}