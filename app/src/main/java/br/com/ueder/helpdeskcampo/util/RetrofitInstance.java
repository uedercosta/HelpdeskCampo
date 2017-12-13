package br.com.ueder.helpdeskcampo.util;

import android.content.Context;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Ueder on 12/12/2017.
 */

public class RetrofitInstance {

    private static final String URL_BASE = "http://www.goiasa.com.br:8080/ws-ponto/";
    private final Retrofit retrofit;


    public RetrofitInstance(Context ctx) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.addInterceptor(logging).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASE).addConverterFactory(JacksonConverterFactory.create())
                .client(client.build())
                .build();
    }
}
