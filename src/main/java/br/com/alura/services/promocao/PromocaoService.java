package br.com.alura.services.promocao;

import br.com.alura.exceptions.ValidacaoException;
import br.com.alura.model.Cargo;
import br.com.alura.model.Funcionario;

public class PromocaoService {
    public void promover (Funcionario funcionario, Boolean metaAtingida){
        //GERENTE É O CARGO MÁXIMO
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (Boolean.TRUE.equals(metaAtingida)){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else{
            throw new ValidacaoException("Funcionario não atingiu a meta!");
        }
    }
}
