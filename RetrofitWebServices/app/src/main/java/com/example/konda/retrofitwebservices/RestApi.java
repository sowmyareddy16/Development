package com.example.konda.retrofitwebservices;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by konda on 3/26/2017.
 */

public interface RestApi {
    @GET("v2/554ae2e2b6a0d88b03d4d85a.json/")
    Call<Details>getAllValues();
}
