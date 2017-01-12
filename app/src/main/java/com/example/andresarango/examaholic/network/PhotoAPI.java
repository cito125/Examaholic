package com.example.andresarango.examaholic.network;

import com.example.andresarango.examaholic.model.ResponseWrapper;

import retrofit2.Call;

/**
 * Created by andresarango on 1/11/17.
 */

public class PhotoAPI {

    //    http://jsjrobotics.nyc/cgi-bin/1_11_2017_exam.pl
    private static final String BASE_URL = "http://jsjrobotics.nyc/cgi-bin/";
    private static PhotoAPI instance;
    private final PhotoService mPhotoService;

    public static PhotoAPI getInstance(){
        if(instance == null){
            instance = new PhotoAPI();
        }
        return instance;
    }

    private PhotoAPI(){
        mPhotoService = (new NetworkServices()).getJSONService(BASE_URL, PhotoService.class);
    }


    public Call<ResponseWrapper> getKeyList() {
        return mPhotoService.getTheKeys();
    }
}
