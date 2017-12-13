package br.com.ueder.helpdeskcampo.modelo;

/**
 * Created by Ueder on 11/12/2017.
 */

public enum TipoRegistro {

    ENTRADA_TRABALHO("Entrada Trabalho"), SAIDA_TRABALHO("Saída Trabalho"), INICIO_DESCANSO("Início Descanso"), TERMINO_DESCANSO("Término Descanso");

    private String descricao;

    TipoRegistro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
