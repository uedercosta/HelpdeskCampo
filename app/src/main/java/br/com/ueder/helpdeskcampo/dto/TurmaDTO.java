package br.com.ueder.helpdeskcampo.dto;

import java.util.List;

import br.com.ueder.helpdeskcampo.modelo.Turma;

/**
 * Created by Ueder on 11/12/2017.
 */

public class TurmaDTO {

    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
