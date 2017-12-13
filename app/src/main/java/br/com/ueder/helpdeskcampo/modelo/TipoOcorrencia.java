package br.com.ueder.helpdeskcampo.modelo;

/**
 * Created by Ueder on 11/12/2017.
 */

public enum TipoOcorrencia {

    FALTA_COLETOR("Falta de Coletor"), PROBLEMA_COLETOR("Problema Coletor"), SEM_CRACHA("Sem crachá");

    private String descricao;

    TipoOcorrencia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
