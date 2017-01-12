package com.example.andresarango.examaholic;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andresarango.examaholic.model.ResponseWrapper;
import com.example.andresarango.examaholic.network.PhotoAPI;
import com.example.andresarango.examaholic.recyclerview.KeyAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by andresarango on 1/11/17.
 */
public class KeyFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private final KeyAdapter mAdapter = new KeyAdapter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_key,container,false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.keylist_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        setAdapterList();
        return rootView;
    }

    private void setAdapterList() {
        PhotoAPI.getInstance().getKeyList().enqueue(new Callback<ResponseWrapper>() {
            @Override
            public void onResponse(Call<ResponseWrapper> call, Response<ResponseWrapper> response) {
                mAdapter.setList(response.body().getAvailableKeys());
            }

            @Override
            public void onFailure(Call<ResponseWrapper> call, Throwable t) {

            }
        });

    }
}
