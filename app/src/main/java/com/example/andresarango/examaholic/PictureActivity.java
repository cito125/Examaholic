package com.example.andresarango.examaholic;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class PictureActivity extends AppCompatActivity {
    private static final String BASE_URL = "http://jsjrobotics.nyc";
    public static final String KEY_URL = "KEY_URL";
    private boolean doubleBackToExitPressedOnce = false;

    private String URL;
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_activity);
        Intent intent = getIntent();
        URL = intent.getStringExtra(KEY_URL);
        mImageView = (ImageView) findViewById(R.id.key_picture);
        setImage();
    }

    private void setImage() {
        Picasso.with(getApplicationContext())
                .load(BASE_URL + URL)
                .placeholder(R.drawable.nytimes_logo)
                .resizeDimen(R.dimen.nyt_pic_width, R.dimen.nyt_pic_height)
                .centerInside()
                .into(mImageView);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press once more to see list", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


}
