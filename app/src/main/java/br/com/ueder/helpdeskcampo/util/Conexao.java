package br.com.ueder.helpdeskcampo.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ueder on 11/12/2017.
 */

public class Conexao extends SQLiteOpenHelper {

    private static final String DB_NOME = "Banco.db";
    private static final int DB_VERSAO = 1;
    private static final String CMD_FUNCIONARIOS = "CREATE TABLE IF NOT EXISTS FUNCIONARIOS (" +
            "ID_FUNCIONARIO VARCHAR(40) NOT NULL PRIMARY KEY, NOME VARCHAR(80), NUM_ROCA INTEGER, ID_TURMA INTEGER NOT NULL);";

    private static final String CMD_TURMAS = "CREATE TABLE IF NOT EXISTS TURMAS (" +
            "ID_TURMA INTEGER NOT NULL PRIMARY KEY, DESCRICAO VARCHAR(40));";

    private static final String CMD_USUARIOS = "CREATE TABLE IF NOT EXISTS USUARIOS(" +
            "ID_USUARIO INTEGER NOT NULL PRIMARY KEY, SENHA VARCHAR(20), MASTER INTEGER DEFAULT 0 NOT NULL);";

    private static final String CMD_EVENTOS = "CREATE TABLE IF NOT EXISTS EVENTOS (" +
            "ID_EVENTO INTEGER NOT NULL PRIMARY KEY, DATA DATETIME, ID_USUARIO INTEGER NOT NULL, CELULAR VARCHAR(20), " +
            "DATA_APONTAMENTO DATETIME, ID_FUNCIONARIO INTEGER NOT NULL, NOME VARCHAR(80), NUM_ROCA INTEGER, " +
            "ID_TURMA INTEGER, TIPO_REGISTRO VARCHAR(20), TIPO_OCORRENCIA VARCHAR(20), ENVIADO INTEGER DEFAULT 0, " +
            "DATA_ENVIO DATE);";


    public Conexao(Context context) {
        super(context, DB_NOME, null, DB_VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CMD_USUARIOS);
        db.execSQL(CMD_FUNCIONARIOS);
        db.execSQL(CMD_TURMAS);
        db.execSQL(CMD_EVENTOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
