package br.com.ueder.helpdeskcampo.modelo;

/**
 * Created by Ueder on 11/12/2017.
 */

public class Funcionario {

    private Integer id;
    private String nome;
    private Turma turma;
    private Integer numeroRoca;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, Integer numeroRoca) {
        this.id = id;
        this.nome = nome;
        this.numeroRoca = numeroRoca;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public Integer getNumeroRoca() {
        return numeroRoca;
    }

    @Override
    public String toString() {
        return numeroRoca + " - " + nome;
    }
}
