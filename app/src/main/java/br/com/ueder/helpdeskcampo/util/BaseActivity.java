package br.com.ueder.helpdeskcampo.util;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.UUID;

/**
 * Created by Ueder on 11/12/2017.
 */

public class BaseActivity extends AppCompatActivity {

    protected void showMessage(final String msg){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(BaseActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    protected String getUUID(){
        return UUID.randomUUID().toString();
    }

    protected void mudarTela(Context ctx, Class clazz, boolean finaliza) {
        startActivity(new Intent(ctx, clazz));
        if(finaliza)
            finish();
    }



}
