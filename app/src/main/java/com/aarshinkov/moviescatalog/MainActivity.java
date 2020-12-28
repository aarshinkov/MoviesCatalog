package com.aarshinkov.moviescatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tvMovieHeading = findViewById(R.id.tvMovieHeader);
//        tvMovieHeading.setText("Some text");
//
//        TextView tvMovieInfo = findViewById(R.id.tvMovieInfo);
//        tvMovieInfo.setText("Comedy | 120 min");

//        ImageView movieHeader = findViewById(R.id.imageViewHeader);
//        final String movieHeaderImageUrl = "https://wallpaperaccess.com/full/2071603.jpg";
//        loadImage(movieHeaderImageUrl, movieHeader);

//        ImageView moviePoster = findViewById(R.id.imageViewHeader);
//        final String moviePosterImageUrl = "https://images-na.ssl-images-amazon.com/images/I/91FKuRPgwCL._AC_SL1500_.jpg";
//        loadImage(moviePosterImageUrl, moviePoster);
    }

    private void loadImage(String imgUrl, ImageView imageView) {
        Picasso.get().load(imgUrl).into(imageView);
    }
}