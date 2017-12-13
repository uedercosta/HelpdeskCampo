package br.com.ueder.helpdeskcampo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import br.com.ueder.helpdeskcampo.fragment.ConfiguracoesFragment;
import br.com.ueder.helpdeskcampo.util.BaseActivity;

public class SplashActivity extends BaseActivity {

    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ctx = SplashActivity.this;
        Handler h1 = new Handler();
        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
                showMessage("Carregando dados...");
                mudarTela(ctx, MainActivity.class, true);
            }
        }, 2000);
    }


}
