package com.example.mehmeterdin.retrofitfilrating;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by mehmeterdin on 13.10.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.FilmYerleskesi> {
    private List<Film> filmler;
    private int siraLayout;
    private Context context;


    @Override
    public RecyclerAdapter.FilmYerleskesi onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(siraLayout,parent,false);
        return new FilmYerleskesi(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.FilmYerleskesi holder, int position) {
        holder.filmBasligi.setText(filmler.get(position).filmAdi);
        holder.filmBasligiIng.setText(filmler.get(position).filmAdiIngilizce);
        holder.filmCikisTarihi.setText(filmler.get(position).cikisYili.toString());
        holder.filmKategorisi.setText(filmler.get(position).cikisYili.toString());
        holder.filmImdbPuanı.setText(filmler.get(position).imdbPuani.toString());
        holder.filmImdbPuaniYildiz.setRating(filmler.get(position).imdbPuani.floatValue());
        Picasso.with(context).load(filmler.get(position).resim).fit().into(holder.filmResmi);
    }

    @Override
    public int getItemCount() {
        return filmler.size();
    }

    public class FilmYerleskesi extends RecyclerView.ViewHolder {
        TextView filmBasligi,filmBasligiIng,filmImdbPuanı,filmKategorisi,filmCikisTarihi;
        ImageView filmResmi;
        RatingBar filmImdbPuaniYildiz;

        public FilmYerleskesi(View itemView) {
            super(itemView);
            filmBasligi = (TextView) itemView.findViewById(R.id.filmAdi);
            filmBasligiIng = (TextView) itemView.findViewById(R.id.filAdiIngilizce);
            filmImdbPuanı = (TextView) itemView.findViewById(R.id.ImdbPuani);
            filmResmi = (ImageView) itemView.findViewById(R.id.filmResmi);
            filmKategorisi = (TextView) itemView.findViewById(R.id.kategori);
            filmCikisTarihi = (TextView) itemView.findViewById(R.id.cikisTarihi);
            filmImdbPuaniYildiz = (RatingBar) itemView.findViewById(R.id.imdbPuaniYildiz);
        }
    }
    public RecyclerAdapter (List<Film> filmler, int siraLayout, Context context){
        this.filmler = filmler;
        this.siraLayout = siraLayout;
        this.context = context;
    }
}
