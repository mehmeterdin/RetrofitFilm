package com.example.mehmeterdin.retrofitfilrating;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mehmeterdin on 12.10.2017.
 */

public interface ApiInterface {
    @GET("113v0p")
    Call<Film[]> FilmleriAl();
}
