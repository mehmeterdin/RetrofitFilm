package com.example.mehmeterdin.retrofitfilrating;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mehmeterdin on 12.10.2017.
 */

public class ApiClient {
    public static final String BASE_URL = "https://api.myjson.com/bins/";
    private static Retrofit retrofit = null ;
    public static Retrofit getClient(){
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
