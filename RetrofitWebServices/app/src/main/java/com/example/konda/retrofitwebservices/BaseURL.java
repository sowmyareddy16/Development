package com.example.konda.retrofitwebservices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by konda on 3/26/2017.
 */

public class BaseURL {
    public static RestApi getApi(){
        Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("http://www.mocky.io/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

        return retrofit.create(RestApi.class);



    }
}
