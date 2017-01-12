package com.example.andresarango.examaholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.andresarango.examaholic.model.ResponseWrapper;
import com.example.andresarango.examaholic.network.PhotoAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activity_main, new KeyFragment())
                    .commit();
        }
    }
}
