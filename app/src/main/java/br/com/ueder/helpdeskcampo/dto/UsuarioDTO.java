package br.com.ueder.helpdeskcampo.dto;

import java.util.List;

import br.com.ueder.helpdeskcampo.modelo.Usuario;

/**
 * Created by Ueder on 11/12/2017.
 */

public class UsuarioDTO {

    private List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
