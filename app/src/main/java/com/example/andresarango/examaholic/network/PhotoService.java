package com.example.andresarango.examaholic.network;

import com.example.andresarango.examaholic.model.ResponseWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andresarango on 1/11/17.
 */

public interface PhotoService {

//    http://jsjrobotics.nyc/cgi-bin/1_11_2017_exam.pl

    @GET("1_11_2017_exam.pl")
    Call<ResponseWrapper> getTheKeys();
}
