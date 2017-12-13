package br.com.ueder.helpdeskcampo.dto;

import java.util.List;

import br.com.ueder.helpdeskcampo.modelo.Funcionario;

/**
 * Created by Ueder on 11/12/2017.
 */

public class FuncionarioDTO {

    private List<Funcionario> funcionarios;

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
