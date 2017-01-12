package com.example.andresarango.examaholic.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.andresarango.examaholic.R;
import com.example.andresarango.examaholic.model.Key;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andresarango on 1/11/17.
 */
public class KeyAdapter extends RecyclerView.Adapter<KeyViewHolder>{
    List<Key> keyList = new ArrayList<>();

    @Override
    public KeyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new KeyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.key_view_holder,parent,false));
    }

    @Override
    public void onBindViewHolder(KeyViewHolder holder, int position) {
        holder.bind(keyList.get(position));
    }

    @Override
    public int getItemCount() {
        return keyList.size();
    }

    public void setList(List<Key> availableKeys) {
        keyList.clear();
        keyList.addAll(availableKeys);
        notifyDataSetChanged();
    }
}
