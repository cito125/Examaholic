package com.example.andresarango.examaholic.recyclerview;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.andresarango.examaholic.PictureActivity;
import com.example.andresarango.examaholic.model.Key;

/**
 * Created by andresarango on 1/11/17.
 */
public class KeyViewHolder extends RecyclerView.ViewHolder{


    private final TextView mTextView;

    public KeyViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView;
    }



    public void bind(Key key) {
        mTextView.setText(key.getName());
        mTextView.setTextColor(Color.parseColor(key.getTextColor()));
        mTextView.setOnClickListener(onClick(key));
    }

    private View.OnClickListener onClick(final Key key) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(itemView.getContext(), PictureActivity.class);
                intent.putExtra(PictureActivity.KEY_URL, key.getUrl());
                itemView.getContext().startActivity(intent);
            }
        };
    }
}
