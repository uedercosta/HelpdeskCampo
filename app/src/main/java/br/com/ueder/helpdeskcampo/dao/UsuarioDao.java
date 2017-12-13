package br.com.ueder.helpdeskcampo.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.com.ueder.helpdeskcampo.modelo.Usuario;
import br.com.ueder.helpdeskcampo.util.Conexao;

/**
 * Created by Ueder on 12/12/2017.
 */

public class UsuarioDao {

    private static UsuarioDao instance;
    private SQLiteDatabase db;

    protected UsuarioDao(Context ctx) {
        db = new Conexao(ctx).getWritableDatabase();
    }

    public static UsuarioDao getInstance(Context ctx) {
        if (instance == null){
            instance = new UsuarioDao(ctx);
        }
        return instance;
    }

    public Usuario getUsuarioByLoginSenha(String login, String senha){
        String[] args = {login, senha};
        Cursor cursor = db.rawQuery("SELECT * FROM USUARIO WHERE LOGIN = ? AND SENHA = ?", args);
        cursor.moveToNext();
        Integer id = cursor.getInt(cursor.getColumnIndex("ID_USUARIO"));
        String password = cursor.getString(cursor.getColumnIndex("SENHA"));
        Integer admin = cursor.getInt(cursor.getColumnIndex("MASTER"));
        Usuario usuario = new Usuario(id, password, admin);
        return usuario;
    }
}
