package br.com.ueder.helpdeskcampo.modelo;

/**
 * Created by Ueder on 11/12/2017.
 */

public class Turma {

    private Integer id;
    private String descricao;

    public Turma(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Turma() {
    }

    @Override
    public String toString() {
        return id + " - " + descricao;
    }
}
