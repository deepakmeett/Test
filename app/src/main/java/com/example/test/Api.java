package com.example.test;
import com.example.test.Data_list.Test;
import com.example.test.Whole_data.Whole;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
public interface Api {

    String Base_url = "http://13.232.226.244:3000/api/v1/";
    //partners/search?company_id=36&status=CONNECTED/ 

    @POST("auth/login")
    Call<Whole> getData(@Body AuthDetail body);

    @GET("partners/search")
    Call<Test> getTestOne(@Header("authorization") String token, @Query("company_id") int company_id, @Query("status") String status);
}
