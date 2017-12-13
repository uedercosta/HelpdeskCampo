package br.com.ueder.helpdeskcampo.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
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
        Cursor cursor = db.rawQuery("SELECT * FROM USUARIOS WHERE LOGIN = ? AND SENHA = ?", args);
        cursor.moveToNext();
        Integer id = cursor.getInt(cursor.getColumnIndex("ID_USUARIO"));
        String password = cursor.getString(cursor.getColumnIndex("SENHA"));
        Integer admin = cursor.getInt(cursor.getColumnIndex("MASTER"));
        Usuario usuario = new Usuario(id, password, admin);
        return usuario;
    }

    public void salvar(Usuario usuario){
        db.beginTransaction();
        try {
            ContentValues cv = new ContentValues();
            cv.put("ID_USUARIO", usuario.getId());
            cv.put("SENHA", usuario.getSenha());
            cv.put("MASTER", usuario.getAdmin());
            db.insert("USUARIOS", null, cv);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }

    public void excluir(){
        db.beginTransaction();
        try {
            db.execSQL("DELETE FROM USUARIOS");
            db.setTransactionSuccessful();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }
}
