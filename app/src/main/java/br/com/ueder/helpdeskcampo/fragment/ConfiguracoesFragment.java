package br.com.ueder.helpdeskcampo.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

import br.com.ueder.helpdeskcampo.R;

/**
 * Created by Ueder on 11/12/2017.
 */

public class ConfiguracoesFragment extends PreferenceFragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.configuracoes_fragment);
    }
}
