package com.example.api;

import com.example.pojo.Goods;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("category/39?page=1")
    Call<List<Goods>> getGoods();
}
