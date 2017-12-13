package br.com.ueder.helpdeskcampo.service;

import java.util.List;

import br.com.ueder.helpdeskcampo.dto.UsuarioDTO;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ueder on 12/12/2017.
 */

public interface UsuarioService {

    @GET
    Call<List<UsuarioDTO>> getUsuarios();

}
