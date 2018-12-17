package com.example.mehmeterdin.retrofitfilrating;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehmeterdin on 12.10.2017.
 */

public class Film {
    @SerializedName("filmAdi")
    @Expose
    public String filmAdi;
    @SerializedName("filmAdiIngilizce")
    @Expose
    public String filmAdiIngilizce;
    @SerializedName("resim")
    @Expose
    public String resim;
    @SerializedName("resimTamEkran")
    @Expose
    public String resimTamEkran;
    @SerializedName("imdbPuani")
    @Expose
    public Float imdbPuani;
    @SerializedName("cikisYili")
    @Expose
    public Integer cikisYili;
    @SerializedName("kategori")
    @Expose
    public List<String> kategori = null;
    @SerializedName("filmKonusu")
    @Expose
    public String filmKonusu;
}
