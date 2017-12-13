package br.com.ueder.helpdeskcampo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ueder on 11/12/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuario {

    @JsonProperty (value = "matricula")
    private Integer id;
    @JsonProperty (value = "pwd")
    private String senha;
    @JsonProperty (value = "configuracoes")
    private Integer admin;

    public Usuario(Integer id, String senha, Integer admin) {
        this.id = id;
        this.senha = senha;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public Integer getAdmin() {
        return admin;
    }
}
