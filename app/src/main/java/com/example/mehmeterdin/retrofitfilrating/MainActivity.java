package com.example.mehmeterdin.retrofitfilrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<Film> Filmler = new ArrayList<>();
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView liste = (RecyclerView) findViewById(R.id.liste);
        liste.setLayoutManager(new LinearLayoutManager(this));
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Film[]> call = apiInterface.FilmleriAl();
        call.enqueue(new Callback<Film[]>() {
            @Override
            public void onResponse(Call<Film[]> call, Response<Film[]> response) {
                Filmler = Arrays.asList(response.body());
                adapter = new RecyclerAdapter(Filmler,R.layout.film,getApplicationContext());
                liste.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Film[]> call, Throwable t) {

            }
        });

    }
}
